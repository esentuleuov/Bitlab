package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        even(number);
    }
    public static void even(int number){
        if(number%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
