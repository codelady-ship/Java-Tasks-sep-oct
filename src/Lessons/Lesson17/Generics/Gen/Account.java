package Lessons.Lesson17.Generics.Gen;
//<T>-type diamond operator
//ya string, yada number otre bilerk mainde

//making generic
//making type safety
//type erasure - runtimeda javanin ozu typeleri silib string int yazir
//< icerisinde ardicilliga baxmaq vacibdir >

//optinal-null un
public class Account <T , O, I > {
    private T name;
    private I age;
    private O [] cards;

    public Account(T name,I age, O[] cards) {
        this.name = name;
        this.age = age;
        this.cards = cards;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
    public I getAge() {
        return age;
    }
    public void setAge(I age) {
        this.age = age;
    }

    public void printCards(){
        for (Object card : cards) {
            Card<T> c = (Card<T>) card;
            System.out.println(c.number);
        }
    }

    //metodda da istifade ede bilirik
    public static  <A> void printArray(A[] a){
        for (A element : a){
            System.out.println(element+"");
        }
    }
    //wildcard yeni ? ile evez etme
    //upper bound -neki extends edir
    //<? super Card > -neki card in child clasidr
    public Card <? extends Number> getCard (){
        if(true){
        return new Card<Long>();
    }else{return new Card<Integer>();
        }
}

    public void getCard(O tCard) {
    }
}
