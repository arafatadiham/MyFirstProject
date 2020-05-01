package Tasks_Akbar.lambdaIntro;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public interface Moveable_NoLambda {
    void move (int mile);

}

class DistantMover implements Moveable_NoLambda{
    @Override
    public void move(int mile) {
        System.out.println("moving " + mile);
    }
}

class ShortDistanceMover implements Moveable_NoLambda{
    @Override
    public void move(int mile) {
        System.out.println("moving short mile " + mile);
    }
}