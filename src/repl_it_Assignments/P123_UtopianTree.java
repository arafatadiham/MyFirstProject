package repl_it_Assignments;

public class P123_UtopianTree {
    public static void main(String[] args) {

        int growthRange;

        int currentYearTreeSize;
        int growth1=0;

        for (int i = 1; i <= 10; i++) {

            if (i <= 3) {
                growthRange=1;
                growth1++;

            } else {
                growthRange=2;
                growth1 += 2;

            }
            System.out.println("year "+i+ " -growth "+ growthRange + " cm");
            System.out.println("tree size: "+ growth1+ "cm");
        }
    }
}
