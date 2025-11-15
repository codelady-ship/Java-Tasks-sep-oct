package tasklar.SentyabrTask.OOP.Ticket;

public class Ticket {
     public String name;
     public double price;
     public String description;


     public Ticket(String name,double price,String description) {
         this.name=name;
         this.price=price;
         this.description=description;
     }

     public void showInfo() {
         System.out.println("this ticket is :"+this.name);
         System.out.println("this ticket price :"+this.price);
         System.out.println("this ticket about"+this.description);
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
         return description;
    }
    public void setDescription(String description) {
         this.description = description;
    }
}
