package repl_it_Assignments.P224_Person;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person();

        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getAge());
        System.out.println(p1.toString());

        p1.setFirstName("Arafat");
        p1.setLastName("AD");
        p1.setAge(34);
        System.out.println(p1.toString());



        Person p2 = new Person("Al","AD",35);

        System.out.println(p2.getFirstName());
        System.out.println(p2.getLastName());
        System.out.println(p2.getAge());
        System.out.println(p2.toString());


    }

}
