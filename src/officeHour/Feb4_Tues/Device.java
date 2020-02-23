package officeHour.Feb4_Tues;

public abstract class  Device implements WaterProof {

    int size;
    int price;

    public void call (){

        System.out.println("Calling with device... ");
    }

    public abstract void  sendMessage ();



}
