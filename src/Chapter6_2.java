import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Chapter6_2 {
    public static void main(String[] args) throws Exception{
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,100);
        Date date = calendar.getTime();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat.format(date));
    }
}
