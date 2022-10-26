package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        polindrom(str);
    }

    public static void  polindrom(String str){
        String s1 = "";
        for( int i=str.length()-1; i>=0; i--){
            s1 = s1 + str.charAt(i);
        }

        if(str.equals(s1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
