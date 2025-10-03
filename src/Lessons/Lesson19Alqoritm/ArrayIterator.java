package Lessons.Lesson19Alqoritm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayIterator {
    static void main() {
        List<String> list = new ArrayList<>();
         list.add("1");
         list.add("2");
         list.add("3");
          /*for(String el: list){
            System.out.println(el);
        }*/
        list.clear();//listi silir
        Iterator<String> itratr=list.iterator();
        while(itratr.hasNext()){
        itratr.remove();//silir
        System.out.println(itratr.next());
        //next varsa capa ver,
        //next deyende cursor qoyur novbeti elmentin uzerine

//Graflar yerleri isareleyir-nodlar .bu nod+dan birinden o birine gedende en yaxin yolu-edge+i hesablayib tapir

//bidirectional-bir istiqametli yollar-eks geri gelmir yeni getdiyi yolu
//depth-first traversal-dfs
//breast-first-1ci genislik-yaxin yollardan gedirlerse-bfs




        }








    }
}
