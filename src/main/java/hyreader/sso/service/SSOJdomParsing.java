package hyreader.sso.service;


import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import hyreader.sso.domain.SSOInfo;

import java.io.IOException;
import java.io.InputStream;


public class SSOJdomParsing {
	
	private SSOInfo ssoInfo = new SSOInfo();
	
	public SSOInfo getSSOInfo(InputStream in){
		try {
			Document doc = new SAXBuilder().build(in);
			
			Element root = doc.getRootElement();			

			Element eCode = root.getChild("code");
			Element eMsg = root.getChild("msg");
			Element eData = root.getChild("data");
			
			Element eName = eData.getChild("name");
			Element eUserId = eData.getChild("userId");
			Element eGaeinNo = eData.getChild("gaeinNo");			
			
			
			/*for(Element name:root.getChildren()){
				System.out.println(name);
				
			}
			*/
			
			ssoInfo.setrCode(eCode.getText());
			ssoInfo.setrGaeinNo(eGaeinNo.getText());
			ssoInfo.setrMessage(eMsg.getText());
			ssoInfo.setrName(eName.getText());
			ssoInfo.setrUserId(eUserId.getText());
			
	     //   System.out.println(ssoInfo.toString());
				
			
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ssoInfo;
	}
	
	
	
}

	