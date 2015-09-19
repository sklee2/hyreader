package hyreader.security;

import hyreader.sso.domain.SSOInfo;
import hyreader.sso.service.EzhubUrl;
import hyreader.sso.service.SSOJdomParsing;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HYU on 2015-09-19.
 */
public class SSOAuthenticationManager implements AuthenticationManager {
    static final List<GrantedAuthority> AUTHORITIES = new ArrayList<GrantedAuthority>();

    static {
        AUTHORITIES.add(new SimpleGrantedAuthority("ROLE_USER"));

    }

    public Authentication authenticate(Authentication auth) throws AuthenticationException {

        EzhubUrl ezUrl = new EzhubUrl();

        InputStream temp = ezUrl.EncryptAuthenticCheck(auth.getName(), auth.getCredentials().toString());

        SSOJdomParsing ssoJdomParsing = new SSOJdomParsing();

        SSOInfo ssoInfo=ssoJdomParsing.getSSOInfo(temp);
        System.out.println(ssoInfo.getrCode());
        if (ssoInfo.getrCode().equals("200") ) {
            return new UsernamePasswordAuthenticationToken(auth.getName(),
                    auth.getCredentials(), AUTHORITIES);
        }
        throw new BadCredentialsException("Bad Credentials");
    }
}