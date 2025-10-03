package tasklar.SentyabrTask;

import java.util.Scanner;

// İstifadəçidən şifrə istəyin. Əgər bu şifrənin uzunluğu 8-dən aşağı və ya içində boşluq
// simvolu varsa, "Etibarsız şifrə" yazısını ekrana çıxarın və istifadəçidən başqa şifrə daxil
// etməyini istəyin. Əgər şifrə aşağıdakı simvol qruplarından yalnız birini özündə əks
// etdirirsə, "Zəif şifrə" yazısını ekrana çıxarın və başqa şifrə istəyin. Əgər yalnız ikisini
// özündə əks etdirirsə, "Orta şifrə" yazısını ekrana çıxarın və başqa şifrə istəyin.
// Əgər hər üçünü özündə əks etdirərsə, "Güclü şifrə" yazısını ekrana çıxarn və proqramı
// sonlandırın.
// Qrup 1 - böyük və kiçik hərflər
// Qrup 2 - Rəqəmlər
// Qrup 3 - Digər bütün simvollar

/// While break
/// Flag boolean hasLetter = false;
/// forEach- .toCharArray lazimdir

public class PasswordTask {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //false olanda break olsun dayansin
        while (true) {
            System.out.print("Şifrənizi daxil edin: ");
            String password = sc.nextLine();

            if (password.length() < 8 || password.contains(" ")) {
                System.out.println("Etibarsız şifrə.Yenidən cəhd edin.Bosluq olmayan,min 8 simvollu sifre teleb edilir\n");
                continue;
            }

            boolean hasLetter = false;//flag
            boolean hasDigit = false;
            boolean hasSymbol = false;

            // Simvol qruplarını yoxlamaq
            //.toCharArray()-şifrəni simvollara ayırır.ch
            for (char ch : password.toCharArray()) {
                if (Character.isLetter(ch)) {
                    hasLetter = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                } else {
                    hasSymbol = true;
                }
            }

            int count = 0;
            if (hasLetter) {count++;}
            if (hasDigit)  {count++;}
            if (hasSymbol) {count++;}

            //sadece 1ci qrup olsa
            if (count == 1) {
                System.out.println("Zəif şifrə. Yenidən cəhd edin.\n");
            } else if (count == 2) {
                System.out.println("Orta şifrə. Yenidən cəhd edin.\n");
            } else {
                System.out.println("Güclü şifrə! Proqram başa çatdı.");
                break;
            }
        }

        sc.close();
    }
}

