package Lesson2_Классы_и_объекты_OOP;

public class Task_4 {
    public static void main(String[] args) {
        Student s1 = new Student(0, "Esen", "Tuleuov", 2.00);
        Student s2 = new Student(1, "Esen", "Tuleuov", 2.15);
        Student s3 = new Student(2, "Esen", "Tuleuov", 2.30);
        Student s4 = new Student(3, "Esen", "Tuleuov", 2.50);
        Student s5 = new Student(4, "Esen", "Tuleuov", 2.90);
        Student students[] = {s1, s2, s3, s4, s5};
        System.out.println(topStudent(students).getStudentData());

    }

    public static Student  topStudent(Student students[]){
        double max = 0;
        for(int i=0; i<students.length; i++){
            if(students[i].gpa>max){
                max = students[i].gpa;
            }
        }
        for(int i=0; i< students.length; i++) {
            if (students[i].gpa==max){
               return students[i];
            }
        }
        return students[0];
    }
}
