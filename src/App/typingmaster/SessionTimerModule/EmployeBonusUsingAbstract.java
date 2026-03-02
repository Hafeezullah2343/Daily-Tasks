package App.typingmaster.SessionTimerModule;

abstract class Employee{
    String name;
    double salary;
    Employee(String name ,  double salary){
        this.name = name;
        this.salary = salary;
    }
    void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    abstract double calculateBonus();
}

class Developer extends Employee{
    Developer(String name,double salary){
        super(name,salary);
    }
    @Override
    double calculateBonus() {
        return salary*0.10;
    }
}

class Manager extends Employee{
    Manager(String name,double salary){
        super(name,salary);
    }

    @Override
    double calculateBonus() {
        return salary*0.20;
    }
}

public class EmployeBonusUsingAbstract {

    public static void main(String[] args) {
        Employee e1 = new Developer("Daniel",50000);
        Employee e2 = new Manager("Daniel",50000);

        e1.showDetails();
        System.out.println("Total Bonus: " + e1.calculateBonus());
        e2.showDetails();
        System.out.println("Total Bonus: " + e2.calculateBonus());


    }
}