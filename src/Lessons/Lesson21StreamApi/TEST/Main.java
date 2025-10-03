package Lessons.Lesson21StreamApi.TEST;

import java.util.EnumMap;
import java.util.EnumSet;

public class Main {
    static void main(String[] args) {
    EnumSet<WeekDays> weekDays = EnumSet.allOf(WeekDays.class);
    weekDays.add(WeekDays.MONDAYS);

    //weekDays.stream() bunu da eyni metodlar istifade edecik streamlarin
        // preformansca enumlarin oz map set istifade yaxsidi

    EnumMap<WeekDays,Integer> map = new EnumMap<WeekDays,Integer>(WeekDays.class);


}
}
