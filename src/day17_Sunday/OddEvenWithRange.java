package day17_Sunday;

public class OddEvenWithRange {

    public static void main(String[] args) {

        int count=0;

        while (count<=50){

            if (count % 2 ==0){
                System.out.println(count + " is even number");
            } else {
                System.out.println(count + " is odd number");
            }
            ++count;
        }


        }

    }

