class FuelConsumptionCalculation {
   private double fuelConsumptionOldRegulation = 0;
   private double fuelConsumptionNewRegulation = 0;
   private SimpleCar[] cars;
   FuelConsumptionCalculation() {
      /* your code is here */
      this.cars = new SimpleCar[4];
      this.cars[0]=new DeluxeCar(7f,18f,200f,8f,"Honda");
      this.cars[1]=new AdvancedCar(7f,18f,200f,8f,"Toyota");
      this.cars[2]=new SimpleCar(7f,18f,200f,8f,"Nissan");
      this.cars[3]=new DeluxeCar(7f,18f,200f,8f,"Van");
      calculateFuelConsumption();
   }
   FuelConsumptionCalculation(SimpleCar[] cars) {
      /* your code is here */
      this.cars=cars;
      calculateFuelConsumption();
   }
   private void calculateFuelConsumption() {
      /* your code to calculate values of
        fuelConsumptionOldRegulation and
        fuelConsumptionNewRegulation is here */
        for(SimpleCar car:cars){
          fuelConsumptionOldRegulation+=car.calculateFuelConsumptionOldRegulations();
        }
        for(SimpleCar car:cars){
          fuelConsumptionNewRegulation+=car.calculateFuelConsumptionNewRegulations();
        }
   }
   float getFuelConsumptionOldRegulations() {
      /* your code is here */
      return (float)fuelConsumptionOldRegulation;
   }
   float getFuelConsumptionNewRegulations() {
      /* your code is here */
      return (float)fuelConsumptionNewRegulation;
   }
}
class SimpleCar{
  private float beginWork;
  private float finishWork;
  private float kilometers;
  private float totalTime;
  private String maker;
  SimpleCar(float beginWork,float finishWork,float kilometers,float totalTime,String maker){
    this.beginWork=beginWork;
    this.finishWork=finishWork;
    this.kilometers=kilometers;
    this.totalTime=totalTime;
    this.maker=maker;
  }
  float calculateFuelConsumptionOldRegulations(){
    return kilometers/13;
  }
  float calculateFuelConsumptionNewRegulations(){
    return kilometers/13;
  }
  float getBeginWork(){
    return beginWork;
  }
  float getFinishWork(){
    return finishWork;
  }
  float getKilometers(){
    return kilometers;
  }
  float getTotalTime(){
    return totalTime;
  }
  String getMaker(){
    return maker;
  }
}
class AdvancedCar extends SimpleCar{
  AdvancedCar(float beginWork,float finishWork,float kilometers,float totalTime,String maker){
    super(beginWork,finishWork,kilometers,totalTime,maker);
  }
  float calculateFuelConsumptionOldRegulations(){
    return getKilometers()/15.5f*(getFinishWork()-getBeginWork())/9.5f;
  }
  float calculateFuelConsumptionNewRegulations(){
    return getKilometers()/15.5f*(getFinishWork()-getBeginWork())/9.5f;
  }
}
class DeluxeCar extends AdvancedCar{
  DeluxeCar(float beginWork,float finishWork,float kilometers,float totalTime,String maker){
    super(beginWork,finishWork,kilometers,totalTime,maker);
  }
  float calculateFuelConsumptionOldRegulations(){
    if(getMaker()=="Honda"){
      return getKilometers()/14f+(getFinishWork()-getBeginWork())/10.5f;
    }else if(getMaker()=="Van"){
      return getKilometers()/10.5f+(getFinishWork()-getBeginWork())/6f;
    }
    return 0;
  }
  float calculateFuelConsumptionNewRegulations(){
    if(getMaker()=="Honda"){
      return getKilometers()/14f+getTotalTime()/10.5f;
    }else if(getMaker()=="Van"){
      return getKilometers()/10.5f+getTotalTime()/6f;
    }
    return 0;
  }
}
class Demo{
  public static void main(String[] args){
    SimpleCar car[]=new SimpleCar[4];
    car[0]=new DeluxeCar(7f,18f,200f,8f,"Honda");
    car[1]=new AdvancedCar(7f,18f,200f,8f,"Toyota");
    car[2]=new SimpleCar(7f,18f,200f,8f,"Nissan");
    car[3]=new DeluxeCar(7f,18f,200f,8f,"Van");
    FuelConsumptionCalculation fcc1=new FuelConsumptionCalculation();
    FuelConsumptionCalculation fcc2=new FuelConsumptionCalculation(car);


    System.out.println(fcc1.getFuelConsumptionOldRegulations());
    System.out.println(fcc1.getFuelConsumptionNewRegulations());
    System.out.println(fcc2.getFuelConsumptionOldRegulations());
    System.out.println(fcc2.getFuelConsumptionNewRegulations());
  }
}
