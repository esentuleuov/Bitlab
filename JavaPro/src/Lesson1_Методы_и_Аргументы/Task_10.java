package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(summa(nums));
    }
    public static int summa(int nums[]){
        int sum = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]%5!=0){
                sum = sum+nums[i];
            }
        }
        return sum;
    }
}
