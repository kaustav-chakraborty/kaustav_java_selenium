package Constants;

public class Human {
    //uptill married all these are instance variables
    int age;
    String name;
    int salary;
    boolean married;
    //properties which are not really related to the objects but are common properties for all the other objects of the class
    static long population;
    static void message(){
        System.out.println("greetings from static");
    }
    public Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.married=married;
        this.name=name;
        this.salary=salary;
        Human.population+=1;
        Human.message();

    }
}

