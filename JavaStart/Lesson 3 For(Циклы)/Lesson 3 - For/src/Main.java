
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Tutorial - While, For, DO
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while (a < 10) {
            System.out.println(a);
            a++;
        }*/

        /*for(int i = 0; i < 10; i++){
            System.out.println(i);
        }*/

////        Scanner in = new Scanner(System.in);
////        int n = in.nextInt();
//////        int i = 1;
//////        while (i<=n){
//////            System.out.println(i);
//////            i++;
//////        }
////        for( int i = 1; i<=n; i++){
////            System.out.println(i);
//        }
            /* Task 1
            Scanner in = new Scanner(System.in);
            int i = 1;
            while (i<=10){
                System.out.println("Hello, WORLD");
                i++;
            }
             */
            /* Task 2
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            for (int i=1; i<=10; i++){
                System.out.print(a + " ");
            }
             */
            /* Task 3
            Scanner in = new Scanner(System.in);
            String S = in.next();
            int n = in.nextInt();

            for(int i=1; i<=n; i++){
                System.out.println(S);
            }
             */
            /* Task 4
              Scanner in = new Scanner(System.in);
           int n = in.nextInt();

           for(int i = 1; i<=n; i++){
               System.out.print(i+" ");
           }
            */
            /* Task 5
             Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();

            for( int i = n; i<=m; i++){
                System.out.print(i+ " ");
            }
             */
            /* Task 6
              Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for( int i=0; i<=n; i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
             */
            /* Task 7
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for( int i=0; i<=n; i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
             */
            /* Task 8
             Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();

            for(int i=n; i<=m; i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
             */
            /* Task 9
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();

            for(int i=n; i<=m; i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
             */
            /* Task 10
             Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();

            for(int i=n; i<=m; i++){
                if(i%3==0){
                    System.out.print(i+" ");
                }
            }
             */
            /* Task 11
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for( int i=1; i<=n; i++){
                if(n%i==0){
                    System.out.print(i+" ");
                }
            }
\             */
            /* Task 12
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            for( int i=1; i<=N; i++){
                    System.out.print(i+" ");
                    System.out.println(i*i);
                }
             */
        /* Task 13
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum+i;
        }
        System.out.print(sum);
         */
        /* Task 14
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;

        for (int i = n; i <= m; i++) {
            sum = sum+i;
        }
        System.out.print(sum);
         */
        /* Task 15
         Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();
        int m = in.nextInt();

        for(int i=n; i<=m; i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
         */
        /* Task 16
         Scanner in = new Scanner(System.in);
        int count = 0;
        int n = in.nextInt();
        int m = in.nextInt();

        for(int i=n; i<=m; i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);
         */
        /* Task 17
        Scanner in = new Scanner(System.in);
        int k = 1;
        int sum = 0;
        int n = in.nextInt();
        for(int i=1; i<n; i++){
                k = k+2;
            sum = sum+k;
            }
        System.out.println(sum+1);
         */
        /* Task 18
        Scanner in = new Scanner(System.in);
        int k = 0;
        int sum = 0;
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            k = k+3;
            sum = sum+k;
        }
        System.out.println(sum);
         */
        /* Task 20
        Scanner in = new Scanner(System.in);
        int count=0;
        int n = in.nextInt();
        while(n!=0){
            n = in.nextInt();
            count = count+1;
            if(n==0){
                System.out.println(count);
            }
        }
         */
        /* Task 21
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true){
           int n = in.nextInt();
            sum = sum+n ;
            if(n==0){`
                System.out.println(sum);
                break;
            }
        }
         */
        /* Task 22
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true){
            int n = in.nextInt();
            sum = sum+n ;
            count++;
            if(n==0){
                System.out.println(sum/(count-1));
                break;
            }
        }
         */
        /* Task 23
         Scanner in = new Scanner(System.in);
        int mx = 0;
        while(true) {
           int n = in.nextInt();
           if( n>mx){
               mx = n;
           }
            if(n==0){
                System.out.println(mx);
                break;
            }
        }
         */
        /* Task 24
          Scanner in = new Scanner(System.in);
        int my = 1;
        int n = in.nextInt();
        for(int i=1; i<=n; i++ ){
            my = my*i;
        }
        System.out.println(my);
         */
        /* Task 25
          Scanner in = new Scanner(System.in);
        double my = 1;
        while (true){
            double d = in.nextDouble();
            if(d==0){
                System.out.println(my);
                break;
            }
            my = my * d;
        }
        Ili vot tak nado reshat
          Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double num = in.nextDouble();
        double sum = 1;

        while (num != 0) {
            sum *= num;
            num = in.nextDouble();
        }

        sum = (double)Math.round(sum * 1000)/1000;

        System.out.print(sum);
         */
        /* Task 26
         Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true){
            int n = in.nextInt();
            if(n%2!=0)
            sum = sum+n ;
            if(n==0){
                System.out.println(sum);
                break;
            }
        }
         */
        /* Task 27
          Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        for( int i=a; i<=b; i++ ){
            if(i%d==c){
                System.out.print(i+" ");
            }
        }
         */
        /* Task 28
        Scanner in = new Scanner(System.in);
        int sqr = 1;
        int sum = 0;
        int n = in.nextInt();
        for(int i=0; i<=n; i++){
            sqr = i*i;
            sum = sum+sqr;
        }
        System.out.println(sum);
         */
        /* Task 30
         Scanner in = new Scanner(System.in);
        int dol;
        int pay = 0;
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();

        for (int i=1; i<=w; i++) {
            dol = i * k;
            pay = pay + dol;
        }
            if(n<pay){
                System.out.println(pay-n);
        }
         */










    }
}