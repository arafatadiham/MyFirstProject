package day35_Sunday;

public class Interview_CharacterPractice2 {
    public static void main(String[] args) {

        /*
        Given any String  for example
        String str = "A34B123C4X";
        Add all the numbers inside the String : above String should generate 17
         */

        //This is the first way to do :
        char myChar = '7';
        // get int 7
        int myNum = Integer.parseInt(myChar + "");
        System.out.println("myNum = " + myNum);

        // this is teh second way to do:
        // Character.toString(myChar)

        // third option :
        // String.valueOf(myChar)

        String str = "A34B123C4X";

        char [] allChars= str.toCharArray() ;

        int sum = 0;

        for (char eachItem : allChars){

            if (Character.isDigit(eachItem)){
            System.out.println("eachItem : " + eachItem);
            int eachNUm = Integer.parseInt(eachItem+"");
            sum = sum +eachNUm;
            }
    }
        System.out.println("sum = " + sum);

}
}


