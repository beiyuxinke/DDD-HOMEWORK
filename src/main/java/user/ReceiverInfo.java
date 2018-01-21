package user;

public class ReceiverInfo {
	private String receiveName;
	
	private String receiveAddr;
	
	private String receivePhone;
	
	public ReceiverInfo(String name, String address, String phone){
		this.receiveName = name;
		this.receiveAddr = address;		
		this.receivePhone = phone;
	}
	
	

	public String getReceiveName() {
		return receiveName;
	}

	public String getReceiveAddr() {
		return receiveAddr;
	}

	public String getReceivePhone() {
		return receivePhone;
	}
}
