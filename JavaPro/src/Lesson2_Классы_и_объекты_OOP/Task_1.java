package Lesson2_Классы_и_объекты_OOP;

public class Task_1 {
    public static void main(String[] args) {
        Phone h1 = new Phone("Iphone","XR",1000);
        h1.getData();
    }
}

class Phone {
    String name;
    String model;
    int price;

    public Phone(){
        this.name = "No name";
        this.model = "no module";
        this.price = 0;
    }

    public  Phone(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public void getData(){
        System.out.println("Name: " + name + ", Model: " + model + ", Price: " + price);
    }
}
