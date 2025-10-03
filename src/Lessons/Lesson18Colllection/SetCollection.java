package Lessons.Lesson18Colllection;

import java.util.*;

//Set unik olur her elementden 1 eded olur 2ci olnda dublikati goturmur.
//HashSet - de elementler bucketler olur.hashcoda gore alir hash
// hash /16(default) ya qalan qaligin yerine hemin elementi qoyur.
public class SetCollection {
    static void main() {
   /*Set<String > set = new HashSet<>();//ext AbstrctSet impl Set
    set.add("Jon");
    set.add("Tom");
    set.add("Lora");
    set.add("Ben");*/
   /*for(String s : set){
        System.out.println(s);
   }*/

   Set<User> users = new HashSet<>();//ext AbstrctSet impl Set
        users.add(new User("Jon",12));
        users.add(new User("Tom",15));
        users.add(new User("Tomi",13));

        System.out.println(users);//veya usere toStringi override ede bilerik.
        //hash collision- eyni qaliga gelib cixir element.toggusur.bu zaman linked list yaradir.
        //User clasdaki hash override = hash function.

        //hash function rules:
        //-fixed:eyni  objecte eyni hash code qaytarmalidir.
        //-efficiency: cox sureli islmlidir.
        //-uniformity: unic olmaldr
        //-preimage resistance:hash func -> hash value vermelidir

//treeSet-tree alqoritm saxlayr.Sort edir
        Set<String> users2 = new TreeSet<>();
        users2.add("Jon");
        users2.add("Tom");
        users2.add("Tomi");

//LinkedHashSet - elmentleri link kimi baglyr.
        Set<String> users3 = new LinkedHashSet<>();
        users3.add("Jon");
        users3.add("Tom");
        users3.add("Tomi");


//Map-> key -value pairs.keye gore value alacq.key vacibdir valueler eyni ola biler
        //bucet sayi
        // load factor= 0.75% dolanda baket 2qat artrir.her defe artda bolunen eded de deyisir deye
        // modulusu tezeden relocate edir.ona gore initial capasiti basdan vermek yaxsidi.
        Map<String, User> users4 = new HashMap<>();
        users4.put("Jon",new User("Jon",12));//add edir.
        users4.put("Tom",new User("Tomi",15));
        users4.put("Tomi",new User("Tom",13));
        System.out.println(users4.get(2));
        //forda.values deyib onu
        for (User key : users4.values()) {
            System.out.println(key);
        }
        for (String key : users4.keySet()) {
            System.out.println(users4.get(key)+"-"+key);
        }
//HashMap -colleasion lari yoxlayir dublikat varsa silir
//valuelari equalsla yoxlayir deye onlari biryerde @override edirik


    }
}
