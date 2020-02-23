package day32_Sunday;

public class MethodWithReturnIntro {
    public static void main(String[] args) {

       String name=  giveMeMyName();
        System.out.println("name = " + name);

        int myResult =  doubleTheNumber(10);
        System.out.println("myResult = " +myResult); //---- > this is the first way to do that.

        System.out.println("result of doubling 100 is " + doubleTheNumber(100));//----> the second way to do that

        int add14to16Result = add2Numbers(14, 16);
        System.out.println("add 14 to 16 Result = " + add14to16Result);

        System.out.println(add2Numbers(14, 16) + 5);

    }

    // create a method called add , accept 2 int parameter
    // and return the result as int
    //
    public static int add2Numbers(int num1, int num2) {
        // int sum = num1+num2;
        // return sum ;
        return num1 + num2;

    }



    public static int doubleTheNumber( int num){
        System.out.println("I am going to double value of " + num);
        int result = num * 2;
        return result; //----> the whole purpose of Return a value is : we can save the result  after calling the method;
                        //---> and use it somewhere else later
    }

    public static String giveMeMyName (){

        // assume getting my name
        // is multi steps complex operations
        return "Alden";

    }

}
