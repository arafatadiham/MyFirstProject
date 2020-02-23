package officeHour.Feb4_Tues;

public class Iphone extends Device {

String platform;

    @Override
    public void sendMessage() {
        System.out.println("Send message from Iphone");
    }

    public void FaceTime() {
        System.out.println("Talking to Akbar through face time");
    }

    public void call () {
        System.out.println("this is call from Iphone,NOT from device");
    }

}
