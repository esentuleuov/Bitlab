package Lesson2_Классы_и_объекты_OOP;

public class Task_6 {
    public static void main(String[] args) {
        Player p1 = new Player(7,"Ronaldo","Cristiano","Napadenie");
        Player p2 = new Player(8,"Esen","Cristiano","Napadenie");
        Player p3 = new Player(9,"Aman","Cristiano","Napadenie");
        Player p4 = new Player(10,"Neymar","Cristiano","Napadenie");
        Player p5 = new Player(11,"Messi","Cristiano","Napadenie");
        Player p6 = new Player(11,"Messi","Cristiano","Napadenie");
        Player p7 = new Player(11,"Messi","Cristiano","Napadenie");
        Player p8 = new Player(11,"Messi","Cristiano","Napadenie");
        Player p9 = new Player(11,"Messi","Cristiano","Napadenie");
        Player p10 = new Player(11,"Messi","Cristiano","Napadenie");

        Player[] players1 = {p1,p2,p3,p4,p5};
        Player[] players2 = {p6,p7,p8,p9,p10};

        Club RM = new Club("Real Madrid", "Spain", 1000, players1);
        Club FCB = new Club("Real Madrid", "Spain", 1000, players2);

//        RM.printClubData();
//        FCB.printClubData();

        Club[] clubs = {RM, FCB};
        for(int i=0; i<clubs.length; i++){
            clubs[i].printClubData();
        }
    }
}

class Player{
    int number;
    String name;
    String surname;
    String position;

    public Player(int number, String name, String surname, String position){
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public Player(){
    }

    public String toString(){
        return ("number: " + number + ", name: " + name + ", surname: " + surname + ", position: " + position);
    }

    }

    class Club{
    String name;
    String country;
    int ratingPoints;
    Player[] players;

    public Club(){
    }

    public Club(String name, String country, int ratingPoints, Player[] players){
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData(){
        System.out.println("club name: "+ name + ", country: " + country + ", rating = " + ratingPoints);
        for(int i=0; i<players.length; i++){
            System.out.println("\t" + players[i]);
        }
    }

    }

