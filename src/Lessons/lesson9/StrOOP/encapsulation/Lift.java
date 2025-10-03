package Lessons.lesson9.StrOOP.encapsulation;

//OOP
//1.Encapsulation-bir seyi kapsullasdirir ki onu kimse deyismesin private
   //getter ve setter metodu olur bunda ------ctrl+Alt+insert ile
//2.Inheritance - varis alir parenti child.extend edirik.
   // once childe baxr orda varsa goturub @override edir parentinkine
//3.Polymorphism -
//4.Abstraction-

  public class Lift {
    public int capasity = 5;
    public  double  speed = 5.5;
    private int curfloor = 1;



    public int getCurfloor() {
        return curfloor;
    }
    public void setCurfloor(int curfloor) {
        if (curfloor < 0) {
            System.out.println(curfloor + " is last");
            curfloor = 0;
        }
        this.curfloor -= curfloor;

    }

  }
