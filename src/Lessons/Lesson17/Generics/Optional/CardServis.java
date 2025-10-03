package Lessons.Lesson17.Generics.Optional;

import java.util.Optional;

public class CardServis {
   /* public Card getCard() {
        if (true) {
            return new Card();
        }
        return  null;
    }*/

    public Optional<Card> getCard(boolean flag) {
        if(flag){
            return Optional.of(new Card());
        }
        return Optional.empty();
    }
}
