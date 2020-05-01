package Tasks_Akbar.lambdaIntro;

public class Main_WithoutLambda {
    public static void main(String[] args) {

        Moveable_NoLambda moveXmile = new DistantMover();
   // moveXmile.move(15);

        Moveable_NoLambda moveShort = new ShortDistanceMover();
   // moveShort.move(2);

    // OR you can create a static method,
        // and call "moveXmile" & moveShort here:
    moveAction(moveXmile);
        moveAction(moveShort);
    }

     public static void moveAction(Moveable_NoLambda m){
        m.move(100);
     }

}
