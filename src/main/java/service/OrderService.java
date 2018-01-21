package service;

import order.Order;
import order.OrderRepository;
import orderEvent.OrderAddressChangedEvent;
import orderEvent.PaidEvent;
import util.BasicAttributes.StatusEnum;

public class OrderService {
	
	OrderRepository orp = new OrderRepository();
	
	public boolean getPaid(PaidEvent event){
		String payId = event.getBillId();
		String orderId = event.getOrderId();
		Order order = orp.findOrder(orderId);
		order.updateStatus(StatusEnum.paid);
//		orp.saveBill(payId);
		
		return true;
	}
	
	public boolean removeOrder(Order order){
		orp.deleteOrder(order.getOrderId());
		return true;
	}
	
	public Order findOrder (String orderId){		
		return orp.findOrder(orderId);
	}
	
	public boolean updateOrderAddress(OrderAddressChangedEvent event){
		String address = event.getAddress();
		String orderId = event.getOrderId();
		Order order = orp.findOrder(orderId);
		order.updateAddress(address);		
		return true;
	}

	


}
