package day63_Saturday;

import java.util.HashMap;
import java.util.Map;

public class Grocery {

    public static void main(String[] args) {

        Map<String, Double> groceryItem = new HashMap<>();

        groceryItem.put("potato",3.0);
        groceryItem.put("celery",4.0);
        groceryItem.put("cucamber",5.0);
        groceryItem.put("carat",4.50);
        groceryItem.put("pepper",2.50);

        groceryItem.putIfAbsent("carat", 1.8);
        groceryItem.putIfAbsent("milk",2.8);

        System.out.println("groceryItem = " + groceryItem);

        System.out.println("groceryItem.size() = " + groceryItem.size());

       // this is  how we get an value according to the key:
        System.out.println("groceryItem.get(\"celery\") = " + groceryItem.get("celery"));

        groceryItem.replace("potato", groceryItem.get("potato") *2);

        System.out.println("groceryItem.get(\"potato\") = " + groceryItem.get("potato"));

        //checking if one specific item is exicting :

        if(groceryItem.containsKey("pepper")){
            groceryItem.remove("pepper");
            System.out.println("No More pepper");
        }
        System.out.println("groceryItem after removing pepper = " + groceryItem);

    }

}
