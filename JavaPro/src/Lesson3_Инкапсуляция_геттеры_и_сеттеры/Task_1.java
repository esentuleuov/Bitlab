package Lesson3_Инкапсуляция_геттеры_и_сеттеры;

public class Task_1 {
    public static void main(String[] args) {
        /* //TASK_3
        Phone p1 = new Phone("Iphone", "XR", 2000, 128);
        Phone p2 = new Phone("Iphone", "Xs", 100, 128);
        Phone p3 = new Phone("Iphone", "11 pro", 501, 128);
        Phone p4 = new Phone("Iphone", "12 pro", 300, 128);
        Phone p5 = new Phone("Iphone", "12 mini", 200, 128);
        Phone p6 = new Phone("Iphone", "11 pro max", 1060, 128);
        Phone p7 = new Phone("Samsung", "s6", 1400, 128);
        Phone p8 = new Phone("Samsung", "s8", 120, 128);
        Phone p9 = new Phone("Samsung", "s20", 4000, 128);
        Phone p10 = new Phone("Samsung", "21", 5000, 128);

        Phone[] phones = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        for(int i=0; i<phones.length; i++){
            System.out.println(phones[i].getName() +" - " +  phones[i].getCategory());
        }
         */

        //Task_4
        Phone p1 = new Phone("Iphone", "XR", 2000, 128);
        Phone p2 = new Phone("Iphone", "Xs", 100, 128);
        Phone p3 = new Phone("Iphone", "11 pro", 501, 128);
        Phone p4 = new Phone("Iphone", "12 pro", 300, 128);
        Phone p5 = new Phone("Iphone", "12 mini", 200, 128);
        Phone p6 = new Phone("Iphone", "11 pro max", 1060, 128);
        Phone p7 = new Phone("Samsung", "s6", 1400, 128);
        Phone p8 = new Phone("Samsung", "s8", 120, 128);
        Phone p9 = new Phone("Samsung", "s20", 800, 128);
        Phone p10 = new Phone("Samsung", "21", 550, 128);

        Phone[] phones = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        for(int i=0; i<phones.length; i++){
            if(phones[i].getCategory().equals("TOP") || phones[i].getCategory().equals("SIMPLE")){
                phones[i].getPhoneData();
            }
        }

    }
}
    class Phone{
        private String name;
        private String model;
        private int price;
        private int memory;

        public Phone(){

        }

        public Phone(String name, String model, int price, int memory){
            this.name = name;
            this.model = model;
            this.price = price;
            this.memory = memory;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public String getModel(){
            return model;
        }
        public void setModel(String model){
            this.model = model;
        }

        public int getPrice(){
            return price;
        }
        public void setPrice(int price){
            this.price = price;
        }

        public int getMemory(){
            return memory;
        }
        public void setMemory(int memory){
            this.memory = memory;
        }


        //Task_2
        public String getCategory(){
            if(price < 0){
                return "Price dolzhen byt bolshe 0";
            }
            if(price>1000){
                return "TOP";
            }
            else if (price<=1000 && price>=500) {
                return "MEDIUM";
            }
            return "SIMPLE";
        }
        // Task_2 END

        //Task_4 method
        public void getPhoneData(){
            System.out.println("Phone name: " + name + ", model: " + model + ", price: " + price + ", memory: " + memory);
        }
    }





