package Lessons.Lesson18Colllection;

import java.util.ArrayList;
import java.util.LinkedList;
// hem array hem linked list List i implements edir
import java.util.List;
import java.util.Vector;

//ArrayList arrayin wrapper clasidir.indexliyir elementleri.elementleri search da yaxsidir.
//<int> yox <Integer> goturur generic kimi.

//capacity-def-10 olur.lenght gelib 10 a catirsa yari bolur artir yarisi qeder.
//-50yazsaq -IllegalArgumentException
public class Main {
    static void main() {
        List<Integer> arrlist = new ArrayList<>(50);
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        System.out.println(arrlist.size());//lenght
        System.out.println(arrlist.getFirst());//1ci elmnt
        System.out.println(arrlist.getLast());//son elmt
        System.out.println(arrlist.get(2));//index
        System.out.println(arrlist.contains(4));// varmi-true/false verir
        System.out.println(arrlist.indexOf(1));//varsa 0 yoxdursa -1 verir
        System.out.println(arrlist.remove(1));//index-i remove edir, etdiyi deyeri de geri verir mes
        //IndexOutOfBoundsException olmayan indexi remove edende.
        //System.out.println(arrlist.remove(new Integer (1));// remove(new Integer) resize edib-evvele dasiyir.

//LinkedList - elementler bir-birine.add/remove islerinde yaxsidir.Hemde Queue kimi davranir.
//first node (prew) -node (item) -last node(next)
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll.size());
        System.out.println(ll.remove());//mecburdu elementlerin uzerinden kecsin
        System.out.println(ll.getLast());
        System.out.println(ll.peek());//en ustde olani verir
        System.out.println(ll.pop());//en uste olani silir stack kimi.list bos -NoSuchElement
        System.out.println(ll.poll());//en uste olani silir Queue kimi.list bos olanda null.
        //System.out.println(ll.push(2));//add elemt queue kimi


//Vector - evvel array idi deyisib.Sychorizeddir.
// <object-User> cemi users
        // Vector<User> users = new Vector<>();
        Vector <Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.ensureCapacity(100);
        // add edendde,100 e catanda birdefelik yene 100 artirsin grow etmesin












    }
}
