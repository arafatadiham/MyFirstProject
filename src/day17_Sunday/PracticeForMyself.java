package day17_Sunday;

public class PracticeForMyself {

    public static void main(String[] args) {

        String name= "aLdEN";

      String nameFixed= name.toUpperCase().substring(0,1);

      nameFixed += name.toLowerCase().substring(1);

      // PLEASE NOTE: "nameFixed += " ---->mean nameFixed = nameFixed +

        System.out.println(nameFixed);

    }
}
