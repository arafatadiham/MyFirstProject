package day35_Sunday;

public class Task_TomatoPrice {
    public static void main(String[] args) {
        //                 0    1    2    3     4   5   6    7   8    9
        String sentence = "I bought 3 tomato and the price was 3,14 each ";

        String[] sentenceSplit = sentence.split(" ");
        String tomatoCount = sentenceSplit[2];
        int count = Integer.parseInt(tomatoCount);

        String priceTomatoString = sentenceSplit[sentenceSplit.length-2];
                priceTomatoString= priceTomatoString.replace(",",".");

        double tomatoPrice= Double.parseDouble(priceTomatoString);

        System.out.println("Count : " + count);
        System.out.println("tomatoPrice : " + tomatoPrice);
        System.out.println("Total price : "+ (count * tomatoPrice));

    }
}
