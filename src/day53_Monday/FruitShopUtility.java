package day53_Monday;

public class FruitShopUtility {

    public static void main(String[] args) {

        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);

        System.out.println("~~~~~Digest better call~~~~ \n");

        digestBetter(f2);
        digestBetter(new Orange ("sweet","yellowish", 1));

        System.out.println("----------getMyFavoriteFruit call ----------------");
        Fruit x = getMyFavoriteFruit();
        x.getDigested();
        System.out.println("B15 Favorite Fruit = " + x);

        System.out.println("----------getFavoriteByType call ----------------");
        System.out.println("getFavoriteByType(1) = " + getFavoriteByType(1));
        System.out.println("getFavoriteByType(2) = " + getFavoriteByType(2));
        System.out.println("getFavoriteByType(2) = " + getFavoriteByType(3));

    }

    // 1. Create a method called digestBetter
    //it accept a Fruit as parameter type
    // and inside the method , it will digest the Fruit object 4 times the displayInformation

    public static void digestBetter(Fruit fourTimes){
        fourTimes.getDigested();
        fourTimes.getDigested();
        fourTimes.getDigested();
        fourTimes.getDigested();
        System.out.println("fot times = " + fourTimes );
    }

    // 2. displayFruit
    public static void displayFruit( Fruit anyFruit){
        System.out.println("Displaying fruit \n" + anyFruit.toString() );
    }

    // 3. Create a static method called getMyFavoriteFruit
    //accept no parameter and return your Favorite Fruit object

    public static Fruit getMyFavoriteFruit() {
        //Fruit f = new Orange("cripsy", "green", 100);
//        Fruit f = new Apple("Sweet", "blue", "Ginger");
//        return f;
//        return new Orange("cripsy", "green", 100);
        return new Apple("Sweet", "blue", "Ginger");
    }

    // 4. Create a static method called GetFavoriteByType
    // it has one int parameter
    // return favorite apple object if type is 1 , orange object if type 2
    public static Fruit getFavoriteByType(int type) {

        if (type == 1) {
            return new Apple("Sweet", "blue", "Ginger");
        } else if (type == 2) {
            return new Orange("cripsy", "green", 100);
        } else {
            // we can return null for any method that return reference type
            // because null can be assigned to a reference type variable
            return null;
        }
    }

}
