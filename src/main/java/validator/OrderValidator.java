package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrderValidator implements IValidator{

	@Override
	public boolean validatorPhone(String phone) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			// 13********* ,15********,18*********
			Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");

			Matcher m = p.matcher(phone);
			flag = m.matches();

		} catch (Exception e) {
			flag = false;
		}

		return flag;
	}

	@Override
	public boolean validatorTotalItemNum(int itemTotalNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validatorItemTypeNum(int itemTypeNum) {
		// TODO Auto-generated method stub
		return false;
	}
}
