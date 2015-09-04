package hyreader;

import sso.domain.SSOInfo;
import sso.service.EzhubUrl;
import sso.service.SSOJdomParsing;

import java.io.InputStream;

/**
 * Created by MyiMac on 15. 9. 4..
 */
public class LoginTest {
    public static void main(String[] args) {
        EzhubUrl ezUrl = new EzhubUrl();

        InputStream temp = ezUrl.EncryptAuthenticCheck("sklee", "hangover14");

        SSOJdomParsing ssoJdomParsing = new SSOJdomParsing();

        SSOInfo ssoInfo=ssoJdomParsing.getSSOInfo(temp);

        System.out.println(ssoInfo);
    }
}
