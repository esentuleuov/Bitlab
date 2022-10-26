package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.next();
    String s2 = in.next();
    auth(s1, s2);
    }

    public static void auth(String s1, String s2){
        String login = "admin";
        String parol = "qwerty";

        if(s1.equals(login) && s2.equals(parol)){
            System.out.println("Authentication completed");
        }
        else{
            System.out.println("Invalid login or password");
        }
    }
}
