package Tasks_Akbar;

public class ImportantChar {
    public static void main(String[] args) {
        //Task 1:
        String aName = "Jane";
        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);
        System.out.println( c1 + c2 + c3 + c4); //382 total of ASCII codes
        System.out.println(c1 + c2 + c3 +" "+ c4); // 281 e
        System.out.println(c1 + "" + c2 + c3 + c4); // Jane
        System.out.println("" + c1  + c2 + c3 + c4); // Jane

        // Task2:
        int a = 130;
        byte b = (byte) (a * 2);
        System.out.print(b);
    }
}
