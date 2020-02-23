package day48_Sunday.Interface_Intro;


// this is how we create an interface
// interface is abstract type just like abstract class
// no object can be created from it
// it provide guideline for implementing classes
// it's like signing a contract
public interface Flyable {

    // an interface can only have public static final field
    public static final boolean HAVE_WING = true;

    // can we have constructor ? : ABSOLUTELY NO !!!!!!!!!!!

    public abstract void fly();

}