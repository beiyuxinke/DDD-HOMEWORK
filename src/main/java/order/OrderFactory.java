package order;

import java.util.Map;

import user.ReceiverInfo;
import user.User;
import validator.IValidator;

public class OrderFactory {

	public Order createOrder(ReceiverInfo receiver, User orderOwner, 
			Map<Item, Integer> products, IValidator validator){
		if(!validator.validatorPhone(receiver.getReceivePhone())){
			System.out.println("illegal phone.");
			return null;
		}
		
		int totalNum = 0;
		for(int num : products.values()){
			totalNum += num;
		}
		if(!validator.validatorTotalItemNum(totalNum)){
			System.out.println("illegal totalnum.");
			return null;
		}
		
		Order order = new Order(receiver, orderOwner, products);
		return order;
	}
}
