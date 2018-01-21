package Bill;

import java.math.BigDecimal;

import util.BasicAttributes.PayMethodEnum;

public class Bill {
	private String billId;
	private BigDecimal totalPrice;
	private  PayMethodEnum payMethod;
	
	public Bill(String billId, BigDecimal price,PayMethodEnum method ){
		this.billId = billId;
		this.totalPrice = price;
		this.payMethod = method;
	}
	
	public String getBillId() {
		return billId;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public PayMethodEnum getPayMethod() {
		return payMethod;
	}

}
