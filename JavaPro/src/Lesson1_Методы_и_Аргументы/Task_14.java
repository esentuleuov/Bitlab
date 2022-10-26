package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(method(nums));
    }

    public static int method(int nums[]){
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]!=0){
                count++;
            }
        }
        return count;
    }
}
