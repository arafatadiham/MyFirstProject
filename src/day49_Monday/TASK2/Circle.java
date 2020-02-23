package day49_Monday.TASK2;

public class Circle extends Shape implements Drawable{


    int radius;

    @Override
    public void draw() {

    }

    @Override
    public void calculateArea() {
        System.out.println("Circle area = " + radius * 3.14);
    }

    public Circle(String name,  int radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
