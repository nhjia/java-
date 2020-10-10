import java.sql.Date;	
import java.text.Format;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Calendartest {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
public static void main(String[] args) {
	Calendar a =Calendar.getInstance();
	java.util.Date now = new java.util.Date();
	a.setTime(now);
	a.add(Calendar.MONTH, 1);
	a.add(Calendar.DAY_OF_MONTH, -3);
	System.out.println("下个月倒数第三天是："+format(a.getTime()));
}
private static String format(java.util.Date date) {
    return sdf.format(date);
}
}
