package Lesson4_Наследование_Полиморфизм;

public class Task_1_2 {
    public static void main(String[] args) {
        Car c1 = new Car("Car","model",360,2022,2.5);
        Car c2 = new Car("Car","model",400,2021,3.5);
        Car c3 = new Car("Car","model",500,2020,4.7);

        Toyota t1 = new Toyota("Toyota","camry",360,2021,3.5,"Japan");
        Toyota t2 = new Toyota("Toyota","camry",360,2020,2.5,"Europe");
        Toyota t3 = new Toyota("Toyota","camry",360,2022,4.7,"USA");

        Mercedes m1 = new Mercedes("Mercedes","Benz",360,2022,4,"E class");
        Mercedes m2 = new Mercedes("Mercedes","Benz",360,2023,3.5,"S class");
        Mercedes m3 = new Mercedes("Mercedes","Benz",360,2018,5,"M class");

        Car[] cars = {c1,c2,c3,t1,t2,t3,m1,m2,m3};
        for(int i=0; i< cars.length; i++){
            cars[i].ride();
        }
    }
}

class Car{
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;

    public Car(){

    }

    public Car(String name, String model, int maxSpeed, int year, double volume){
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public void ride(){
        System.out.println("Car " + name + ", " + model + ", " + maxSpeed + " km/h " + year + " year, " + volume + " is running");
    }
}

class Toyota extends Car{
    protected String manufacturer;

    public Toyota(){
        super();
    }

    public Toyota(String name, String model, int maxSpeed, int year, double volume,String manufacturer){
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }
    @Override
    public void ride(){
        System.out.println("Car " + name + ", " + model + ", " + maxSpeed + " km/h " + year + " year, " + volume + ", " +manufacturer +   " is running");
    }
}

class Mercedes extends Car{
    protected String classType;

    public Mercedes(){
        super();
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume,String classType){
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    @Override
    public void ride() {
        System.out.println("Car " + name + ", " + model + ", " + maxSpeed + " km/h " + year + " year, " + volume + ", " +classType +   " is running");
    }
}




