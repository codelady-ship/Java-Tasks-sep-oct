package Lessons.Lesson17.Generics.Optional;

import java.util.Optional;

//nulPointer exp ni tutmaq ucun- optional istf edirk isPresent
public class Main {
    static void main() {
     CardServis cardServis = new CardServis();
        Optional<Card> optional = cardServis.getCard(true);
        if (optional.isPresent()) {
            Card card = optional.get();
            System.out.println(card.number);
        }else{
            System.out.println("no card found");
        }

    }
}
