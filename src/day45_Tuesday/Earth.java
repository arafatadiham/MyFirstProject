package day45_Tuesday;

public class Earth extends Planet{


//    double gravity;
//    int radius;
//    boolean hasLife;
    int population;

// practical usage of super() keyword to call super class constructor is
    //to reuse the functionality of super class constructor in sub class constructor

    public Earth (double gravity , int radius, boolean hasLife, int population){

       super (gravity, radius, hasLife);
//        this.gravity = gravity;
//        this.radius = radius;
//        this.hasLife = hasLife;

        this.population = population;

    }


    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }

    public static void main(String[] args) {

        Earth e1 =  new Earth (9.81, 5000, true,7000);
        System.out.println("e1 = " +e1.toString());
    }

}
