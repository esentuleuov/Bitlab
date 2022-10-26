package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        triangle(a, b, c);
    }

    public static void triangle(int a, int b, int c) { // Если нет что возвращать при помощи "return", тогда надо написать "void"
        if (a+b>c && b+c>a && c+a>b) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
