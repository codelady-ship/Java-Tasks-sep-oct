package tasklar.SentyabrTask.Les20Tasks;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeRunPart {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 45),
                new Employee("Nigar", 32),
                new Employee("Kamran", 68),
                new Employee("Aynur", 50),
                new Employee("Veli", 75)
        );

        System.out.println("Əsas siyahı:");
        employees.forEach(System.out::println);

        Map<String, Integer> sortedMap = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed()) // azalan sıralama
                .collect(Collectors.toMap(
                        Employee::getName,        // key: ad
                        Employee::getAge,         // value: yaş
                        (oldValue, newValue) -> oldValue,  // əgər eyni ad olarsa, birini saxla
                        LinkedHashMap::new        // sıralama qorunsun deyə LinkedHashMap
                ));

        System.out.println("\nYaşa görə azalan sırada: ");
        sortedMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

}
