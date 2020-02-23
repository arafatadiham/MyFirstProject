package day36_Saturday;

public class MethodPractice {
    public static void main(String[] args) {

//Boolean b = true ;  // auto boxed it to Boolean Object

//        Boolean result1 =  checkIfStringHasNumber("ytz13ck");
//        System.out.println("result1 = " + result1);

        Boolean result2 = checkIfStringHasNumber("ABCD");
        System.out.println("result2 = " + result2);


        System.out.println(checkIfStringHasNumber(" a asj35  "));

    }

    /**
     * write a static method to accept a String and return Boolean(Yes Uppercase) .
     * it should return true if the String contains at least one number.
     *
     * @param str
     * @return true Boolean Object if the String contains at least one number.
     */
    public static Boolean checkIfStringHasNumber(String str) {

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if (Character.isDigit(eachChar)) {
                return Boolean.valueOf(true);
            }

        }
        System.out.println("NO NUMBER FOUND!@!!!!!");
        return Boolean.valueOf(false);
    }

//IMPORTANT NOTE: what is difference between we return Boolean.valueOf(false) OR  return false
    //first one returns boolean object and second one returns boolean primitive
    //but bottom line returning same thing what is purpose of getting object or primitive?
    //yes returns the same thing, but if you want to store the result into ArrayList,
    // you have to store the object version.
    // Arraylist cannot store primitive data types.
    // Thats why every primitive has reference type
}