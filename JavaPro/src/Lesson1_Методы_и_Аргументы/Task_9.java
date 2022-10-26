package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        oddNumbers(nums);
    }

    public static void oddNumbers(int nums[]){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 23){
                break;
            }
           if(nums[i]%2!=0) {
               System.out.print(nums[i] + " ");
           }

        }
    }

}
