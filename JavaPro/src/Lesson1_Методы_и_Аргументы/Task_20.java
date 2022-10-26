package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        season(a);
    }

    public static void season(int a){
        if(a==12 || a==1 || a==2){
            System.out.println("Winter");
        }
        else if(a==3 || a==4 || a==5){
            System.out.println("Spring");
        }
        else if(a==6 || a==7 || a==8){
            System.out.println("Summer");
        }
        else if (a==9 || a==10 || a==11) {
            System.out.println("Autumn");
        }
    }
}
