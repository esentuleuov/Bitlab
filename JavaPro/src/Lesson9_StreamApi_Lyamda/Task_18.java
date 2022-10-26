package Lesson9_StreamApi_Lyamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<n; i++){
            nums.add(in.nextInt());
        }
        System.out.println(nums.stream().max((x,y)-> x.compareTo(y)).get());
    }
}
