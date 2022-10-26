package Lesson2_Классы_и_объекты_OOP;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Students[] students = new Students[10];
        int counter = 0;
        while(true) {
            System.out.println("PRESS [1] TO ADD STUDENT\n" +
                    "PRESS [2] TO LIST STUDENT\n" +
                    "PRESS [0] TO EXIT");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.println("INSERT NAME: ");
                String name = in.next();
                System.out.println("INSERT SURNAME: ");
                String surname = in.next();
                System.out.println("INSERT GPA: ");
                double GPA = in.nextDouble();
                Students student = new Students(name,surname,GPA);
                students[counter] = student;
                counter++;
                System.out.println(counter);
            }
            if (choice == 2) {
                System.out.println("Hello");
                System.out.println(counter);
                for (int i = 0; i < counter; i++) {
                    System.out.println(students[i]);
                }
            }
            if (choice==0){
                break;
            }
        }
    }
}

class Students {
    String name;
    String surname;
    double gpa;

    public Students(){

    }

    public Students(String name, String surname, double gpa){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String toString(){
        return name + " " + surname + "" + gpa;
    }
}


