package Lesson9_StreamApi_Lyamda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<n; i++){
            nums.add(in.nextInt());
        }
        int result = IntStream.range(0, nums.size()).filter(i->i%2==0 && nums.get(i)!=0).reduce(1,(a,b)->a*nums.get(b));
        System.out.println(result);
    }
}
