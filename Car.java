class Car{
  //fields or attributes
  int horsePower;//hp
  int speed;//km per h
  int fuelConsuomption;//km per liter
  int gasTank;//liter
  int travelledTime;//h

  //constructor
  Car(int newSpeed,int newTime){
    horsePower=15;
    speed=newSpeed;
    fuelConsuomption=20;
    gasTank=60;
    travelledTime=newTime;
  }

  //methods
  void speedUp(int increment){
    speed+=increment;
  }
  void applyBrakes(int decrement){
    speed-=decrement;
  }
  void travelledTimeUp(){
    gasTank-=speed*travelledTime/fuelConsuomption;
  }
  void printStateTank(int i){
    System.out.println("No"+i+" state of car's tank : "+gasTank);
  }
}

class CarDemo{
  public static void main(String[] args){
    Car car1 = new Car(100,10);
    Car car2 = new Car(55,13);
    Car car3 = new Car(73,28);
    int i=1;
    car1.speedUp(10);
    car1.travelledTimeUp();
    car1.printStateTank(i++);
    car2.applyBrakes(23);
    car2.travelledTimeUp();
    car2.printStateTank(i++);
    car3.applyBrakes(40);
    car3.travelledTimeUp();
    car3.printStateTank(i);
  }
}
