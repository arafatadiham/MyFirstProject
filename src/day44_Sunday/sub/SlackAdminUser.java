package day44_Sunday.sub;
import day44_Sunday.Slack;

public class SlackAdminUser extends Slack {


    int adminId;

    public SlackAdminUser(String name, String status , int adminId) {

        this.adminId = adminId;
        this.name = name;
        this.Status= status;
    }

  // create toString method

    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }

    /*
        sendAtChannelMessage
         deleteMessage
         addChannel

     */

    public void sendChannelMessage () {
        System.out.println(name + " sending channel message");
    }

    public void deleteMessage () {
        System.out.println(name + " delete Message");
    }

    public void addChannel () {
        System.out.println(name + " add Channel");
    }



    public static void main(String[] args) {


        SlackAdminUser user1 = new SlackAdminUser("Akbar", "I can do it", 101);

        // ---> inherited method we are calling
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();

         // ---> our own methods we are calling
        user1.addChannel();
        user1.deleteMessage();
        user1.sendChannelMessage();
        System.out.println("user1 = " +user1 );

    }

}
