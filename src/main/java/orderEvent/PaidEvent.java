package orderEvent;


public class PaidEvent {
	private String billId;
	
	private String orderId;
	
	public PaidEvent(String id, String orderId){
		this.billId = id;
		this.orderId = orderId;
	}

	public String getBillId() {
		return billId;
	}

	public String getOrderId() {
		return orderId;
	}
	
}
