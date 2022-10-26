package Lesson1_Методы_и_Аргументы;

import java.util.Scanner;
public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[][] = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = in.nextInt();
            }
        }

        arr = method(arr, N);
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] method(int arr[][], int N){
        for(int j=0; j<N; j++){
            int first = arr[0][j];
            arr[0][j] = arr[N-1][j];
            arr[N-1][j] = first;
        }
        return arr;
    }
}


