package corejavaandcollections.basics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

    public static void main(String[] args) {


//	long ts = 1536206400000L;
//	Date d = new Date(ts);
//	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//	String s = formatter.format(d);
//	System.out.println(s);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate)); //2016/11/16
    }

}