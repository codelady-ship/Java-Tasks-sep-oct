package tasklar.SentyabrTask.Lesson1_9;
// 6. İstifadəçidən String alın (nextLine ilə) və bu string-dəki sözlərin
// sayını çıxarın (boşluq olmayan hər şeyi söz kimi saya bilərsiniz).
// Nümunə: "Java is fun!"; Nəticə: 3

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cümlə daxil edin: ");
        String sentence = input.nextLine(); 
        String[] words = sentence.split(" "); // boşluga görə ayır

        int count = 0;
        for (String word : words) {
            if (!word.trim().isEmpty()) { // boş stringləri sayma
                count++;
            }
        }

        System.out.println("Nəticə: " + count);
        //7. 6-dakı aldığınız String-dəki sözləri tərs ardıcıllığa çevirin.
        // Nümunə: "Java is fun!"; Nəticə: "fun! is Java"
        System.out.print("\n Tərs ardıcıllıqla: ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].trim().isEmpty()) {
                System.out.print(words[i] + " ");
            }
        }

        // 8. 6-dakı aldığınız String-in hər bir sözünü tərsinə çevirin.
        // Nümunə: "Java is fun!"; Nəticə: "avaJ si !nuf"
        // 8. Hər sözü tərsinə çevirmək
        StringBuilder reversedWords = new StringBuilder();
        for (String word : words) {
            if (!word.trim().isEmpty()) {
                reversedWords.append(new StringBuilder(word).reverse()).append(" ");
            }
        }
        System.out.println("\n Sözlərin hər biri tərsinə: " + reversedWords.toString().trim());

    }
    
}

