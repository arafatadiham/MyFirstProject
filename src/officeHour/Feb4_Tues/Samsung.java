package officeHour.Feb4_Tues;

public class Samsung extends Device{

    String color;

    public void call() {
        System.out.println("Calling with Samsung ");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message with " + color + " of Samsung");
    }


    public void takePicture() {
        System.out.println("Taking a picture ");
    }
}
