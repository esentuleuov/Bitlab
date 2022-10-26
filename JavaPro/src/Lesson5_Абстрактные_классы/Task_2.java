package Lesson5_Абстрактные_классы;

public class Task_2 {
    public static void main(String[] args) {
        SphereGold s1 = new SphereGold(2.5);
        SphereGold s2 = new SphereGold(2.0);
        SphereGold s3 = new SphereGold(2.7);

        CubeGold c1 = new CubeGold(3.0);
        CubeGold c2 = new CubeGold(5.0);
        CubeGold c3 = new CubeGold(8.0);

        GoldShape goldShapes[] = {s1,s2,s3,c1,c2,c3};
        for(int i=0; i< goldShapes.length; i++){
            System.out.println(goldShapes[i].getPrice());
        }
    }
}

abstract class GoldShape{
    abstract double getVolume();
    public double getPrice(){
        return getVolume()*250 + 1200;
    }
}
class SphereGold extends GoldShape{
    double radius;
    public SphereGold(){
        super();
    }
    public SphereGold(double radius){
        this.radius = radius;
    }
    @Override
    public double getVolume() {
        return (4/3)*3.14*radius*radius*radius;
    }
}

class CubeGold extends GoldShape{
    double side;
    public CubeGold(){
        super();
    }
    public CubeGold(double side){
        this.side = side;
    }

    public double getVolume(){
        return side*side*side;
    }

}
