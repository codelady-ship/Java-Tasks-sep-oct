/*public class Lesson3 {
    public static void main(String[] args) {
        int tryCount =0;
        final int  maxCount=3;
        boolean isLogin =true;
        String validCode="2000";
        
        do{
            System.out.println("enter code");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            
            if(input.equals(validCode)){
                System.out.println("succes");
                break;
            }
            tryCount++;
            if(tryCount== maxCount){
                isLogin=false;
                System.out.println("user bloked for 15 min");
            }
        }
        while(isLogin){
            
        }
        System.out.println();
    }
    
}*/
/*public  class Loop {
    public static void main(String[] args) {
        for (int i=0; i<=10; i+=2){
            System.out.println("value"+i);
        }
    }
}*/
/*public   class Lesson3 {
    public static void main(String[] args) {

        int given= 100;
        for (int i=0; i<=given; i+=2){
            if(i%2 == 0){
                System.out.println("even value"+i);
                continue;
                /*break olanda 1 ciden dayanr*/
        /*    }
            System.out.println("odd"+i);
        }
    }*/
    //3cu olmaza 0  verir, 2 ci olmasa infiniti loop


/* task-leap il-400 bolunsun ,ve ya 4 e bolunub 100e bolunmesin
2 eded il daxil edin bu iller arasndaki her bir ilin gunleri cemini tapin ekrana cxarin
 */

/*public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ili daxil edin: ");
        int startYear = scanner.nextInt();

        System.out.print("İkinci ili daxil edin: ");
        int endYear = scanner.nextInt();

        int totalDays = 0;

        if(startYear>endYear) {
            startYear ^= endYear;
            endYear ^= startYear;
            startYear ^= endYear;
        }
        for (int year = startYear; year <= endYear; year++) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        System.out.println("İllər arasındakı ümumi gün sayı: " + totalDays);
    }
}
*/

/*public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ili daxil edin: ");
        int startYear = scanner.nextInt();

        System.out.print("İkinci ili daxil edin: ");
        int endYear = scanner.nextInt();

        int totalDays = 0;

        for (int year = startYear; year <= endYear; year++) {

            boolean isLeap = false; // flag təyin edilir

            if (year % 400 == 0) {
                isLeap = true;
            } else if (year % 4 == 0 && year % 100 != 0) {
                isLeap = true;
            }

            if (isLeap) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        System.out.println("İllər arasındakı ümumi gün sayı: " + totalDays);
    }
}
*/
/*istifadeci eded daxil edir.1 den baslayib hemin edede kimi her tam ededin 2 qatni ekrana cixarin.*/
/*public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int number = scanner.nextInt();

        int total;

        for (int i = 1; i < number; i++) {
            total=i*2;
            System.out.println( i+ "-ikiqati-" + total);
        }
    }
}*/

