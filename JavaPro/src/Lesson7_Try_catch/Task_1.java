package Lesson7_Try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] u = new User[5];
        int age;
        for(int i=0; i< u.length; i++){
            System.out.println("name");
            String name = in.nextLine();
            System.out.println("surname");
            String surname = in.nextLine();
            try{
                age = Integer.parseInt(in.nextLine());
            }
            catch (Exception e){
                age = 0;
               // e.printStackTrace();
                System.out.println("Input Mismatch exception");
            }
            u[i] = new User(name,surname,age);
            System.out.println("create user");
        }
    }
}
class User{
    String name;
    String surname;
    int age;

    public User(){}
    public User(String name,String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
