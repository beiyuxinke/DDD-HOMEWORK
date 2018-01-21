package util;

public class BasicAttributes {
	public static enum StatusEnum{
		initialize,
		paid,
		delivering,
		complete,
		cancelled;
	}
	
	public static enum PayMethodEnum{
		alipay,
		wechat,
		visa,
		cash
	}
}
