package Constants;

public class Student_new {
    public static void display(){
        System.out.println("Hi from non static method");
    }

    public static void main(String[] args) {
        //we cant call nonstatic method inside a static method we either have to create an object for the class or we have to make the method static
        display();
        Student_new s=new Student_new();
        s.display();
    }
}
