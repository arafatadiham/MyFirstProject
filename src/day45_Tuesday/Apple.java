package day45_Tuesday;

public class Apple extends Fruit{

    // IF WE DON'T HAVE ANY CONSTRUCTOR in this class
    //we will get default constructor from Super class to this class
    // and compiler automatically call
    // no argument constructor of super class by inserting super()

    public Apple (){


       super();


    }

    //IMPORTANT POINT:
    // First Line of any Constructor is automatically calling
    // Super() if we don't call any

    //public Apple (){

        // I want to reuse the functionality
        // already written in super class constructor
        // we can use  super()  or super (arguments here)
        // to call super class's constructor

        //super();


        // How to call constructor with argument
     //   super("test");

        // Question : Can we use  this super() call more than once ?
        // No!!!!!!!!

    //    System.out.println("Message from Apple Constructor");

 //   }


    public static void main(String[] args) {

        Apple a1 = new Apple ();


    }

}
