package day20_Wednesday;

public class ReversingAString {
    public static void main(String[] args) {

        //Give a String variable name with value
        //reverse this name and store reversed value into
        //another String variable reversedName

        //             01234567
        String name = "Jon Snow";
        String reversedName = "" ;

        System.out.println();

        for ( int x = 7; x>=0; x--) {
            System.out.print (x + " index : ");

            char currentChar = name.charAt( x );
            System.out.println(name.charAt( x ));

            reversedName = reversedName + currentChar;
        }


    }
}

// This is all we needed
//        for (int x = lastCharIndex ; x >= 0 ; x-- ){
//
//            reversedName = reversedName + name.charAt( x ) ;
//
//        }
//
//        System.out.println("reversedName = " + reversedName);

//        System.out.print(name.charAt(7));
//        System.out.print(name.charAt(6));
//        System.out.print(name.charAt(5));
//        System.out.print(name.charAt(4));
//        System.out.print(name.charAt(3));
//        System.out.print(name.charAt(2));
//        System.out.print(name.charAt(1));
//        System.out.print(name.charAt(0));