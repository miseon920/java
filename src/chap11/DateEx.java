package chap11;

import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat df = new SimpleDateFormat("yyyy - MM-dd HH:mm:ss E a");
		System.out.println(df.format(now)); //데이터 포맷은 한번더 거쳐야함
		//E는 요일 a는 오전오후
		
		
		//Calendar cal = Calendar.getInstance(); 
	}
}
