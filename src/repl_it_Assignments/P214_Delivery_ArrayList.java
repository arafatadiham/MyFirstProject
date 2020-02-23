package repl_it_Assignments;

import java.util.ArrayList;

public class P214_Delivery_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5

    }


    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {

        int totalFuelAmount=0;
        for (Integer fuelForEachPlace : deliveries){
            totalFuelAmount = totalFuelAmount + fuelForEachPlace;
        }
        int countOfStop = (totalFuelAmount / max_fuel);
        if (totalFuelAmount % max_fuel !=0){
            countOfStop++;
        }
               return countOfStop;
    }


}
