package Lessons.Lesson16DateTime.DateTime;

import java.time.LocalDateTime;
//immutabl rules
//final olmalidr
//fieldler final+private
//deep copy edir getterler kopysin yatarmaldr
// constructor yaratmalidr
//setter olmamalidr.

public class Card {
    public String cardNumber;
    public LocalDateTime expirationDate = null;
    public LocalDateTime createdDate = null;
    public CardType cardType = null;
    public String cardId = "";

    public Card(String number, String id, LocalDateTime now, LocalDateTime localDateTime, CardType visa) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.createdDate = createdDate;
        this.cardType = cardType;
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
   public LocalDateTime getExpirationDate() {
        return expirationDate;
   }
    public CardType getCardType() {
        return cardType;
    }


    public String getId() {
        String idCopy = cardId;
        return idCopy;
    }


   public Card changeCardNumber(String cardNumber) {
       return new Card (
               this.cardId,
               this.cardNumber,
               this.createdDate,
               this.expirationDate,
               this.cardType
       );
   }
}
