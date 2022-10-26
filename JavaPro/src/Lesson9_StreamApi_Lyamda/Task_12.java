package Lesson9_StreamApi_Lyamda;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<n; i++){
            nums.add(in.nextInt());
        }
        System.out.print(nums.stream().filter(s->s%2==0).reduce(0,(x,y)->x+y) + " ");
    }
}
