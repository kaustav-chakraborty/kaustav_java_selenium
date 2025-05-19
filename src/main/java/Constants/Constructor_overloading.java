package Constants;
class Student_constructor{
    String name;
    int age;

    Student_constructor(){
        this("unknown",0);
        System.out.println("default constructor");
    }
    Student_constructor(String name){
        this(name,25);
        System.out.println("1-arg constructor");
    }
    Student_constructor(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("2-arg constructor");
    }
    void printInfo() {
        System.out.println(name + " is " + age + " years old");
    }


}

public class Constructor_overloading {
    public static void main(String[] args) {
        Student_constructor s1=new Student_constructor();
        Student_constructor s2=new Student_constructor("kaustav");
        Student_constructor s3=new Student_constructor("kaustav",56);
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}
