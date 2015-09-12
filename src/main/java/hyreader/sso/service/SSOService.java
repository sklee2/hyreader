package hyreader.sso.service;

import hyreader.sso.domain.SSOInfo;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * Created by MyiMac on 15. 9. 4..
 */

@Service
public class SSOService {

    public SSOInfo EncryptAuthenticCheck(String id, String pw){
        EzhubUrl ezUrl = new EzhubUrl();

        InputStream temp = ezUrl.EncryptAuthenticCheck("sklee", "hangover14");

        SSOJdomParsing ssoJdomParsing = new SSOJdomParsing();

        SSOInfo ssoInfo=ssoJdomParsing.getSSOInfo(temp);
        return ssoInfo;
    }
}
