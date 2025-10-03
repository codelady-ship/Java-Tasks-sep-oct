package Lessons.Lesson15Exceptions.IOExp;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
public class FileUtil implements Closeable {
    public static void write(String text){
        try (FileWriter fw =new FileWriter("hello.txt");){
            fw.write(text);
            //try with resourses olanda ehtiyac yoxdu close etmeye
            //fw.close();//important to close data flashed
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
           // throw new RuntimeException(e);
            System.out.println("Error writing to the file."+e.getMessage());
        }finally {
            System.out.println("Successfully closed the file.");
        }


    }

    @Override
    public void close() throws IOException {

    }
}
