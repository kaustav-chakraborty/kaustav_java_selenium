package Constants;

public class New_java_class {
    public static void main(String[] args){
        System.out.println("new class");
        Integer [] rno=new Integer[5];
        String[] name=new String[5];
        Float [] marks=new Float[5];
        Student kaustav=new Student();
//        Student random=new Student();
//
//        kaustav.marks=55.5f;
//        kaustav.name="kaustav";
//        System.out.println(kaustav.marks);
//        System.out.println(kaustav.name);
//        System.out.println(random.marks);
    }
}

class Student{
    float marks=90f;
    String name;
    int rno;
    void Student1(){
        this.rno=13;
        this.marks=88.5f;
        this.name="kaustav";
    }
////    Student(int roll,String name,float marks){
////        this.rno=roll;
////        this.name=name;
////        this.marks=marks;
////        System.out.println("I am inside  constructor with arguments");
//
//
//    }
    //this is how you call a constructor from another constructor
//    Student(){
//        System.out.println("I am inside default constructor");
//
//        this(19,"kaustav 2",99.5f);
//    }
}
