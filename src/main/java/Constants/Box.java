package Constants;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    //cube
    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    Box(Box old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;
    }
}
