package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        maxaandmin(nums);
    }

    public static void maxaandmin(int nums[]){
        int max = 0;
        int min = nums[0];
        for(int i=0; i< nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        for(int i=0; i< nums.length; i++){
            if(nums[i]<min){
                min = nums.length;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
