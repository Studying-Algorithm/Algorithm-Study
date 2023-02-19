package solve;

import java.time.LocalDate;
import java.time.ZoneId;

public class BJ10699 {
    public static void main(String[] args) {
        // 오늘 날짜
        LocalDate now = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(now);
    }
}
