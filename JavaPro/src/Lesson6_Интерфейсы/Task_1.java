package Lesson6_Интерфейсы;

public class Task_1 {
    public static void main(String[] args) {
        Users u1 = new Users("John","Tuleuov");
        Users u2 = new Users("John","Tuleuov");
        Users u3 = new Users("John","Snow");
        Users u4 = new Users("Messi","Lonel");
        Users u5 = new Users("Ronaldo","Smith");
        Users u6 = new Users("Neymar","Junior");
        Users u7 = new Users("Maradona","Diego");
        Users u8 = new Users("Ilon","Mask");
        Users u9 = new Users("Mask","Smith");
        Users u10 = new Users("Mbappe","Smith");
        Users users[] = {u1,u2,u3,u4,u5,u6,u7,u8,u9,u10};

        UserBeanlmp beanlmp = new UserBeanlmp(users);
        beanlmp.getUsersByName("John");
        beanlmp.getUsersBySurname("Smith");
    }
}
class Users{
    private String name;
    private String surname;

    public Users(){
    }
    public Users(String name,String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(){
        this.surname = surname;
    }
}

interface UserBean{
    void getAllUsers();
    void getUsersByName(String name);
    void getUsersBySurname(String surname);
}
class UserBeanlmp implements UserBean{
    Users[] users;

    public UserBeanlmp(){
    }
    public UserBeanlmp(Users[] users){
        this.users = users;
    }

    public void getAllUsers(){
        for(int i = 0; i < users.length; i++) {
            System.out.println(i + users[i].getName() + " " +  users[i].getSurname());
        }
    }
    public  void getUsersByName(String name){
        for(int i=0; i< users.length; i++){
            if(users[i].getName().equals(name)){
                System.out.println(users[i].getName() + " "+ users[i].getSurname());
            }
        }
    }
    public void getUsersBySurname(String surname){
        for(int i=0; i<users.length; i++){
            if(users[i].getSurname().equals(surname)){
                System.out.println(users[i].getName() + " "+ users[i].getSurname());
            }
        }
    }
}
