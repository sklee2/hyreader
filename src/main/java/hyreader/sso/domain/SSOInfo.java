package hyreader.sso.domain;

public class SSOInfo {

	private String rName;
	private String rMessage;
	private String rCode;
	private String rGaeinNo;
	private String rUserId;
	
	
	public SSOInfo(){}
	
	public SSOInfo(String rName, String rMessage, String rCode,
			String rGaeinNo, String rUserId) {
		super();
		this.rName = rName;
		this.rMessage = rMessage;
		this.rCode = rCode;
		this.rGaeinNo = rGaeinNo;
		this.rUserId = rUserId;
	}

	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getrMessage() {
		return rMessage;
	}
	public void setrMessage(String rMessage) {
		this.rMessage = rMessage;
	}

	public String getrCode() {
		return rCode;
	}
	public void setrCode(String rCode) {
		this.rCode = rCode;
	}

	public String getrGaeinNo() {
		return rGaeinNo;
	}
	public void setrGaeinNo(String rGaeinNo) {
		this.rGaeinNo = rGaeinNo;
	}

	public String getrUserId() {
		return rUserId;
	}
	public void setrUserId(String rUserId) {
		this.rUserId = rUserId;
	}

	@Override
	public String toString() {
		return "SSOInfo [rName=" + rName + ", rMessage=" + rMessage
				+ ", rCode=" + rCode + ", rGaeinNo=" + rGaeinNo + ", rUserId="
				+ rUserId + "]";
	}

}
