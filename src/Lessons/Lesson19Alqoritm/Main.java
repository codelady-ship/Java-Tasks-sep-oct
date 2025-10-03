package Lessons.Lesson19Alqoritm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    static void main() {
        //stack extends Vectordan.lifo s=data structorda istf edilir.
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.pop());//axrincini silir,hemde verir-2 ni yeni
        System.out.println(stack.size());//size icinde qlani verecek 1i qalir

        //Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        System.out.println(queue.poll());//1 i gotrecek
        System.out.println(queue.size());











    }
}
