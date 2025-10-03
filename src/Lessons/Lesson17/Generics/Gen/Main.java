package Lessons.Lesson17.Generics.Gen;

//raw type -typesiz yazmis olmaq

//wildcard-genericlerin yerine ? qoyuruq sadece bilinmir hansi
public class Main {
    static void main() {
        Account<String, Card,Integer> account= new Account <> ("jon",15,null);
        Account <Integer,Card,Integer> account1= new Account <> (25,15,null);

        Card [] cards = new Card[] {new Card<>()};//type safety
        Account <Integer,Card,Integer> account2= new Account <> (15,15,cards);
        account2.getCard(new Card<> ());
        account2.printCards();

        //printArraya hem array hem card oture bilrem
         account2.printArray(cards);
         account2.printArray(new Integer[]{3,5,8});




    }
}
