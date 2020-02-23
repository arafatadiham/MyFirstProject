package day08;

public class IfStatement {

    public static void main(String[] args) {

        int speedLimit= 60;

        int yourCurrentSpeed= 50
                ;

        // if the yourCurrentSpeed limit is over speedLimit
        // get pulled over by the police
        //given ticket by the police


        boolean IamSpeeding= (yourCurrentSpeed > speedLimit);
        // INSIDE THE PERENTHESIS WE CAN ONLY PUT
        //BOOLEAN VALUE:---> TRUE OR FALSE
        //BOOLEAN VARIABLE--->
        //ANY EXPRESSION THAT RETURN BOOLEAN VALUE

        if (IamSpeeding) {

            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
        } else {
            System.out.println("enjoy your day");
            System.out.println("go shopping");
        }

        System.out.println("THE END!");

    }

}
