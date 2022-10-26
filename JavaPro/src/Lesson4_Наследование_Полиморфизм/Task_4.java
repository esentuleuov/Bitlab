package Lesson4_Наследование_Полиморфизм;

public class Task_4 {
    public static void main(String[] args) {
        Gymnast g1 = new Gymnast("Esen", 21, "Kazakhstan", 178, 75, "Acrobatika");
        Gymnast g2 = new Gymnast("Aman", 21, "USA", 178, 75, "Acrobatika");
        Gymnast g3 = new Gymnast("John", 21, "Hungary", 178, 75, "Acrobatika");

        Footballer f1 = new Footballer("Ronaldo", 37, "Portugal", "Atacker","MU");
        Footballer f2 = new Footballer("Messi", 37, "Argentina", "Atacker","PSG");
        Footballer f3 = new Footballer("Neymar", 37, "Brazil", "Atacker","PSG");

        Swimmer s1 = new Swimmer("Jayson",30,"USA","Butterfly",15);
        Swimmer s2 = new Swimmer("Johny",30,"USA","Butterfly",40);
        Swimmer s3 = new Swimmer("Brad",30,"USA","Butterfly",10);

        Sportsman[] sport = {g1,g2,g3,f1,f2,f3,s1,s2,s3};
        OlympicGames o1 = new OlympicGames("Almaty", 2023,sport);
        o1.play();

    }
}
class OlympicGames{
    protected String city;
    protected int year;
    Sportsman sportsmanList[];

    public OlympicGames(){
    }

    public OlympicGames(String city, int year, Sportsman sportsmanList[]){
        this.city = city;
        this.year = year;
        this.sportsmanList = sportsmanList;
    }

    public void play(){
        System.out.println("city: " + city + ", " + year + "\t");
        for(int i=0; i<sportsmanList.length; i++){
            sportsmanList[i].play();
        }
    }
}

