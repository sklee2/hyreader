package hyreader;

import hyreader.sso.domain.SSOInfo;
import hyreader.sso.service.EzhubUrl;
import hyreader.sso.service.SSOJdomParsing;

import java.io.InputStream;

/**
 * Created by MyiMac on 15. 9. 4..
 */
public class LoginTest {
    public static void main(String[] args) {
        EzhubUrl ezUrl = new EzhubUrl();

        InputStream temp = ezUrl.EncryptAuthenticCheck("sklee", "hyulib1361");

        SSOJdomParsing ssoJdomParsing = new SSOJdomParsing();

        SSOInfo ssoInfo=ssoJdomParsing.getSSOInfo(temp);

        System.out.println(ssoInfo);
    }
}
