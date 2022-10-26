package Lesson8_Коллекции_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        Players p1 = new Players("Esen", 40000.0,21);
        Players p2 = new Players("Esen", 40000.0,21);
        Players p3 = new Players("Esen", 40000.0,21);
        Players p4 = new Players("Esen", 40000.0,21);
        Players p5 = new Players("Esen", 40000.0,21);
        Players p6 = new Players("Esen", 40000.0,21);
        Players p7 = new Players("Esen", 40000.0,21);
        Players p8 = new Players("Esen", 40000.0,21);
        Players p9 = new Players("Esen", 40000.0,21);
        Players p10 = new Players("Esen", 40000.0,21);

        ArrayList<Players> list = new ArrayList();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);
//        ArrayList list = new ArrayList(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
        double sum = 0;
        int sumage = 0;
        for(int i=0; i<list.size(); i++){
            sum = sum + list.get(i).getPrice();
        }
        for(int i=0; i<list.size(); i++){
            sumage = sumage + list.get(i).getAge();
        }
        System.out.println(sum/ list.size());
        System.out.println(sumage);
    }
}
class Players{
    String name;
    double price;
    int age;

    public Players(){}
    public Players(String name, double price, int age){
        this.name = name;
        this.price = price;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
}
