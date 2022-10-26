package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.toLowerCase();
        char a = in.next().toLowerCase().charAt(0);
        System.out.println(counter(str, a));
    }
    public static int counter(String str, char a){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == a ){
                count++;
            }
        }
        return count;
    }
}
