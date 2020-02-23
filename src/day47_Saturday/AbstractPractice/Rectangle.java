package day47_Saturday.AbstractPractice;

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(int width, int height) {
        // I want to set the name to word Rectangle;
        // i am reusing the functionality of super class
        // to set the name to rectangle
       super("my Rectangle");
       this.width=width;
       this.height=height;
    }

    @Override
    public void calculateArea() {
 area = height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}


/*
package day47;
public abstract class Shape {
    String name;
    int area ;
    // add a constructor to set these name value
    // add a abstract void method called calculateArea
}
//  add two concrete class of Shape :
//  Triangle
//      instance fields : int height and base
// constructor
//        to set name , height , base
//        implements calculateArea method   area = height * base / 2
// add toString method
//
//  Rectangle
//      instance fields : width and height
//      implements calculateArea method   area = height * width
//      add toString method
 */