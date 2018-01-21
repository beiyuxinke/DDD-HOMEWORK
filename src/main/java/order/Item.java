package order;

import java.io.Serializable;
import java.math.BigDecimal;

public class Item implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String itemId;
	private String name;
	private BigDecimal price;
	
	public String getItemId() {
		return itemId;
	}


	public String getName() {
		return name;
	}


	public BigDecimal getPrice() {
		return price;
	}

}
