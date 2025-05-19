package Constants;

public class Main {
    public static void main(String[] args) {
        Human kaustav=new Human(22,"kaustav",10000,false);
        Human rahul=new Human(23,"rahul",10000,false);
        Human kunal=new Human(34,"kuinal",200000,true);
        System.out.println(kaustav.name);
        System.out.println(Human.population);
    }
}
