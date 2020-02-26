package repl_it_Assignments;

public class P093_HasAJava {

    public static void main(String[] args) {

        String word = "kjava";
        boolean exists = false;

        if (word.indexOf("java") == 0 || word.indexOf("java") == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/*
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true

Example:
input: c#javaruby
output: false
 */

//        String stored = "";
////        String Index0= stored.substring(0, 4);
////        String Index1= stored.substring(1, 5);
//
//        for (String each: ) {
//
//        }
//
//        for (int i = 0; i < 5; i++) {
//            stored+= word.charAt(i);
//        } if(stored.contains("java")){
//            hasJava=true;
//            System.out.println(hasJava);
//        } else{
//            System.out.println(hasJava);
//        }
//        }

//        if (Index0.equals("java") || Index1.equals("java")){
//                hasJava=true;
//                System.out.println(hasJava);
//            } else if (word.length()<4){
//                System.out.println(hasJava);
//            } else{
//                System.out.println(hasJava);
//            }




