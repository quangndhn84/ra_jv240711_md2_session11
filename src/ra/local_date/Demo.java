package ra.local_date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Demo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Ngày hiện tại: " + now);
        LocalDate birthDateOfTeacher = LocalDate.of(1984, 4, 23);
        System.out.println("Sinh nhật giảng viên: " + birthDateOfTeacher);
        LocalDate day = LocalDate.ofYearDay(2024, 100);
        System.out.println("Ngày thứ 100 của năm 2024 là: " + day);
        LocalTime timeNow = LocalTime.now();
        System.out.println("Giờ hiện tại là: " + timeNow);

        LocalDate firstDate = LocalDate.now();
        LocalDate secondDate = LocalDate.of(2022, 4, 30);
        Period period = Period.between(secondDate, firstDate);
        System.out.println("Khoảng cách giữa 2 mốc thời gian: " + period);
        Period periodPlus = period.plusYears(2);
        System.out.println("Tăng thêm 2 năm: " + periodPlus);
        Period periodMinus = periodPlus.minusMonths(10);
        System.out.println("Giảm 10 tháng: " + periodMinus);
    }
}
