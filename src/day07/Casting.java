package day07;

public class Casting {
    public static void main(String[] args) {


        double bigNum = 10;

        System.out.println(bigNum);

        int num= (int) 12.99;    //----> this will capture only whole number, and ignore the decimal

        System.out.println(num);

        long mile= 1000L;

        int km=(int)mile;
        System.out.println(km);

char grade= 'B';
System.out.println(grade);

int letterInNumber='B';
        System.out.println(letterInNumber);

        int letterInNumber2='b';
        System.out.println(letterInNumber2);

        /// find out the number of each character in your first name

        char letterA= 'a';


        System.out.println(letterA +1);//---->adding a character a int number will result in int
                //(int) letterA  +1

        System.out.println(" "+letterA+1);//----> when the string add a character it will be string


    }
}
