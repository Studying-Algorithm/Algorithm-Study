import java.text.SimpleDateFormat;
import java.util.Date;
public class BJ10699 {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(d));
    }
}
