package order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository implements ISaveOrder{

	public OrderRepository(){
		
	}
	
//	public Map getOrderMap(){
//		if(orderMap==)
//	}
	
	public Order findOrder(String orderId){
		if(orderMap.isEmpty()){
			return null;
		}
		return orderMap.get(orderId);
	}
	
	public boolean saveOrder(Order order){
		if(null==order){
			return false;
		}
		
		try{
			orderMap.put(order.getOrderId(), order);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean deleteOrder(String orderId){
		if(!orderMap.containsKey(orderId)){
			return false;
		}
		
		try{
			orderMap.remove(orderId);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	private static volatile Map<String, Order> orderMap = new HashMap<String, Order>();



	@Override
	public void saveOrder() {
		// TODO Auto-generated method stub
		
	}
}
