package day53_Monday;

public abstract class Fruit {
    String taste;
    String color;

    public Fruit(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }

    public abstract void getDigested();



}
