package day49_Monday.TASK2;

public class Square extends Shape implements Drawable{

    int length;



    @Override
    public void draw() {
        System.out.println("prefect square!");
    }

    @Override
    public void calculateArea() {
        System.out.println("Square area = " + (area= length * length));

    }

    public Square(String name,  int length ) {
        super(name);
        this.length=length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
