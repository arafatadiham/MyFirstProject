package day33_Monday;

public class WarmUp {
    public static void main(String[] args) {


        // YOUR CODE GOES HERE

        System.out.println((getSpelledName("Alden")));

    }

     public static String getSpelledName (String name ) {

        String result = "";

         for (int i = 0; i < name.length(); i++) {
            result = result + name.charAt(i);
            if(i != name.length()-1){
                result= result +"-";
            }

         }

        return result;
     }
}
