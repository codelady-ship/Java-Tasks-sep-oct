package tasklar;

import java.util.Scanner;

/*Task 5 - (sandıq kilidi oyunu, çətin):
Sandıq açarı 4 rəqəmli ədəd (kodda əllə təyin edin).
İstifadəçi üçün bu kodu tapmağa menyu ilə imkan verin.
Menyu aşağıdakı kimi olmalıdır:
Daxil etdiyiniz kod: (bu hissəyə istifadəçi rəqəmləri seçdikcə yeni rəqəm düşəcək).
Hazırki rəqəm: 1 (növbəti rəqəmi yığmağa keçdikdə bu ədəd bir vahid artmalıdır, 4 rəqəm var deyə bu ədəd 4-ə kimi (daxil olmaqla) getməlidir).
Aşağıdakılardan birinə basın:
        1 (artır) - (seçilən ədədin bir vahid artırılması yerinə yetirilməlidir. Əgər ədəd 9-a bərabərdirsə, 0 ilə əvəzlənməlidir)
        2 (azalt) - (seçilən ədədin bir vahid azaldılması yerinə yetirilməlidir. Əgər ədəd 0-a bərabərdirsə, 9 ilə əvəzlənməlidir)
        3 (növbəti rəqəmə keç) - (sıradakı növbəti rəqəmi dəyişdirməyə keçməlidir proqram, əgər son (4-cü) rəqəmdə idisə, ekrana müvafiq xəta mesajı çıxmalıdır və heç bir dəyişiklik baş verməməlidir)
        4 (öncəki rəqəmə keç) - (sıradakı öncəki rəqəmi dəyişdirməyə keçməlidir proqram, əgər ilk (1-ci) rəqəmdə idisə, ekrana müvafiq xəta mesajı çıxmalıdır və heç bir dəyişiklik baş verməməlidir)
        0 (kodu yoxla) - İstifadçi tərəfindən seçilmiş rəqəmlərin yaratdığı ədədi kodla müqayisə etməlidir proqram və düzdürsə, uğur mesajı ekrana çıxmalıdır. Səhvdirsə, xəta mesajı çıxmalıdır və proqram sonlanmalıdır.
Proqramın işləmə nümunəsi üçün aşağıdakı videonu izləyə bilərsiniz.*/

public class safe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] correctCode = {0, 2, 1, 4};  // Düzgün kod
        int[] userCode = {0, 0, 0, 0};     // İstifadəçi tərəfindən yığılan kod
        int currentDigit = 0;              // Hal-hazırda dəyişdirilən rəqəm (0-dan başlayır)
       // while true =sonsuz dovr
        while (true) {
            // Kodun son vəziyyəti
            System.out.print("\nDaxil etdiyiniz kod: ");
            for (int digit : userCode) {
                System.out.print(digit);
            }

            System.out.println("\nHazırki rəqəm: " + (currentDigit + 1));
            System.out.println("Aşağıdakılardan birinə basın:");
            System.out.println("1 (artır)");
            System.out.println("2 (azalt)");
            System.out.println("3 (növbəti rəqəmə keç)");
            System.out.println("4 (öncəki rəqəmə keç)");
            System.out.println("0 (kodu yoxla)");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: // artır
                    userCode[currentDigit]++;
                    if (userCode[currentDigit] > 9) {
                        userCode[currentDigit] = 0;
                    }
                    break;

                case 2: // azalt
                    userCode[currentDigit]--;
                    if (userCode[currentDigit] < 0) {
                        userCode[currentDigit] = 9;
                    }
                    break;

                case 3: // növbəti rəqəmə keç
                    if (currentDigit == 3) {
                        System.out.println("❌ Artıq sonuncu (4-cü) rəqəmdəsiniz!");
                    } else {
                        currentDigit++;
                    }
                    break;

                case 4: // əvvəlki rəqəmə keç
                    if (currentDigit == 0) {
                        System.out.println("❌ Artıq birinci rəqəmdəsiniz!");
                    } else {
                        currentDigit--;
                    }
                    break;

                case 0: // kodu yoxla
                    boolean isCorrect = true;
                    for (int i = 0; i < 4; i++) {
                        if (userCode[i] != correctCode[i]) {
                            isCorrect = false;
                            break;
                        }
                    }

                    if (isCorrect) {
                        System.out.println("✅ Təbriklər! Doğru kodu daxil etdiniz!");
                    } else {
                        System.out.print("❌ Səhv kod daxil etdiniz! Doğru kod: ");
                        for (int digit : correctCode) {
                            System.out.print(digit);
                        }
                    }

                    // Proqramı dayandır
                    return;

                default:
                    System.out.println("⚠️ Yanlış seçim! Zəhmət olmasa 0-4 arası seçim edin.");
            }
        }
    }
}

