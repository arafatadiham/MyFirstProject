package day44_Sunday;

public class Slack {

   protected String name;

   protected String Status;


    public void sendMessage(){

        System.out.println("Slack user " + name +" is send Message  " );


    }

    public void callSomeone () {
        System.out.println("Slack user " + name + " is call someone  " );
    }

    public void addEmoji () {
        System.out.println("Slack user " + name + " is sending  emoji to someone  " );

    }


}

/*
Create a class called SlackUser
attributes :
	 name  ,  status (make it protected)
behaviours :
	 sendMessage
	 callSomeone
	 addEmoji

Creare 1 subClass SlackAdminUser
attribute :
	adminId
behaviour :
	 sendAtChannelMessage
	 deleteMessage
	 addChannel
	 toString method
constructor :
	 3 argument constructor to set all fields value
 */