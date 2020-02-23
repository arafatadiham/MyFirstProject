package Tasks_Akbar;

public class Task_JobTitle {

    public static void main(String[] args) {

        String employee= "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";


        //TASK 1. Print all job titles - hint ( substring, indexOf)

        int startingIndex = employee.indexOf("[")+1;
        int endingIndex= employee.indexOf("]");

        String employeeTitle= employee.substring(startingIndex,endingIndex) ;

        System.out.println("Employee's Title : "+ employeeTitle);

        System.out.println("\n*******Task 2*****");

//TASK 2: Print all FirstName-lastName jobTitle
// for example :
//        Philipa-Salthouse Electrical Engineer
//        Ulrika-Goolding Nuclear Power Engineer



        // logic : get first name ( first word in this sentence)
//                 get last name ( second word in this sentence) put dash in between
//                 then concatenate with the title
        // this will break if we have name more than 2 words

        // logic 2 :  get the full name directly using subString
        //            replace all the space in full name with -
        //            then concatenate with the title

        String fullName=  employee.substring(0, employee.indexOf(" ["));

        System.out.println(fullName);

        String nameWithDash= fullName.replace(" ","-");

        System.out.println(nameWithDash);

        System.out.println(nameWithDash+" " + employeeTitle);


        System.out.println("\n*******Task 3*****");

//TASK 3. Look for those 2 people in the array and assert below data
        /*
        Tracy Bartle should be Geological Engineer
        Skipper Abrahamsson should be Financial Advisor
        if true{
            Print "PASS: Verification successful. Tracy Bartle's job is Geological Engineer
        }else{
            Print "FAIL: Verification error:  Tracy Bartle's job is NOT Geological Engineer
        }
         */

        if (employeeTitle.equals("Electrical Engineer")) {
            System.out.println("PASS: Verification successful.");
        } else {
            System.out.println("FAIL: Verification error: "+employeeTitle);
        }


        System.out.println("\n*******Task 4*****");

//Task 4:  //Print Initials -> Job Title for everyone
        /*
        TB -> Geological Engineer
         */

        // logic :   get the first word and last word of your full name and get first characters of both
        ///          a full name might contains more than 2 words but we only want 2 characters for initials
        // I already have variable fullname that contains fullname
        // Bruce D Wayne  -->> BW
        // get first character using charAt(0) ,
        // get lastname first character using charAt( lastIndexOfSpace +1    )
        System.out.println(fullName.charAt(0) + ""
                + fullName.charAt(fullName.lastIndexOf(" ") + 1)
                + " -> " + employeeTitle);


    }
}
