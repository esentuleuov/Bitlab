package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        word(s1,s2);

    }

    public static void word(String s1, String s2){
        if(s1.contains(s2)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
