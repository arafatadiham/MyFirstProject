package day49_Monday;

// interface is like a contract ,
// once someone sign a contract he/she will provide all the details that he/she must do

// AN INTERFACE IS NOT A CLASS!!!!!!
public interface Edible {

    // IN INTERFACE fields are automatically public static final if not defined so.
    // public static final filed naming convention is ALL_CAPS!!!
    // You can have as many constants as you want
    public static final boolean IS_HUMAN_FOOD = true;


    // If a method with no-body is not defined public abstract , it's automatically public abstract
    public abstract void eat();

    public abstract void drink();


    // Default method was added since Java 8 to provide
    // Default implementation to not break existing implementation
    //Classes have option to use it as is
    //or override it according to their own requirements
    // the default method ONLY EXIST IN an Interface !
    // default keyword here IS NOT AN ACCESS MODIFIER !!!!!!!
    // A default method MUST HAVE BODY !!!!!!!
    // Implicitly the method is public if you do not specify public
    public default void digest(){
        System.out.println("You Implement the code yourself!!!");
    }

}
