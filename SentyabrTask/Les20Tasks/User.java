package tasklar.SentyabrTask.Les20Tasks;

import java.util.*;
import java.util.stream.Collectors;

public class User {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();

        String[] names = {"Asoz1","soz2","soz3","Asoz4","soz4","Asoz1"};
       users.addAll(Arrays.asList(names));

        System.out.println("esas listimiz: "+users);

        List<String> upperCase = users.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\nUpper Case olan listimiz:");
        upperCase.forEach(System.out::println);

   long count = users.stream()
           .filter(s-> s.startsWith ("A"))
           .count();
        System.out.println("\n 'A'ile baslyanlarin sayi: "+count);

}}
