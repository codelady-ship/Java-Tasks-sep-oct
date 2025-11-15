package tasklar;
// 1.---------------------------------------------------------------------------------
// iki ədəd alın istifadəçidən və hansının böyük
// hansının kiçik və ya bərabər olduğunu olduğunu göstərin.
// 2. 3 ədədi böyümə ardıcıllığı ilə yazın.
// 3.-----------------------------------------------------------------------------------
// Verilən ədədə əsasən həftənin hansı günü olduğunu çap edən
// proqram yazın.
// 4. İstifadəçi ay nömrəsini (məsələn 11) daxil edir.Həmin ayda neçə gün olduğunu çap edin (leap il nəzərə almayın.)
// 5.---------------------------------------------------------------------------------
// İstifadəçidən ədəd alın.
// Ədədin rəqəmlərinin sayını tapın və çap edin.
// Ədəddə olan sıfırların sayını tapın və çap edin.
// 6.-----------------------------------------------------------------------------------
// İstifadəçidən ay və il alın və indiki tarixdən həmin
// tarixədək neçə ay olduğunu hesablayın (indiki ayı nəzərə almayın)
// məsələn, 12/04/2026 - cavab 8 ay.
// 7.-----------------------------------------------------------------------------------
// 5 təsadüfi (özünüz yazın) təsadüfi ədəddən ibarət massiv yaradın.
// Bu massivdəki ədədlərin cəmini ekrana çıxarın.
// Bu massivdəki ədədlərin hasilini ekrana çıxarın.
// Əgər massivdə 0 varsa, onu 7.3-dəki vurmada istifadə etməyin.
// 7.1-dəki massivdə olan ən böyük və ən kiçik ədədlərin fərqi və cəminin hasilini tapın.
// 8.-------------------------------------------------------------------------------------
// Counter adlı class yaradın.
// Counter classı üçün constructor yazın (String value) parametrini götürsün
// və yaratdığı obyektdə saxlasın.
// Counter class-ının obyektlərində olan value dəyərini ekrana çıxaran printValue methodunu yazın.
// Counter class-ının neçə dəfə obyekti yaradıldığını ekrana çıxaran printCount methodu yazın.
// 9.------------------------------------------------------------------------------------
// Product adlı class yaradın (içində productName, expirationYear, expirationMonth
// və expirationDay saxlanılmalıdır).
// Bu class-ın 10 ədəd obyektini yaradın (özünüzdən təsadüfi məlumatlar ötürün)
// və bunları bir massivə yığın.
// İstifadəçi tərəfindən verilən gün, ay, və ilə əsasən məhsulun etibarlı olub-olmadığını
// bildirən (boolean qaytaran hasExpired) methodunu yazın. Əgər etibarlılıq müddəti bitibsə,
// true qaytarır, bitməyibsə, false.
// 9.2-də yaradılmış massivdəki hər bir məhsul üçün onun adını və etibarlı olanların
// nə vaxtadək etibarlı olduğunu, keçənlərin isə müddət keçdiyini ekrana çıxarın.
// 10.-------------------------------------------------------------------------------------
// RegistrationForm adlı class yaradın.
// Class özündə name, surname, phoneNumber və email saxlamalıdır.
// İstifadəçiyə bu formu doldurmaq imkanı verin.
// RegistrationForm class-ının obyektləri üçün respond adlı method yaradın,
// hansı ki String tipində istifadəçinin daxil etdiyi məlumatları qaytaracaq (bir String)
//--------------------------------------------------------------------------------------------
public class Task {
    public static void main(String[] args) {
        //task1
        /*CompareThreeNumbers task1 = new CompareThreeNumbers();
        task1.run();*/
        //task2
        /* Weekday task2 = new Weekday();
        task2.work();*/
        //task3
        /*MonthDay task3 = new MonthDay();
        task3.run();*/
        //task4
       /*NumbersTask5 n = new NumbersTask5();
       n.run();*/
       //task6
       /* MonthTask6 monthTask6 = new MonthTask6();
        monthTask6.run();*/
        //task7
       /* ArrayTask7 arrayTask7 = new ArrayTask7();
        arrayTask7.run();*/
        //task8
        CounterTask8 counterTask8 = new CounterTask8();
        counterTask8.run();




    }
}





