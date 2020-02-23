package day14;

public class EmailChecker {

    public static void main(String[] args) {

        String email="Alden.Cyber@gmail";

        boolean containCharacter= email.contains("@") && !email.contains(" ");

        boolean emailEndWith = email.endsWith("gmail") || email.endsWith("yahoo") || email.endsWith("mail");

        if (containCharacter && emailEndWith){
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
        }



    }


