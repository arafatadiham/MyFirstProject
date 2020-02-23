package day45_Tuesday;

public class Dog extends Animal {


    public static void main(String[] args) {

        Dog twix = new Dog();
        twix.speak();


    }

    //OVERLOADING VS OVERRIDING
    //Overloading :same method name & different parameter in the same class
    //Overriding : parent child relationship is a MUST
    //has same method name signature & same parameter list ALWAYS



    // WHY DO WE WANT TO CALL SUPER CLASS VERSION OF OVERRIDDEN METHOD
    // We want to build on top of what's already written
    // code reuse
    // parent provide step abc
    // child want to do abc defg
    // so instead of repeating abc
    // child can directly call super class version of the method
    // to perform abc then add defg
    @Override
    public void speak() {
        //super.   can be used to specify we are calling
        // super class version of the method

        // Question :
        // Can we use super.   or this.   outside of instance method
        // BIG NO!!!!
        // it can only be used inside instance method
        super.speak();
        System.out.println("BARK!!!");
        super.speak();
        super.speak();
    }
}
