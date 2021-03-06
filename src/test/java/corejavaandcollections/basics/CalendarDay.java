package corejavaandcollections.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class CalendarDay {
	private static String getDay(String day, String month, String year) throws ParseException {
		String weekday = null;
		if (Integer.parseInt(year)>2000 & Integer.parseInt(year)<3000) {
			String inputDateStr = String.format("%s/%s/%s", day, month, year);
			Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
			Calendar cal = Calendar.getInstance();
			cal.setTime(inputDate);
			weekday = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();

		}
		return weekday;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        try {
			System.out.println(getDay(day, month, year));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int[] num = new int[5];

    }
}