package day11;

public class LogicalOperator_Single {

    public static void main(String[] args) {

        // && 2 ampersand  & 1 ampersand   -->> Logical AND operator
        // This is used to check both conditions are true at the same time


        System.out.println(5>10 && 9/0==3);//------> result is False, because it just stop running before &&, cause no matter what it will be false after &&;
        //System.out.println(5>10 & 9/0==3); //-----> NO RESULT,:ERROR ------> it will keep running the code after single & , it has error because 9/0 is an error!

        //   about double ||  , and single  |

        System.out.println(10>5 || 9/0==3);//------> result is true at first when system run 10>5, so no matter what is after that it does not run (check), so it will be true because of || ;
       // System.out.println(10>5 | 9/0==3);//------> result is true at first when system run 10>5, the it get Error;


// you have 5 store sin front, and you just want to buy one milk ,
// which mean you just buy one milk from any of the stores and go home.
// ou do need to go each store to ask if they also have milk.






    }

}
