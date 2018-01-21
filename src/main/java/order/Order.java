package order;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import user.ReceiverInfo;
import user.User;
import util.BasicAttributes.PayMethodEnum;
import util.BasicAttributes.StatusEnum;

public class Order {
	private String orderId;
	private ReceiverInfo receiver;
	private StatusEnum status; 
	private Date orderCreateTime;
	private String remark;
	private PayMethodEnum payMethod;
	private BigDecimal totalPrice;
	private User orderOwner;
	private String address;
	
	private Map<Item, Integer> productMap = new HashMap<Item, Integer>();
	
	public Order(ReceiverInfo receiver, User orderOwner,
			Map<Item, Integer> products){
		this.orderId = String.valueOf(UUID.randomUUID());
		this.receiver = receiver;
		this.status = StatusEnum.initialize;
		this.payMethod = PayMethodEnum.alipay;
		this.productMap = products;
		this.orderCreateTime = new Date();
		this.remark = "";
		this.orderOwner = orderOwner;
	}
	
	public BigDecimal getTotalPrice(){
		totalPrice = new BigDecimal("0.0");
		for(Item item : productMap.keySet()){
			totalPrice.add(
					item.getPrice()
					.multiply(new BigDecimal(productMap.get(item))));
		}
		return totalPrice;
	}
	
	public String getOrderId(){
		return orderId;
	}
	
	public boolean updateStatus(StatusEnum status){
		this.status = status;
		return true;
	}
	
	public StatusEnum getOrderStatus(){
		return (StatusEnum) status;
	}
	
	public String getRemark(){
		return remark;
	}
	
	public User getOrderOwner(){
		return orderOwner;
	}

	public boolean changePayMethod(PayMethodEnum payMethod){
		this.payMethod = payMethod;
		return true;
	}
	
	public ReceiverInfo getReceiver() {
		return receiver;
	}

	public Date getCreateTime() {
		return orderCreateTime;
	}

	public PayMethodEnum getPayMethod() {
		return payMethod;
	}

	public Map<Item, Integer> getProducts() {
		return productMap;
	}
	
	public boolean updateAddress(String address){
		this.address = address;
		return true;
	}

	public String getAddress() {
		return address;
	}
	
}
