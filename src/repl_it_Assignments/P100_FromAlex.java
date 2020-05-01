package repl_it_Assignments;

public class P100_FromAlex {
    public static void main(String[] args) {

        mymethod("xxbreadJAMbreadyy");

    }

    public static void mymethod(String str) {
        int firstBreadIndex = str.indexOf("bread");
        int lastBreadIndex = str.lastIndexOf("bread");
        String myreturn = (firstBreadIndex == lastBreadIndex) ? "nothing"
                : str.substring(firstBreadIndex + 5, lastBreadIndex);

    }
}