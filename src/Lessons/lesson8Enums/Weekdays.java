/*
package lesson8Enums;

public enum Weekdays {
    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6),
    SUNDAY("Sunday",7),
    INVALID ("ENTER 1-7",-1);

   String mesage;
   int weekday;

   Weekdays(String mesage,int weekday){
       this.mesage=mesage;
        this.weekday=weekday;
   }
   public static Weekdays getWeekday(int day) {
       int[] arr = new int[]{};               //enumun massivi
       Weekdays[] values = Weekdays.values();//enumun massivi verir

       for (Weekdays week : values) {
           if (week.weekday == day) {
               return week;
           }
       }
       //return null;//olmasa yeni ,default nece olsun, bu null pointer exception vere biler
       return INVALID;
   }

   public static int getWeekday(Weekdays weekday) {
       Weekdays[] value = Weekdays.values();
       for (Weekdays week : value) {
           if (week == weekday) {
               return week.weekday;
           }
       }
       return INVALID.weekday;
   }
}

*/
