package Lesson5_Абстрактные_классы;

public class Task_3 {
    public static void main(String[] args) {
        FerrariEngine f1 = new FerrariEngine(3.0,2,3.6);
        FerrariEngine f2 = new FerrariEngine(2.0,1,2.6);
        FerrariEngine f3 = new FerrariEngine(4.0,3,1.6);
        FerrariEngine f4 = new FerrariEngine(5.0,4,4.6);
        FerrariEngine f5 = new FerrariEngine(6.0,5,3.6);

        RenaultEngine r1 = new RenaultEngine(1.0,6,2.7,4.5);
        RenaultEngine r2 = new RenaultEngine(2.0,5,1.7,1.5);
        RenaultEngine r3 = new RenaultEngine(3.0,4,3.7,3.5);
        RenaultEngine r4 = new RenaultEngine(4.0,3,5.7,2.5);
        RenaultEngine r5 = new RenaultEngine(5.0,2,4.7,5.5);

        Engine engines[] = {f1,f2,f3,f4,f5,r1,r2,r3,r4,r5};
        for(int i=0; i<engines.length; i++){
            System.out.println(engines[i].getMaxSpeed());
        }
    }
}
abstract class Engine {
        protected double engineVolume;
        protected int cylinderAmount;
        protected double engineWeight;
        abstract double efficiency();
        abstract double throttleEnergy();
        abstract double breakEnergy();

        public Engine() {

        }
        public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
        }

        public double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
        }
        public double getEngineVolume(){
        return engineVolume;
        }
        public void setEngineVolume(){
        this.engineVolume = engineVolume;
        }
        public int getCylinderAmount(){
        return cylinderAmount;
        }
        public void setCylinderAmount(){
        this.cylinderAmount = cylinderAmount;
        }
        public double getEngineWeight(){
        return engineWeight;
        }
        public void setEngineWeight(){
        this.engineWeight = engineWeight;
        }
    }
    class FerrariEngine extends Engine{
        public FerrariEngine(){
            super();
        }
        public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight){
            super(engineVolume, cylinderAmount, engineWeight);
        }

        public double efficiency(){
        return 0.25;
        }
        public double  throttleEnergy(){
            return getEngineVolume()*getCylinderAmount()*100;
        }
        public double breakEnergy(){
            return getEngineWeight()*2;
        }
    }

    class RenaultEngine extends Engine{
        double extraTurboEnergy;

        public RenaultEngine(){
            super();
        }
        public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy){
            super(engineVolume, cylinderAmount, engineWeight);
            this.extraTurboEnergy = extraTurboEnergy;
        }

        public double efficiency(){
            return 0.27;
        }
        public double  throttleEnergy(){
            return getEngineVolume()*getCylinderAmount()*110 + extraTurboEnergy;
        }
        public double breakEnergy(){
            return getEngineWeight()*2.1;
        }
    }


