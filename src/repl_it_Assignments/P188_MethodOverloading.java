package repl_it_Assignments;

public class P188_MethodOverloading {

    public static void main(String[] args) {

    int [] intNum = {3, 7, 8, 13, 100};

        System.out.println(findMax(intNum));

        double [] doubleNUM = {3.0, 7.2, 8.7, 13.9};
        System.out.println(findMax(doubleNUM));
    }

    public static int findMax(int [] num){
    int maxNumber = num [0];
     for (int eachItem:num){
        if (eachItem > maxNumber){
            maxNumber=eachItem;
        }
     }
        return maxNumber;
    }

    public static double findMax(double [] numDouble){
        double maxNumberDouble = numDouble [0];
        for (int i = 0; i < numDouble.length; i++) {
                if (numDouble[i] > maxNumberDouble){
                    maxNumberDouble= numDouble[i];
                }
        }

        return maxNumberDouble;
    }
}
