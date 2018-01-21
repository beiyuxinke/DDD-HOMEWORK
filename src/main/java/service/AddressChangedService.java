package service;

import order.Order;
import orderEvent.OrderAddressChangedEvent;
import user.User;

/**
 * �������
 *
 */
public class AddressChangedService {
	
	public boolean addressChanged(OrderAddressChangedEvent event,String address) {
		OrderService orderService = new OrderService();
		UserService userService = new UserService();
		Order order = orderService.findOrder(event.getOrderId());		
		order.updateAddress(address);
		
		User user = userService.findUser(event.getUserId());
		user.addUserAddress(address);
		return true;
	}

}
