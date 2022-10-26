package Lesson5_Абстрактные_классы;

import java.util.Scanner;

public class    Task_4 {
    public static void main(String[] args) {

    }
}

abstract class User{
    protected int id;
    protected String login;
    protected String password;
    abstract String getUserData();

    public User(){
    }
    public User(int id, String login,String password){
        this.id =id;
        this.login = login;
        this.password = password;
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
}

class Student extends User{
    private String name;
    private String surname;
    private String group;
    private double gpa;

    public Student(){
        super();
    }
    public Student(int id, String login,String password,String name,String surname, String group,double gpa){
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;

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

    public String getGroup(){
        return group;
    }
    public void setGroup(){
        this.group = group;
    }

    public String getUserData(){
        return id + ", " + login + ", " + password + ", " + name + ", " + surname + ", " + group + ", " + gpa;
    }
}

class Teacher extends User{
    private String nickName;
    private String status;
    private String subjects[] = new String[10];
    private int SizeOfSubjects = 0;
    private int indexOfSubjects = 0;

    public Teacher(){
        super();
    }
    public Teacher(int id, String login,String password,String nickName, String status){
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public String getNickName(){
        return nickName;
    }
    public void setNickName(){
        this.nickName = nickName;
    }
    public  String getStatus(){
        return status;
    }
    public void setStatus(){
        this.status = status;
    }
    public int getSizeOfSubjects(){
        return SizeOfSubjects;
    }
    public String[] getSubjects(){
        return subjects;
    }

    public void addSubject(){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Add subjects: \ntype END if you finish");
            String subject = in.next();
            subjects[indexOfSubjects] = subject;
            if(subject.equals("END")){
                break;
            }
            indexOfSubjects++;
        }
    }

    public String getUserData(){
        return id + ", " + login + ", " + password + ", " + nickName + ", " + status + "\n" + "Subjects of: " + nickName + getSubjects();
    }
}

class ERPSystem{
    User memory[] = new User[1000];
    int sizeOfUsers = 0;


}
