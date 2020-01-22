package util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {

    public String getCurrentFormattedDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        Date date = new Date();
        return formatter.format(date);
    }

    public static String currentDateTime(){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyy");
        LocalDateTime now = LocalDateTime.now();
        return date.format(now);
    }


}
