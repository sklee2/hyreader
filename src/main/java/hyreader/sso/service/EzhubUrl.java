/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hyreader.sso.service;

import ezhub.crypt.RSA;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author infoh
 */
public class EzhubUrl { 

    public InputStream EncryptAuthenticCheck(String id, String password) {

//    	String message = "";
        Random random = new Random();
        String num = String.valueOf( random.nextInt(3) + 1);
        InputStream in = null;
        String keySuffix = "library_00" + num;
//        System.setProperty("CATALINA_HOME", "./");
//        System.setProperty("jeus.home", "$CATALINA_HOME");
// 다음이 중요   또는 Run Configurations에서:::: -Djeus.home="C:\sts-bundle\apache-tomcat-8.0.24"
        //VMOptions   -Djeus.home="/Users/MyiMac/IdeaProjects/hyreader/libs"
//        System.setProperty("jeus.home", "./");
        try {
            String loginGb = "1";
            String systemGb = "LIBRARY";
            String encryptId = RSA.encrypt(keySuffix, id);
            String encyptPassword = RSA.encrypt(keySuffix, password);
//            message = encryptId+encyptPassword;
            URL url = new URL("https://portal.hanyang.ac.kr/sso/lgnp.do");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);

            PrintWriter out = new PrintWriter(conn.getOutputStream());
            StringBuffer sb = new StringBuffer("loginGb=" + loginGb);
            sb.append("&systemGb=" + URLEncoder.encode(systemGb, "euc-kr"));
            sb.append("&userId=" + encryptId);
            sb.append("&password=" + encyptPassword);            
            sb.append("&keyNm=" + URLEncoder.encode(keySuffix, "euc-kr"));
            out.write(sb.toString());
            System.out.println(sb);
            out.flush();
            out.close();

            
 /*           BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String sResponse;
            while ((sResponse = br.readLine()) != null) {
                message = message + sResponse + "\n";
            }
            br.close();*/
            in = conn.getInputStream();

        } catch (MalformedURLException ex) {
            Logger.getLogger(EzhubUrl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EzhubUrl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(EzhubUrl.class.getName()).log(Level.SEVERE, null, ex);
        }
//        return message;
        return in;
    
    }

}
