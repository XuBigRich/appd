package tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateConverter extends StrutsTypeConverter {
	private SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		Date tim=null;
		try {
			tim=sdf1.parse(arg1[0]);
		} catch (Exception e) {
			try {
				tim=sdf2.parse(arg1[0]);
			} catch (Exception e2) {
				System.out.println("日期为null");
			}
		}
		return tim;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		Date tim=(Date)arg1;
		return sdf2.format(tim);
	}

}
