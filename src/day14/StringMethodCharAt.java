package day14;

public class StringMethodCharAt {

    public static void main(String[] args) {

        String name = "Alden";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
  //      System.out.println(name.charAt(5));

String aName = "Arya";
char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);
// never add c1+c2+c3+c4 in sout, it will give you total number of ASCII table for Char;
        System.out.println(c1 + " " + c2 + " "+ c3+ " "+ c4+ " ");


    }

}
