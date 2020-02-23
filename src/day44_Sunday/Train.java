package day44_Sunday;

// what is inherited from super class
// field abd method that visible in sub class are inherited
// constructor are not inherited

public class Train extends Vehicle{

// except construtor all attributes and method in Vehicle class
    // will also be here, they are just invisible, for example;
//    String make;
//    int year;


// we just need to add attribute that unique for train now

    int wagonCount;

    public void makeChoChoSound () {
        System.out.println("CHOOOOOO CHOOOO");
    }


     // how do we call Chooo Choooo sound method?
    public static void main(String[] args) {


        Train t1 = new Train();
        t1.makeChoChoSound();

        // these attributes we got from Vehicle
        t1.make = "Thomas";
        //t1.year = 1999; ---> private is NOT inherited
        t1.setYear(1999);
        System.out.println(t1.getYear());

        // calling the method we got from Vehicle
        t1.start();
        t1.goForward();

    }

}
