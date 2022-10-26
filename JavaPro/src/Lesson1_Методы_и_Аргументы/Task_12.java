package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        copy(str);
    }

    public static void copy(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
            System.out.print(str.charAt(i));
        }
    }
}
