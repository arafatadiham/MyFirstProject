package repl_it_Assignments;

public class P100_GetSandwich {

    public static void main(String[] args) {

        String str = "xxbreadjamyy";

        int firstBreadIndex = str.indexOf("bread");
        int lastBreadIndex = str.lastIndexOf("bread");
        String middleWord = str.substring(firstBreadIndex + 5, lastBreadIndex);

        int breadCounter = 0;

            for (int i = 0; i < str.length() - 4; i++) {
                if (str.substring(i, i + 5).equals("bread")) {
                    ++breadCounter;
                }
            }
            if (breadCounter < 2) {
                System.out.println("nothing");

            } else if (breadCounter >= 2) {
                System.out.println(middleWord);
            }
        }

    }

/*

 */