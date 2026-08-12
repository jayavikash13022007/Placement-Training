package Classwork;
abstract class Employee{
    private String name;
    private int salary;
    String getName(){return name;}
    void setName(String name){this.name = name;}
    int getSalary(){return salary;}
    void setSalary(int salary){this.salary = salary;}
    abstract void bonus_cal();
    abstract void display_All();
}
class Developer extends Employee{
    String role;
    Developer(String role){this.role = role;}
    void bonus_cal(){System.out.println("Developer bonus = "+getSalary()*0.1);}
    void display_All(){System.out.println("Developer name = "+getName()+"\nDeveloper salary = "+getSalary()+"\nDeveloper role = "+role);}
}
class Manager extends Employee{
    void bonus_cal(){System.out.println("Manager bonus = "+getSalary()*0.2);}
    void display_All(){System.out.println("Manager name = "+getName()+"\nManager salary = "+getSalary());}
}
public class Encapsulation1 {
    public static void main(String args[]){
        Developer d1 = new Developer("Full Stack Developer");
        Developer d2 = new Developer("Mern Stack Developer");
        Manager m1 = new Manager();
        d1.setName("Jayavikash");
        d1.setSalary(50000);
        d2.setName("Varun");
        d2.setSalary(60000);
        m1.setName("Dhyanesh");
        m1.setSalary(70000);
        d1.bonus_cal();
        d1.display_All();
        d2.bonus_cal();
        d2.display_All();
        m1.bonus_cal();
        m1.display_All();
    }
}
