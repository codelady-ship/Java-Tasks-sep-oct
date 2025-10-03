package Lessons.Lesson15Exceptions.RuntimeExp;
//once aritmetic sonra runtime olmalidir
// subclas sonra parent ,yoxsa parent once gelse subclasi gormeyecek
// ArithmeticException /RuntimeException/Exception
//custom exp - oz yaratdigimiz expdir.onu yaradib extends edirik runtime ye.

//try with resourses-aciq qalan objectleri avtomatik baglayir.
// Closable-i implement edib override edirik  hemin objecti.
// finally de onu writer.close etmeye gerek qalmir

//union catch-bir nece exceptionu birlesdrmek -catch(InvalidNameException | InvalidAgeException e){sout nese}
//errorlar tutmuruq {handle etmirik try/catch} complie time de olur.

public class Main {
    public static void main(String[] args) {
        try (User user = new User()){
            user.setAge(-1);
            user.divideAgeByZero();
        } catch (ArithmeticException e){
            System.out.println("division exception");
        }catch(InvalidNameException e) {
            System.out.println("err" + e.getMessage());
        }catch( RuntimeException e){
            System.out.println("Error exception");
        }catch( Exception e){
                System.out.println("Unknown ");
        }finally{
        System.out.println("Finally");
        }
    }
}
