package Lessons.Lesson22IOStream;

import java.io.*;
import java.util.Scanner;

//input streamlar
//output streamlar

public class Main {
    static void main() throws IOException {

        //Standart streamlar-standart sekilde output-
        // OS  vs java programi arasinda verilenler stream(axin) edir

        //1.Bayt streamlar - datani bayta cevirme -serialization / deserialization
        //2.Character streamlar - datani unikod 16 ile filan cevirib consola verir


        System.err.println();//qirmizi yazr consola
        System.out.println("hello");//out consola yazirdi
        Scanner sc = new Scanner(System.in);//input

        //InputStream isr = new FileInputStream();
        //InputStream oz implementasiya+ var
        //FileInputStream fayli oxuyur
        
OutputStream osr = null;
try {
    osr = new FileOutputStream("example.txt");
    String text ="hello my friend";
    osr.write(text.getBytes());
}catch (FileNotFoundException e) {
    throw new RuntimeException(e);
}catch (IOException e) {
    throw new RuntimeException(e);
}finally {
    osr.close();
}


int data;
        System.out.println("read data from file:");
try{
    InputStream isr = new FileInputStream("example.txt");
    while((data=isr.read()) != -1){ //-1 e catana kimi oxuyr
        System.out.println((char)data);
    }
}catch (FileNotFoundException e) {
    throw new RuntimeException(e);
}












    }
}
