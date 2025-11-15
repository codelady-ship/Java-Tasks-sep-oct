package tasklar.SentyabrTask.Les16Tasks.DateTasks;

import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

/*1. Bu günün tarixini LocalDate olaraq yaradın (proqram həmişə icra olunduğu günü çap etməlidir).
2. Ad gününüzü LocalDate obyektində saxlayın.
3. Ad gününüzə neçə gün qaldığını və neçə yaşınız olacağını ekrana çıxaran proqram yazın.
4. Doğum gününüz həftənin neçənci gününə düşdüyünü ekrana çıxaran proqram yazın.
5. Hazırki ayın son günü həftənin neçənci gününə düşdüyünü ekrana çıxaran proqram yazın.
6. Hazırda Londonda saatın neçə olduğunu ekrana çıxarın.
7. Bu il hər ayın ilk günü həftənin hansı günü olduğunu ekrana çıxaran proqram yazın.*/
public class Main {
    static void main() {
        //1
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        //2
        LocalDate myBirthday = LocalDate.of(1998, 2, 9);
        System.out.println(myBirthday);
        //3
        LocalDate nextBirtday = myBirthday.withYear(today.getYear());
        // bu ilki ad günü keçibsə, next ili götür
        if (nextBirtday.isBefore(ChronoLocalDate.from(today)) && nextBirtday.isEqual(ChronoLocalDate.from(today))) {
            nextBirtday = nextBirtday.plusYears(1);
        }
        long dayDifference = ChronoUnit.DAYS.between(myBirthday, nextBirtday);
        int birth = nextBirtday.getYear() - myBirthday.getYear();
        System.out.println("next birtday is " + nextBirtday);
        System.out.println("birth is " + birth);
        System.out.println("dayDifference is " + dayDifference);

        //4
        DayOfWeek dayOfWeek = myBirthday.getDayOfWeek();
        System.out.println("you birth on " + dayOfWeek);

        //5
        YearMonth thisMonth = YearMonth.from(today);
        LocalDate lastDay = thisMonth.atEndOfMonth();
        System.out.println("Last day of this month (" + lastDay + ") is: " + lastDay.getDayOfWeek());

        //6
        ZonedDateTime londonNow = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("London time now: " + londonNow.toLocalDateTime());

        //7
        int year = today.getYear();
        System.out.println("First weekday of each month in " + year + ":");
        for (int m = 1; m <= 12; m++) {
            YearMonth ym = YearMonth.of(year, m);
            LocalDate first = ym.atDay(1);
            System.out.println(ym.getMonth() + " -> " + first.getDayOfWeek());


        }
    }
}
