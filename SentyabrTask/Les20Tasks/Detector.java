package tasklar.SentyabrTask.Les20Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Detector {
    public static void main(String[] args) {
List<String> list = Arrays.asList("alma", "armud", "alma", "nar", "üzüm", "nar", "nar", "üzüm");
        System.out.println("Esas List: " + list);
        Map<String,Long> say = list.stream()
                .collect(Collectors.groupingBy(
                        s->s,
                        Collectors.counting()));
//burda gruplasdrir ki almadan nece denedir, heresinin oz sayn verir
        System.out.println("Esas qruplar: " + say);

    //azalmani sorted-le reverse edir,her entry ucun compare edir.
        System.out.println("\nTəkrarlanma sayına görə azalan sırada:");

        say.entrySet().stream()
        .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
        .forEach(e-> System.out.println(e.getKey()+ "->" +e.getValue()));
    }
}
