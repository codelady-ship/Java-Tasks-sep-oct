package Lessons.Lesson22IOStream;

import java.io.*;

public class CharacterStrm {
    static void main() throws IOException {

        FileWriter fileWriter= null;
        try {

            //path - 2 cur olur
            //1.absolute-lap 0-dan OS deki yeri
            //2.relative -oldugu fayl yolu


            fileWriter = new FileWriter("example.txt");//(new File (passName:"url")
            String text ="hello my friend";
            fileWriter.write(text);
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileWriter.close();
        }


        int data;
        System.out.println("read data from file:");
        try{
           FileReader fileReader = new FileReader("example1.txt");
            while((data = fileReader.read()) != -1){ //-1 e catana kimi oxuyr
                System.out.println((char)data);
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



















    }
}
