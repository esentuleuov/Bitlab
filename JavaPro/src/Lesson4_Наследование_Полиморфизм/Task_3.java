package Lesson4_Наследование_Полиморфизм;

public class Task_3 {
    public static void main(String[] args) {

    }
}

class Sportsman{
    protected String fullName;
    protected int age;
    protected String country;

    public Sportsman(){

    }

    public Sportsman(String fullName, int age, String country){
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public void play(){
        System.out.println("Name: " + fullName + ", " + age + ", " + country + " is playing");
    }
}

class Gymnast extends Sportsman{
    protected int height;
    protected int weight;
    protected String style;

    public Gymnast(){
        super();
    }

    public Gymnast(String fullName, int age, String country, int height, int weight, String style){
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    @Override
    public void play(){
        System.out.println("Name: " + fullName + ", " + age + ", " + country + ", " + height + ", " + weight + ", " + style +  " is playing");
    }
}

class Footballer extends Sportsman{
    protected String position;
    protected String club;

    public Footballer(){
        super();
    }

    public Footballer(String fullName, int age, String country, String position, String club){
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    @Override
    public void play() {
        System.out.println("Name: " + fullName + ", " + age + ", " + country + ", " + position + ", " + club + " is playing");
    }
}

class Swimmer extends Sportsman{
    protected String style;
    protected double recordTime;

    public Swimmer(){
        super();
    }
    public Swimmer(String fullName, int age, String country, String style, double recordTime){
        super(fullName, age, country);
        this.style =style;
        this.recordTime = recordTime;
    }

    @Override
    public void play() {
        System.out.println("Name: " + fullName + ", " + age + ", " + country + ", " + style + ", " + recordTime + " is playing");
    }
}


