package Lessons.lesson8Enums.wrappers;

public class Main {
    public static void main(String[] args) {
        int value = 5;//boxing
        Integer value2 = 5;//unboxing.cpu ucun cox istifadede uygun deyil ikisindede istifade birin istifade et
        /*Character value3 = 'a';
        Boolean value4 = true;
        String value5 = value2.toString();//Stringe cevirir
        System.out.println(value5);
        int result=value2.compareTo(value);
        *//*1- '>'
        0 - '='
        -1 -"<" olanda verir. if-le deyise bilerik.*//*
        System.out.println(result);*/

        Wrappers.sum(value2, value);//
    }
}
