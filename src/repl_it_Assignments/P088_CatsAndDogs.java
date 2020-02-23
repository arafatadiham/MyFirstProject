package repl_it_Assignments;

import java.util.Scanner;

public class P088_CatsAndDogs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        boolean catDog=true;
        //                                    012345678
/*int catLocation= word.indexOf("cat");----> "catdogcat"

        System.out.println(catLocation);===> 0

        int secondCat=word.indexOf("cat",catLocation+1);---->
        System.out.println(secondCat);---->6
        String cat =word.substring(1,4);----->
        System.out.println(cat);
     */

       String firstCatword = word.substring(word.indexOf("cat"));


while (word.length()>0) {
    if (word.contains("cat") && word.contains("dog"))

    countOfCats++;
    countOfDogs++;

}
        if (word.contains("cat")&& word.contains("dog") && countOfDogs==countOfCats){
            System.out.println (catDog);

        } else {
            System.out.println(!catDog);
        }




    }
}
