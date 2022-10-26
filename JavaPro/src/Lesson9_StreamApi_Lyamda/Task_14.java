package Lesson9_StreamApi_Lyamda;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<n; i++){
            nums.add(in.nextInt());
        }
        long sum = nums.stream().reduce(0,(x,y)->x+y);
        long avg = sum/nums.size();

        nums.stream().filter(s->s>avg).forEach(s-> System.out.print(s + " "));
    }
}
