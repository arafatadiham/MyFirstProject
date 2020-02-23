package Tasks_Akbar;

public class StoreString {

    public static void main(String[] args) {
      String text =  " responding toda To email to this school, click the button" +
               " below or simply reply to this email with your response.";
//
//        System.out.println(text);
//
//        String stored = "";
//
//        int emailIndex= text.indexOf("email");
//
//        System.out.println(emailIndex);
//
//        stored = text.substring(20, 25);
//
//        System.out.println(stored);
//
//        int lastEmailIndex = text.lastIndexOf("email");
//
//        System.out.println(lastEmailIndex);

        // use ForLoop:
        String storeEmail="";
        for ( int i =0; i < text.length() - 5; i++){
            String current5Chars = text.substring(i, i + 5);

            if (current5Chars.equals("email")){
                //System.out.println("The index of email is " + i);
              //  storeEmail+=text.substring(i, i+5) + ", ";
                storeEmail=storeEmail + text.substring(i, i+5) + ", ";
                System.out.println(storeEmail);
            }

        }











    }
}
