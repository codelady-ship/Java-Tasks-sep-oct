package tasklar.SentyabrTask.Les15Task.PaswordExpTask;

import java.util.Scanner;


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
