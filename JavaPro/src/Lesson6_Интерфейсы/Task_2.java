package Lesson6_Интерфейсы;

public class Task_2 {
    public static void main(String[] args) {
        Staff s1 = new Staff(1,"Esen","Tuleuov",2000);
        Staff s2 = new Staff(1,"Esen","Tuleuov",1000);
        Staff s3 = new Staff(1,"Esen","Tuleuov",3000);
        Staff s4 = new Staff(1,"Esen","Tuleuov",5000);
        Staff s5 = new Staff(1,"Esen","Tuleuov",9000);

        HRMManagers h1 = new HRMManagers(2,"Tuleuov Aman",1000);
        HRMManagers h2 = new HRMManagers(2,"Tuleuov Aman",2000);
        HRMManagers h3 = new HRMManagers(2,"Tuleuov Aman",3000);
        HRMManagers h4 = new HRMManagers(2,"Tuleuov Aman",4000);
        HRMManagers h5 = new HRMManagers(2,"Tuleuov Aman",5000);

        Programmers p1 = new Programmers(3,"ET",1500,500,0.5);
        Programmers p2 = new Programmers(3,"ET",1500,500,0.5);
        Programmers p3 = new Programmers(3,"ET",1500,500,0.5);
        Programmers p4 = new Programmers(3,"ET",1500,500,0.5);
        Programmers p5 = new Programmers(3,"ET",1500,500,0.5);
        Workers workers[] = {s1,s2,s3,s4,s5,h1,h2,h3,h4,h5,p1,p2,p3,p4,p5};

        int max = 0;
        for(int i=0; i< workers.length; i++){
            if(workers[i].getSalary()>max){
                max = workers[i].getSalary();
            }
        }
        System.out.println(max);
    }
}
interface Workers{
    String getWorkerData();
    int getSalary();
}
class Staff implements Workers{
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Staff(){
    }
    public Staff(int id, String name, String surname, int salary){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname() {
        this.surname = surname;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }
    public String getWorkerData(){
        return id + ", " + name + ", " + surname + ", " + salary;
    }
}

class HRMManagers implements Workers{
    private int id;
    private String fullName;
    private int salary;

    public HRMManagers(){}
    public HRMManagers(int id, String fullName, int salary){
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(){
        this.fullName = fullName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }

    public String getWorkerData(){
        return id + ", " + fullName + ", " + salary;
    }
}

class Programmers implements Workers{
    private int id;
    private String nickname;
    int salary;
    int bonusSalary;
    double KPIValue;

    public Programmers(){}
    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue){
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getNickname(){
        return nickname;
    }
    public void setNickname() {
        this.nickname = nickname;
    }
    public int getBonusSalary(){
        return bonusSalary;
    }
    public void setBonusSalary(){
        this.bonusSalary = bonusSalary;
    }
    public double getKPIValue(){
        return KPIValue;
    }
    public void setKPIValue(){
        this.KPIValue = KPIValue;
    }

    public String getWorkerData(){
        return id + ", " + nickname + ", " + salary + ", " + bonusSalary + ", " + KPIValue;
    }
    public int getSalary(){
        return (int) (salary + KPIValue*bonusSalary);
    }
}

