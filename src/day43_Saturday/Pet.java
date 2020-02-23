package day43_Saturday;

/*
Task:
Pet
  attributes
		type
		name
  constructor :
  		no arg constructor
  			set the breed to "unknown"
  			set the name to "noname"
  		2 args constructor
  			set the name and breed to what the caller passed
 behaviours
 		getters , setters , toString
 		speak
 			accept no parameter
 			according to the type speak following
 				cat --> meow
 				dog --> woof
 				cow --> mooo
 				horse --> neinei

 	Create another class called PetStore with main method
	Create 8 Pet objects with initial value
	Store them into a List<Pet>
	1, print out all info
	2, print out only name
	3, print out only cats
 */

public class Pet {

    String type;
    String name;

    public Pet(){
        this.type = "unknown";
        this.name  = "noname";
    }



    public Pet(String type, String name) {
        this.type = type;
        this.name = name;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Pet{" +
                "breed='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void showGeneralPetInfo(){
        System.out.println( "Pets are friend of Human !!!");

        // System.out.println(name); ---> This does NOT work
        // because Static method can NOT access anything Non-Static
    }

        public void speak() {
            switch (type) {
                case "cat":
                    System.out.println("meow");
                    break;
                case "dog":
                    System.out.println("woof");
                    break;
                case "cow":
                    System.out.println("moo");
                    break;
                case "horse":
                    System.out.println("neinei");
                    break;
                default:
                    System.out.println("unknown animal!");


        }
    }
}
