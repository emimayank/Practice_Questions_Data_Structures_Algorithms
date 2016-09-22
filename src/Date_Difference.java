import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date_Difference {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String startDate="20-02-2016";
		String endDate="30-04-2016";
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date d1=null;
		java.util.Date d2=null;
		d1=format.parse(startDate);
		d2=format.parse(endDate);
		long diff = d2.getTime() - d1.getTime();
		diff=(diff/1000);
		diff=diff/(60*60);
		diff=diff/24;
		System.out.println(diff);
	}

}
