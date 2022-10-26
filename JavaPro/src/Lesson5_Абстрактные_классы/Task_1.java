package Lesson5_Абстрактные_классы;

public class Task_1 {
    public static void main(String[] args) {
        Chocolate c1 = new Chocolate("Snickers", 10);
        Chocolate c2 = new Chocolate("Twix", 20);

        Burger b1 = new Burger("Burger King",2,1);
        Burger b2 = new Burger("McDonalds",3,2);

        Coke coke1 = new Coke("Coca Cola",1.5,true);
        Coke coke2 = new Coke("Fuse Tea",1.0,false);

        Food foods[] = {c1,c2,b1,b2,coke1,coke2};
        for(int i=0; i< foods.length; i++) {
            System.out.println(foods[i].name + ": " + foods[i].getCalories());
        }
        double max = 0;
        for(int i=0; i< foods.length; i++){
            if(foods[i].getCalories()>max){
                max = foods[i].getCalories();
            }
        }
        System.out.println("Maximum Calories: " + max);
    }
}
abstract class Food{
        protected String name;
        abstract double getCalories();
    }

    class Chocolate extends Food{
        int weight;

        public Chocolate(){
            super();
        }
        public Chocolate(String name,int weight){
            this.name = name;
            this.weight = weight;
        }

        public double getCalories(){
            return weight*740;
        }
    }

    class Burger extends Food{
        int meatAmount;
        int meatType;

        public Burger(){
            super();
        }
        public Burger(String name, int meatAmount, int meatType){
            this.name = name;
            this.meatAmount = meatAmount;
            this.meatType = meatType;
        }

        public double getCalories(){
            if (meatType == 1) {
                return meatAmount*840;
            }
            return meatAmount*560;
        }
    }

    class Coke extends Food{
        double volumeLiters;
        boolean isSparkling;

        public Coke(){
            super();
        }
        public Coke(String name, double volumeLiters, boolean isSparkling){
            this.name = name;
            this.volumeLiters = volumeLiters;
            this.isSparkling = isSparkling;
        }

        public double getCalories(){
            if(isSparkling=true){
                return volumeLiters*400;
            }
            return volumeLiters*100;
        }

    }

