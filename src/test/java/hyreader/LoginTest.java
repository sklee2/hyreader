package hyreader;

import sso.service.EzhubUrl;

import java.io.InputStream;

/**
 * Created by MyiMac on 15. 9. 4..
 */
public class LoginTest {
    public static void main(String[] args) {
        EzhubUrl ezUrl = new EzhubUrl();

        InputStream temp = ezUrl.EncryptAuthenticCheck("sklee", "hangover14");
        System.out.println(temp);
    }
}
