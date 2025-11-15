package tasklar.SentyabrTask.Les15Task.PaswordExpTask;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sirfenizi daxil edin: ");
        String password = sc.nextLine();
        try{
          PasswordTask.checkPasword(password);
        }catch(
                EmptyPasswordException |
                TooShortPasswordException |
                NoCapitalLetterException |
                NoRegularLetterException |
                NoDigitException |
                NoSpecialCharacterException e
        ){
            System.out.println("❌eta: " + e.getMessage());
        }
    }
}
