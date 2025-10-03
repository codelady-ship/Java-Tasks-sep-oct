package Lessons.Lesson16DateTime.DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
   public static void main() {
        Card card= new Card(
                "1",
                "4169738815481254",
                LocalDateTime.now(),
                LocalDateTime.now().plusYears(3),
                CardType.VISA);
        card=card.changeCardNumber("4169738856564545");
       System.out.println(card.getCardNumber());


       // LocalTime time = LocalTime.now();//bu sadece time verir
//        card.setId("1");
//        card.setCardNumber("4169738815481254");
//        card.setCreatedDate(LocalDateTime.now());
//       // card.setExpirationDate(LocalDateTime.of(2028,5,5));//bitme tarixi
//       card.setExpirationDate(LocalDateTime.now().plusYears(3));
//       card.setCardType(CardType.VISA);






       System.out.println(Instant.now().toString());//qrinvice baxr
       //System.out.println(Instant.now().atZone(ZoneId.systemDefault().toLocalDateTime()));
       System.out.println(card);

       Date date = new Date();
       System.out.println(date);

       String dateString = "2025-09-02T19:02:30.456325";
       //System.out.println(LocalDate.parse(dateString.toString()));
       //duz olmadi strng DateTimeParseException atr

       //fotmat vere bilrik.
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       System.out.println(LocalDateTime.parse(dateString, formatter));

       // cart vaxti bitib elave etmek
      /*if (LocalDateTime.now().isBefore(card.getExpirationDate())) {
          System.out.println("succes");
      }*/

      /*if(card.getExpirationDate().isAfter(LocalDateTime.now())) {
           System.out.println("succes");
      }*/

      LocalDateTime now = LocalDateTime.now();//immutable classes
       now.plusDays(1);//immutable classes
      now = now.plusDays(1);//mutable olur deyere menimsetdk
       System.out.println(now);


       //period
       LocalDate from = LocalDate.now();
       LocalDate to = LocalDate.now().plusDays(1);
       Period period = Period.between(from, to);
       System.out.println(period.getDays());

       //chronoUnit-
       //LocalDateTime.now().plusYears(3, ChronoUnit.YEARS),


   }
}