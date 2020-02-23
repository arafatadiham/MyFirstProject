package officeHour.Feb4_Tues;

public class TestDevice {

    public static void main(String[] args) {

        // references are : d, s , i
        //reference type are : Device, Samsung, Iphone
        // Objects :  new Device() ,  new Samsung(), new Iphone();

     // we can not create object on abstract class
      //  Device d = new Device()


        Samsung s = new Samsung();
        s.price=999;
        s.size = 7;
        s.color= "Black";

        s.call();

        Iphone i = new Iphone();


        //what is Polymorphism ?
        //   reference (d2) is parent class or interface,
        // object (new Samsung() ) type is child class;
        Device d2 = new Samsung();
        d2.price = 888;
        d2.size = 6;
        //But we ca't not assign value on d2.color,
        // because reference type decide what method/variable you can access
       // d2.color
        //d2.takePicture

        WaterProof w = new Samsung();
        //w does not have access for any variable or methods
        // in Device or Samsung


        Device d3 = new Iphone();
        d3.price = 1200;
        d3.size = 8;
        d3.call();
        //But can not access Iphone platform when the reference type is Device
        //d3.platform

        Iphone i2 = new Iphone();
        i2.price = 1000;
        i2.size = 5;
        i2.platform= "IOS";

    }

}
