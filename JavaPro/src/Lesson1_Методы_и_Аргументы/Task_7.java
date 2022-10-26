package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(method(nums, size));
    }

    public static int method(int nums[], int size){
        int sum = 0;
        int count = 0;
        for(int i=0; i<size; i++){
            if(nums[i]%2==0){
                sum = sum+nums[i];
                count++;
            }
        }
        int math = sum/count;
        return math;
    }
}
