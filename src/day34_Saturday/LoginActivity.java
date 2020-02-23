package day34_Saturday;

public class LoginActivity {

    public static void main(String[] args) {

      /*
        1, login1 :
        static void method
	    it has two String method parameters
			called username and password
	    (it accept 2 String object as argument when being called)
	    it check whether username and password  "user" and "abc123"
	    if yes
		print login successful
	    else
		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)

        2, login2 :
        static method boolean return type
	    it has two String method parameters
			called username and password
	    (it accept 2 String object as argument when being called)
	    it check whether username and password  "user" and "abc123"
	if yes
		return true
	else
		return false

       */

      loginVoid("my username", "abc123");
        loginVoid("user", "abc123");


        boolean result = loginReturn("user","abc123");
        System.out.println("result = " + result);

        System.out.println("Second run " + loginReturn("aaa","bbb"));
     //   System.out.println("Second run " + loginVoid("aaa","bbb"); ---> this will NOT work, cause VOID.

    }

public static void loginVoid(String userName, String password){
        if (userName.equalsIgnoreCase("user") && password.equals("abc123")){
            System.out.println("login successful");
        } else {
            System.out.println("login failed");
        }
}

public static boolean loginReturn(String user, String password) {

        // thi is one way to do it :
//    if (user.equalsIgnoreCase("user") && password.equals("abc123")){
//       return true;
//    } else {
//       return false;
//    }

    // the second way to do it is :

    return user.equals("user") && password.equals("abc123");

}

}
