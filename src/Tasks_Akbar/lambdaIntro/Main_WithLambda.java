package Tasks_Akbar.lambdaIntro;

public class Main_WithLambda {
    public static void main(String[] args) {

        Moveable moveXmile= (int mile)->{
            System.out.println("moving " +mile);
        };

        Moveable moveShort =
                mile -> System.out.println("moving short mile " + mile);

//mile   moveAction(moveXmile);
//   moveAction( mile -> System.out.println("moving short mile " + mile););
//
//        public static void moveAction (Moveable number ){
//            number.move(100);
//        }

    }
}
