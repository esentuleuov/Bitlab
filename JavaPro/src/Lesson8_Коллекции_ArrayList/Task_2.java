package Lesson8_Коллекции_ArrayList;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        BankApplication b1 = new BankApplication("Kaspi");
        Account a1 = new Account(1, "Esen", "Tuleuov",400000.0);
        Account a2 = new Account(1, "Esen", "Tuleuov",500000.0);
        Account a3 = new Account(1, "Esen", "Tuleuov",600000.0);
        b1.addAccount(a1);
        b1.addAccount(a2);
        b1.addAccount(a3);

        BankApplication b2 = new BankApplication("Halyk");
        Account a4 = new Account(1, "Esen", "Tuleuov",700000.0);
        Account a5 = new Account(1, "Esen", "Tuleuov",800000.0);
        Account a6 = new Account(1, "Esen", "Tuleuov",900000.0);
        Account a7 = new Account(1, "Esen", "Tuleuov",1000000.0);
        b2.addAccount(a4);
        b2.addAccount(a5);
        b2.addAccount(a6);
        b2.addAccount(a7);

        BankApplication b3 = new BankApplication("Forte");
        Account a8 = new Account(1, "Esen", "Tuleuov",100000.0);
        Account a9 = new Account(1, "Esen", "Tuleuov",200000.0);
        Account a10 = new Account(1, "Esen", "Tuleuov",300000.0);
        b3.addAccount(a8);
        b3.addAccount(a9);
        b3.addAccount(a10);

        ArrayList<BankApplication> allBanks = new ArrayList();
        allBanks.add(b1);
        allBanks.add(b2);
        allBanks.add(b3);

        allBanks.sort(Comparator.comparing(a -> a.getAverageBalance()));
        Collections.reverse(allBanks);

        for(int i=0; i<allBanks.size(); i++){
            System.out.println(allBanks.get(i).getBankData());
        }
    }
}

class Account{
    int id;
    String name;
    String surname;
    double balance;

    public Account(){}
    public Account(int id, String name, String surname, double balance){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
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
    public double getBalance(){return balance;}
    public void setBalance(){this.balance = balance;}

    public String toString(){
        return id + ", " + name + ", " + surname + ", " + balance;
    }
}
class BankApplication{
    String name;
    ArrayList<Account> accounts = new ArrayList();

    public BankApplication(){}
    public BankApplication(String name){
        this.name = name;
    }

    public void addAccount(Account a){
        accounts.add(a);
    }
    public void removeAccount(int i){
        accounts.remove(i);
    }
    public void getMaxAccount(){
        double max = 0;
        for(int i=0; i<accounts.size(); i++){
            if (accounts.get(i).getBalance() >max){
                max = accounts.get(i).getBalance();
            }
        }
        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).getBalance()==max){
                System.out.println(accounts.get(i));
            }
        }
    }
    public double getAverageBalance(){
        double sum = 0;
        double counter = 0;
        for(int i=0; i<accounts.size(); i++){
            sum = accounts.get(i).getBalance() + sum;
            counter++;
        }
        return sum/counter;
    }
    public double getTotalBalance(){
        double sum = 0;
        for(int i=0; i< accounts.size(); i++){
            sum = sum + accounts.get(i).getBalance();
        }
        return sum;
    }
    public int totalAccounts(){
        return accounts.size();
    }
    public String getBankData(){
        return name + ", " + totalAccounts() + ", " + getTotalBalance() + ", " + getAverageBalance();
    }
}
