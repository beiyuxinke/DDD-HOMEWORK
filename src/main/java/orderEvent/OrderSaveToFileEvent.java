package orderEvent;

public class OrderSaveToFileEvent {
	
	private String orderId;
	
	public OrderSaveToFileEvent(String id){
		this.orderId = id;
	}

	public String getOrderId() {
		return orderId;
	}
	
}
