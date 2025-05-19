package Constants;

public class Variables {
    static String Schoolname="ABC School";
    String name;
    int age;
    Variables(String studentName,int studentAge){
        name=studentName;
        age=studentAge;
    }
    void display(){
        System.out.println("Name"+name + "age" + age + Schoolname);
    }
    static void ChangeSchoolName(String newSchoolName){
        Schoolname=newSchoolName;
    }
    public static void main(String[] args) {
        Variables.ChangeSchoolName("Ag Church");
        Variables s1=new Variables("Kaustav",12);
        s1.display();
        System.out.println("school name from class"+ " "+ Variables.Schoolname);
    }
}
