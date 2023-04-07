package util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class DateManager {
	
	static {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));	
	}
	
	public static String getDateForBoard(Timestamp ts) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		return sdf.format(ts).toString();
	}
	
	
	
	
	
}
