package orderEvent;


public class OrderAddressChangedEvent {

	private String orderId;
	private String userId;
	private String address;
	
	public OrderAddressChangedEvent(String orderId,String userId, String address) {
		this.orderId = orderId;
		this.userId = userId;
		this.address = address;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getUserId() {
		return userId;
	}

	public String getAddress() {
		return address;
	}
	
	
	
}
