package day56_Sunday.DownCating_HAS_A;

public class ProductTest {


    public static void main(String[] args) {


        Product p1 = new Product("Macbook Pro", 2999);
//        System.out.println( p1.toString() );
        Product p2 = new Product("Sony TV", 499);
        Product p3 = new Product("Sony TV", 499);

       System.out.println("p1==p2 : " + (p1==p2)   );
        System.out.println("p2==p3 : " + (p2==p3)   ) ;// this always gives you false, because t
                                                        // when variable == to other variable, no matter
                                                        // it is permitive or reference type, it gives you false
                                                          //the only thing thing they checking if they have same thing inside
                                                                // which means same address, if they have same address it will be equal ==
                                                                // but here they have different address
        // equals methods is coming from Object class
        // Product extends Object so Product has equals method
        // inherited
        System.out.println("p1.equals(p2) = " + p1.equals(p2));//get False, they are different object
        System.out.println("p2.equals(p3) = " + p2.equals(p3));//get True, because we did castng on Product class -> public boolean equals(Object obj)
                                                                    // even they are different object, but they have same content
        System.out.println("p2.equals(p2) = " + p2.equals(p2));// get True, they ar ethe same object

        Product p4 = p3;
        System.out.println("p4.equals(p3) = " + p4.equals(p3));


        System.out.println("ABC".equals(new String("ABC")));


    }


}