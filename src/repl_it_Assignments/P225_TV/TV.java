package repl_it_Assignments.P225_TV;

public class TV {

    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    String brand = "undefined";


    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV (String brand){
        System.out.println("Creating TV object using 1 Args- constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int newChannel) {
        // If my channel is out of the range i want to exit from the method

        if ( newChannel <=0 || newChannel > 120 ){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
            return ;// early exit from the method
        }

//        if (on == false) {
//            channel = newChannel;
//        } else {
//            System.out.println("TURN ON THE TV FIRST");
//        }

    }

    public void channelUP (int channel) {
        this.channel = channel + 1;
    }

    public void channelDown (int channel) {
        this.channel = channel - 1;
    }



    public void volumeUp (int volumeLevel) {

        this.volumeLevel = volumeLevel + 1;
    }

    public void volumeDown (int volumeLevel) {
        this.volumeLevel = volumeLevel - 1;
    }

    public int getVolumeLevel() {

        return volumeLevel;
    }

    public void setVolumeLevel(int newVolumeLevel) {

        if(newVolumeLevel<1 || newVolumeLevel >7){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
            return;// early exit from the method
        }
        if (on==false){
            volumeLevel=newVolumeLevel;
        }
    }


    public void isOn() {
        if(on == false) {
            System.out.println("TV is already ON");
        } else if (on == true){
            System.out.println("TV is already OFF");
        }
    }

    public void turnOn() {

        if (on == false) { // checking for equality
            System.out.println("Turning on TV");
            on = true; // assigning the value of on to true
        }
    }
    public void turnOff() {
        // if(isOn){ // this will also
        if (on == true) {
            System.out.println("Turning off TV");
            on = false;
        }
    }



    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }
}
