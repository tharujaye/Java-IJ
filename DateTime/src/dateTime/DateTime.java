package dateTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static void main(String []args){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Today's Date: " + dateFormat. format (date));

    }

}
