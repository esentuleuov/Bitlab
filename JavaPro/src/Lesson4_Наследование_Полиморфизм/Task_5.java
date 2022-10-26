package Lesson4_Наследование_Полиморфизм;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        User u1 = new User(2,"user","password","username","surname");
        User u2 = new User(2,"user","password","username","surname");
        User u3 = new User(2,"user","password","username","surname");

        Staff sf1 = new Staff(1,"esen", "123", "Esen ", "Tuleuov", 10000);
        Staff sf2 = new Staff(1,"esen", "123", "Esen", "Tuleuov", 20000);
        Staff sf3 = new Staff(1,"esen", "123", "Esen", "Tuleuov", 50000);

        Student st1 = new Student(3,"student","password","Ronaldo","Cristiano",4.0);
        Student st2 = new Student(3,"student","password","Ronaldo","Cristiano",3.0);
        Student st3 = new Student(3,"student","password","Ronaldo","Cristiano",2.0);

        sf1.addSubject();
        sf2.addSubject();
        sf3.addSubject();

        st1.addCourse();
        st2.addCourse();
        st3.addCourse();

        User users[] = {u1,u2,u3,sf1,sf2,sf3,st1,st2,st3};
        for(int i=0; i< users.length; i++){
            users[i].getData();
        }
    }
}
class User{
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User(){

    }

    public User(int id, String login, String password, String name, String surname){
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getLogin(){
        return login;
    }
    public void setLogin(){
        this.login = login;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password = password;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(){
        this.surname = surname;
    }

    public void getData(){
        System.out.println(id + ", " + login + ", " + password + ", " + name + ", " + surname);
    }
}

class Staff extends User{
    private double salary;
    private String[] subjects = new String[100];
    private int indexOfSubject = 0;

    public Staff(){
        super();
    }

    public Staff(int id, String login, String password, String name, String surname, double salary){
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }

    @Override
    public void getData() {
        System.out.println(id + ", " + login + ", " + password + ", " + name + ", " + surname + ", " + salary);
        getSubjects();
    }

    public void addSubject(){
        Scanner in = new Scanner(System.in);
        System.out.println("Add subjects:");
        while(true){
            String subject = in.next();
            subjects[indexOfSubject] = subject;
            if(subject.equals("stop")){
                break;
            }
            indexOfSubject++;
        }
    }
    public void getSubjects(){
        for(int i=0;i<indexOfSubject;i++){

            System.out.println("Subjects of " + this.name + " : " +"\t" +  subjects[i]);
        }
    }
}

class Student extends User{
    private double gpa;
    private String[] courses = new String[100];
    private int indexOfCourses = 0;

    public Student(){
        super();
    }

    public Student(int id, String login, String password, String name, String surname,double gpa){
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    @Override
    public void getData() {
        System.out.println(id + ", " + login + ", " + password + ", " + name + ", " + surname + ", " + gpa);
        getCourses();
    }

    public void addCourse(){
        Scanner in = new Scanner(System.in);
        System.out.println("Add courses:");
        while(true){
            String course = in.next();
            courses[indexOfCourses] = course;
            if(course.equals("stop")){
                break;
            }
            indexOfCourses++;
        }
    }

    public void getCourses(){
        for(int i=0;i<indexOfCourses;i++){
            System.out.println("Courses of " + this.name + " : " +"\t" +  courses[i]);
        }
    }

}
