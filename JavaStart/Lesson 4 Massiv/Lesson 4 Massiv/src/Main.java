import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Tutorial:
//        Scanner in = new Scanner(System.in);
//        int nums[] = new int[5];
//        for(int i=0; i<nums.length; i++){
//            nums[i] = in.nextInt();
//        }
//        for(int i=0; i<nums.length; i++){
//            System.out.println(nums[i]+ " "+i);
//        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("Insert size of array: ");
//        int size = in.nextInt();
//        int nums[] = new int[size];
//        for(int i=0; i<nums.length; i++){
//            nums[i] = in.nextInt();
//        }
//        int sum = 0;
//        for(int i=0; i<nums.length; i++){
//            sum = sum + nums[i];
//        }
//        System.out.println(sum);

        /* Task 1
        Scanner in = new Scanner(System.in);
        int nums[] = {6,19,26,9,46,8,5,65,90,25};
        int n = in.nextInt();
        System.out.println(nums[n]);
         */
        /* Task 2
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i<nums.length; i++){
            nums[i] = in.nextInt();
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
         */
        /* Task 3
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for (int i=0; i<nums.length; i++){
            nums[i] = in.nextInt();
            System.out.println(i + " - " + nums[i]);
        }
         */
        /* Task 4
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0) {
                System.out.print(nums[i] + " ");
            }
        }
         */
        /* Task 5
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        for(int i=0; i <nums.length; i++){
            if(nums[i]%2==0){
                System.out.print(nums[i] + " ");
            }
        }
         */
        /* Task 6
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums.length; i++){
            System.out.print(nums[i] * nums[i] + " ");
        }
         */
        /* Task 7
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums.length; i++){
            if(i%2==0){
                System.out.print(nums[i] + " ");
            }
        }
         */
        /* Task 8
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums.length; i++){
            if(i%2!=0){
                System.out.print(nums[i] + " ");
            }
        }
         */
        /* Task 9
          Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        int count = 0;
        for(int i=0; i < nums.length; i++){
            if(nums[i]>0){
                count++;
            }
        }
        System.out.println(count);
         */
        /* Task 10
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        int sum = 0;
        for(int i=0; i < nums.length; i++){
            sum = sum+nums[i];
        }
        System.out.println(sum);
         */
        /* Task 11
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        double sum =0;
        for(int i=0; i< nums.length; i++){
            sum = sum+nums[i];
        }
        System.out.print((int)sum + " " + (sum/ nums.length));
         */
        /* Task 12
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int sum = 0;
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]%2==0){
                sum = sum + nums[i];
                count++;
            }
        }
        System.out.println(sum/count);
         */
        /* Task 13
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        double sum = 0;
        double count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]<0){
                count++;
                sum = sum+nums[i];
            }
        }
        System.out.println(sum/count);
         */
        /* Task 14
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int sum = 0;
        int count = 0;
        int avg;
        for(int i=0; i< nums.length; i++){
                sum = sum + nums[i];
                count++;
            }
        avg = sum/count;
        for(int i=0; i< nums.length; i++){
            if(nums[i]>avg){
                System.out.print(nums[i] + " ");
            }
        }
         */
        /* Task 15
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int my = 1;
        for(int i=0; i< nums.length; i++){
            if(nums[i]!=0){
                my = my * nums[i];
            }
        }
        System.out.println(my);
         */
        /* Task 16
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int k = in.nextInt();
        for(int i=0; i< nums.length; i++){
            if(nums[i]==0){
                continue;
            }
            else if(nums[i]%k==0){
                System.out.print(nums[i] + " ");
            }
        }
         */
        /* Task 17
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int my = 1;
        for(int i=0; i< nums.length; i++){
            if(nums[i]!=0 && i%2==0){
                my = my * nums[i];
            }
        }
        System.out.print(my);
         */
        /* Task 18
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int max = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
         */
        /* Task 19
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int min = nums[0];
        for(int i=0; i< nums.length; i++){
            if(min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println(min*min);
         */
        /* Task 20
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int max = 0;
        int index = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        System.out.println(max + " " + index);
        */
        /* Task 21
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println(min + " " + max);
         */
        /* Task 22
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println(max - min);
         */

        /* Task 23
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        double sum = 0;
        double count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=max && nums[i]!=min){
                sum = sum + nums[i];
                count++;
            }
        }
        System.out.println((int)sum);
        System.out.println((double) (sum/count));
         */

        /* Task 24
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();
        int index;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(m==nums[i]){
                index = i;
                System.out.println("YES");
                System.out.println(index);
            }
            else if (m!=nums[i]){
                count++;
            }
        }
        if(count== nums.length){
            System.out.println("NO");
        }
         */
        /* Task 25
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();
        double sum = 0;
        double count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]>m){
                sum = sum+nums[i];
                count++;
            }
        }
        System.out.println(sum/count);
         */
        /* Task 26
         Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        for(int i=(nums.length-1); i>=0; i--){
            System.out.print(nums[i] + " ");
        }
         */
        /* Task 27
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int max = 0;
        int min = nums[0];

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==min){
                nums[i]=max;
            }
            else if(nums[i]==max) {
                nums[i]=min;
            }
            System.out.print(nums[i]+ " ");
        }
         */
        /* Task 28
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int newnums[] = new int[size];
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]%2==0){
                newnums[count] = nums[i];
                count++;
            }
        }
        for(int i=0; i<count; i++) {
            System.out.print(newnums[i] + " ");
        }
         */
        /* Task 29
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int index1 = 0;
        int index2 = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]==0){
                index1 = i;
                break;
            }
        }
        for(int i= nums.length-1; i>=0; i--){
            if(nums[i]==0){
                index2 = i;
                break;
            }
        }
        int sum=0;
        for(int i=index1; i<=index2; i++){
            sum = sum+nums[i];
        }
        System.out.println(sum);
         */
        /* Task 30
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        boolean pos = true;
        for(int i=0; i<nums.length-1; i++){
            if((nums[i]<0 && nums[i+1]<0) || (nums[i]>0 && nums[i+1]>0)) {
                pos = false;
                break;
            }
        }
        if(pos == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
         */













        }
    }
