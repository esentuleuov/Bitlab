package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int nums[][] = new int[N][M];
        for(int i=0; i< N; i++){
            for(int j=0; j<M; j++){
                nums[i][j] = in.nextInt();
            }
        }
        max(nums, N, M);
    }

    public static void max(int nums[][], int N, int M){
        int max = 0;
        for(int i=0; i<N; i++){
           for(int j=0; j<M; j++){
               if(nums[i][j]>=max){
                   max = nums[i][j];
               }
           }
            System.out.println(max);
            max = 0;
        }
    }
}
