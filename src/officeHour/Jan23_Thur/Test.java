package officeHour.Jan23_Thur;

public class Test {

    public Test(String str) {
        System.out.println("Name is: " + str);
    }


    public static void method() {
        int a = 100;  // local variable
        System.out.println(a);

        //  Test  obj1 = new Test(10); object MUST be created with Existing constructor
        // Test obj2 = new Test();
    }

    public static void main(String[] args) {
        method();
        //  Test("Muhammed");
        // System.out.println(a); // a is local vairable.

        Practice_01_23_2020.staticMethod();

        Practice_01_23_2020 obj = new Practice_01_23_2020();
        obj.staticMethod();  // static is shared by all the objects of the class.
        // static should be called static way: through the class name
        if (true) {
            int b = 100;
        }

        // System.out.println(b); // local variables cannot be used outside the method or blocks

        Test obj2 = new Test("Mohammed"); //

    }



}
