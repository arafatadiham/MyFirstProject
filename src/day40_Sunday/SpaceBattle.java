package day40_Sunday;

public class SpaceBattle {

    public static void main(String[] args) {

        Spaceship s1 = new Spaceship();
        s1.name = "Orville";

        s1.setInitialPosition(1,5);
        s1.setDirection("up");
        s1.move1Block();
        System.out.println("s1 " + s1);

        s1.setDirection("ABC"); // in this case, it will gve you "invalid direction",
                                // but will stay same at previous position
        s1.move1Block();

        System.out.println("s1 " + s1);

        s1.move1Block("up");
        s1.move1Block("right");
        s1.move1Block("up");
        s1.move1Block("down");
        s1.move1Block("home");

        System.out.println("s1 = " + s1);
    }

}
