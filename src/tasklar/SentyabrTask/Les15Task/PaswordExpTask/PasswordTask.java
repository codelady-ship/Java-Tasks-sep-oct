package tasklar.SentyabrTask.Les15Task.PaswordExpTask;

import java.util.Scanner;

/*
3.1. İstifadəçidən şifrə istəyin.
3.2. Bu şifrənin çətinlik səviyyəsini yoxlayan bir static method yazın.
3.3. Method-dan gələ biləcək xətaları handle edin və onlara uyğun mesajları ekrana çıxarın.
3.4. Bu method aşağıdakı bütün halları düzgün formada emal etməlidir:
3.5. Şifrə boş String-dirsə, EmptyPasswordException qayıtmalıdır.
3.6. Şifrənin uzunluğu 8-dən aşağıdırsa, TooShortPasswordException qayıtmalıdır.
3.7. Əgər şifrədə böyük hərf yoxdursa, NoCapitalLetterException qayıtmalıdır.
3.8. Əgər şifrədə kiçik hərf yoxdursa, NoRegularLetterException qayıtmalıdır.
3.9. Əgər şifrədə rəqəm yoxdursa, NoDigitException qayıtmalıdır.
Əgər şifrədə xüsusi simvol yoxdursa (yuxarıda sadalanan simvollardan başqa hər hansısa biri),
NoSpecialCharacterException qayıtmalıdır.
*/
public class PasswordTask {
    public static void checkPasword(String password) throws
        EmptyPasswordException,
        TooShortPasswordException,
        NoCapitalLetterException,
        NoRegularLetterException,
        NoDigitException,
        NoSpecialCharacterException
        {

            if (password == null || password.trim().isEmpty()) {
                throw new EmptyPasswordException("Şifrə boş ola bilməz.");
            }

            if (password.length() < 8) {
                throw new TooShortPasswordException("Şifrə ən azı 8 simvol olmalıdır.");
            }

            if (!password.matches(".*[A-Z].*")) {
                throw new NoCapitalLetterException("Şifrədə ən azı bir böyük hərf olmalıdır.");
            }

            if (!password.matches(".*[a-z].*")) {
                throw new NoRegularLetterException("Şifrədə ən azı bir kiçik hərf olmalıdır.");
            }

            if (!password.matches(".*\\d.*")) {
                throw new NoDigitException("Şifrədə ən azı bir rəqəm olmalıdır.");
            }

            if (!password.matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~.-].*")) {
                throw new NoSpecialCharacterException("Şifrədə ən azı bir xüsusi simvol olmalıdır.");
            }

            System.out.println("✅ Şifrə uğurla qəbul edildi. Güclü şifrədir.");
        }

}
