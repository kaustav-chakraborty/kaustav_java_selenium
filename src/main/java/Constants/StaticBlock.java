package Constants;
//this is a demo to show initialize a static variable
public class StaticBlock {
    static  int a=4;
    static int b;
    //will only run once , when first object is created i.e when a class is called for the first time
    static {
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b+=3;
        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);
    }


}
