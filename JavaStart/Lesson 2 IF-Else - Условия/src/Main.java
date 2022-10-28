import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Tutorial If-else
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();
        if(a==10 || a==20) {
            System.out.println("YES");
        }
        System.out.println("Program ended");
         */

        /* Tutorial Switch
        Scanner in = new.Scanner(System.in);
        System.out.println("Insert day");
        int day = in.nextInt();

        switch (day){

            case 1: System.out.println("Monday")   (Case 1 - это Если day = 1)
                break;
            case 5: System.out.println("Friday")
                break;
            case 2: System.out.println("Tuesday")
                break;
            default: System.out.println("ERROR")   (default - если ни под одно из этих условии не попадает то выводитҚ)
         И так мы можем написать все дни недели
         */

        /* Task 1
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
         */

        /* Task 2
          Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>10 && n<20){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
         */

        /* Task 3
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
         */

        /* Task 4
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if( a<=2019 ){
            System.out.println("NO");
        }
        else if( a>=2021){
            System.out.println("YES");
        }
        else if( a==2020 ){
            System.out.println("Error");
        }
         */

        /* Task 5
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a == 1){
            System.out.println("Monday");
        }
        if(a == 2){
            System.out.println("Tuesday");
        }
        if(a == 3){
            System.out.println("Wednesday");
        }
        if(a == 4){
            System.out.println("Thursday");
        }
        if(a == 5){
            System.out.println("Friday");
        }if(a == 6){
            System.out.println("Saturday");
        }else if(a == 7) {
            System.out.println("Sunday");
        }
         */

        /* Task 6
          Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if( a>100 || a<-100 ){
            System.out.println(0);
        }
        else{
            System.out.println(a + 1);
        }
         */

        /* Task 7
         Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a-b==100 || b-a==100){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
         */
        /* Task 8
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b && a>c){
            System.out.println(a);
        }
        if(b>a && b>c){
            System.out.println(b);
        }
        else if(c>a && c>b){
            System.out.println(c);
        }
         */

        /* Task 9
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a<b && a<c){
            System.out.println(a);
        }
        if(b<a && b<c){
            System.out.println(b);
        }
        else if(c<a && c<b){
            System.out.println(c);
        }
        */
        /* Task 10
          Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int e = in.nextInt();
        if(a>b && a>c && a>e && a%2==0){
            System.out.println(a);
        }
        else if(b>a && b>c && b>e && b%2==0){
            System.out.println(b);
        }
        else if(c>a && c>b && c>e && c%2==0){
            System.out.println(c);
        }
        else if(e>a && e>b && e>c && e%2==0){
            System.out.println(e);
        }
        else{
            System.out.println("Not Found");
        }
         */
        /* Task 11
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();
        if(month>=1 && month<=12 && year>=1001 && year <=2000){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
         */

        /* Task 12
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a + b > c && a+c>b && b+c>a ){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
         */

        /* Task 13
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b && a>c && b>c){
            System.out.println(a-c);
        }
        if(a>b && a>c && c>b){
            System.out.println(a-b);
        }
        if(b>a && b>c && a>c){
            System.out.println(b-c);
        }
        if(b>a && b>c && c>a){
            System.out.println(b-a);
        }
        if(c>a && c>b && b>a){
            System.out.println(c-a);
        }
        if(c>a && c>b && a>b){
            System.out.println(c-b);
        }
         */

        /* Task 14
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a==b && a==c && b==c){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        */

        /* Task 15
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if( a==b || a==c || b==c ){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
         */

        /* Task 16
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>10 && b>10 && c>10 && a%5==0 && b%5==0 && c%5==00){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
         */

        /* Task 17
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>20){
            System.out.println(n/6);
        }
        else{
            System.out.println(n*6);
        }
         */

        /* Task 18
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>0){
            System.out.println(n+1);
        }
        else if(n<0){
            System.out.println(n-2);
        }
        else if(n==0){
            System.out.println(10);
        }
         */

        /* Task 19
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a!=b){
            System.out.print(a+b+" ");
            System.out.print(a+b);
        }
        else{
            System.out.print(0+" ");
            System.out.print(0);
        }
         */

        /* Task 20
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>0){
            n++;
            System.out.println(n);
        }
        else{
            System.out.println(n);
        }
         */

























    }
}