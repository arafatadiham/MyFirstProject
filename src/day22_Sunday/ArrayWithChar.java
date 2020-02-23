package day22_Sunday;

public class ArrayWithChar {

    public static void main(String[] args) {

        // Create a char array that hold all the letters from your first name
        // and assign values using each characters of your first name
        // then print out each character

        char [] name = new char[5];
        // What default value do we get for char array
        // we get a char represented by ascii code 0

        System.out.println("<" + name[0] + ">");

        name [0]= 'A';
        name [1]= 'l';
        name [2]= 'd';
        name [3]= 'e';
        name [4]= 'n';

        System.out.print(name[0]);
        System.out.print(name[1]);
        System.out.print(name[2]);
        System.out.print(name[3]);
        System.out.println(name[4]);

        // THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        // AND THIS IS ONLY FOR CHAR ARRAY , ANYTHING ELSE WILL PRINT MEMORY ADDRESS
        //System.out.println( nameChars  );


        boolean[] yesNo = new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = 10 > 7;//true

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);


    }
}
