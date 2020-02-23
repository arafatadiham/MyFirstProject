package day42_Wednesday;

public class Bike {

    int speed;
    int gear;

   //  what is constructor:
    // 1. it is not a method
    //2. you cannot call them , only when object is created you can call it
    //3. it has same name as Class name
    // 4.  it has no return type

    // what is the purpose of constructor?
    //1. we don't create empty object,
    // can get the object with initial value;
    //(WHEN WE INITIALIZE THE OBJECT TO HAVE INITIAL VALUES)
    //2.we can do it with one shot ;
    //3. if you have 3 contractor, that means you
    // have 3 ways to create the objects
    //

    public Bike(){
        System.out.println(  "message form constructor");
        gear =1 ;

    }

    public Bike (int newGear ){
        gear = newGear;
        // this.gear =  newGear;
    }

    public Bike ( int gear, int speed){
        this.gear =  gear;
        this.speed = speed;
    }


     public Bike (String str){
         System.out.println("Accept String !!!");
     }
}
