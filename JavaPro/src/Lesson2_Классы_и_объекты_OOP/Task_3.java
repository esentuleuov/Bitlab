package Lesson2_Классы_и_объекты_OOP;

public class Task_3 {
    public static void main(String[] args) {
        Student s1 = new Student(0, "Esen", "Tuleuov", 2.00);
        Student s2 = new Student(1, "Esen", "Tuleuov", 2.15);
        Student s3 = new Student(2, "Esen", "Tuleuov", 2.30);
        Student s4 = new Student(3, "Esen", "Tuleuov", 2.50);
        Student s5 = new Student(4, "Esen", "Tuleuov", 2.90);
        Student students[] = {s1, s2, s3, s4, s5};
        for(int i=0; i<students.length; i++){
            System.out.println(students[i].getStudentData());
        }
    }
}
class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student() {
        id = 0;
        this.name = "No name";
        this.surname = "No surname";
        this.gpa = 0.0;
    }

    public Student(int id, String name, String surname, double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData() {
        return "id: " + id + ", name: " + name + ", surname: " + surname + ", gpa: " + gpa;
    }
}

