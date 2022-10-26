package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i< numbers.length; i++){
            numbers[i] = in.nextInt();
        }
        uniqueElements(numbers);
    }

    public static void uniqueElements(int [] numbers){
        boolean flag = true;
        for(int i=0; i< numbers.length; i++){
            for(int j=0; j< numbers.length; j++){
                if(i!=j && numbers[i] == numbers[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
