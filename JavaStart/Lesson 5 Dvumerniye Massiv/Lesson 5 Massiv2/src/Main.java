import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Tutorial

//        Scanner in = new Scanner(System.in);
//        System.out.println("Insert n: ");
//        int n = in.nextInt();
//        System.out.println("Insert m: ");
//        int m = in.nextInt();
//
//        int arr[][] = new int[n][m];
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        /* Task 1
         Scanner in = new Scanner(System.in);
        int arr[][] = {{12,5,7,6},{4,0,2,7},{9,1,3,2},{10,-2,4,6}};
        int N = in.nextInt();
        int M = in.nextInt();
        System.out.println(arr[N][M]);
         */

        /* Task 2
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[][] = new int[2][N];

        for(int i=0; i<2; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
         */

        /* Task 3
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int K = in.nextInt();
        for(int i=K; i<=K; i++){
            for(int j=0; j<M; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
         */

        /* Task 4
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            if(i%2==0){
                for(int j=0; j<M; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
         */

        /* Task 5
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
         */

        /* Task 6
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]>=0){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
         */

        /* Task 7
         Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]%2==0 && arr[i][j]>=0){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
         */

        /* Task 8
         Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(arr[i][j]*arr[i][j]+" ");
            }
            System.out.println();
        }
         */

        /* Task 9
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]<0){
                    System.out.print(i + " " + j);
                    System.out.println();
                }
            }
        }
         */

        /* Task 10
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int sum = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(i%2==0 && j%2==0){
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println(sum);
         */

        /* Task 11
          Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int sum = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                sum = sum+arr[i][j];
            }
            System.out.println(sum);
            sum=0;
        }
         */

        /* Task 12
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max = 0;
        int indexi= 0;
        int indexj = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                    indexi = i;
                    indexj = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(indexi + " " + indexj);
         */

        /* Task 13
         Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]%2!=0){
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
         */

        /* Task 14
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max = 0;
        int min = arr[0][0];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==min){
                    arr[i][j]=max;
                }
                else if(arr[i][j]==max){
                    arr[i][j]=min;
                }
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
         */

        /* Task 15
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int K = in.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]%K==0){
                    arr[i][j] = arr[i][j]/K;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
         */

        /* Task 16
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=M-1; j>=0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
         */

        /* Task 17
         Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=N-1; i>=0; i--){
            for(int j=0; j<M; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
         */

        /* Task 18
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = 0; //Счита№ что лучше будет написать - int max = arr[0][0] так как первый элемент массива может быть отрицательным!!!
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]>=max){
                    max = arr[i][j];
                }
            }
            System.out.println(max);
            max = 0;
        }
         */

        /* Task 19
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<M; i++){
            int max = 0;
            for(int j=0; j<N; j++){
                if(arr[j][i]>max){
                    max = arr[j][i];
                }
            }
            System.out.println(max);
        }
         */

        /* Task 20
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[][] = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for (int j=0; j<N; j++) {
            int f = arr[0][j];
            arr[0][j] = arr[N-1][j];
            arr[N-1][j] = f;
            }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
         */





















    }
}