package Lesson4_Наследование_Полиморфизм;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int student_index=0;
        User users[]=new User[1000];
        while (true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            int n = in.nextInt();

            if (n == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF");
                n = in.nextInt();
                if (n == 1) {
                    System.out.println("Enter id, login, password, name, surname, gpa");
                    Student st = new Student(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.nextDouble());
                    st.addCourse();
                    users[student_index] = st;
                    student_index++;
                }
                if(n == 2){
                    System.out.println("Enter id, login, password, name, surname, salary");
                    Staff sf = new Staff(in.nextInt(),in.next(), in.next(), in.next(), in.next(), in.nextDouble());
                    sf.addSubject();
                    users[student_index] = sf;
                    student_index++;
                }
            }
            if (n == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST STAFF");
                n = in.nextInt();
                if (n == 1) {
                    for (int i = 0; i < student_index; i++) {
                        if(users[i] instanceof Student){
                            users[i].getData();
                        }
                    }
                }
                if (n == 2){
                    for(int i=0; i<student_index; i++){
                        if(users[i] instanceof Staff){
                            users[i].getData();
                        }
                    }
                }
            }
            if(n == 0){
                break;
            }
        }
    }
}

