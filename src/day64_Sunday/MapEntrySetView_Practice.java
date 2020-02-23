package day64_Sunday;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetView_Practice {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "Female");
        employeeMap.put("Winfred", "Male");
        employeeMap.put("Jereme", "Male");
        employeeMap.put("Glad", "Female");
        employeeMap.put("Desirae", "Female");
        employeeMap.put("Kakalina", "Female");
        employeeMap.put("Bertrando", "Male");
        employeeMap.put("Ajay", "Female");
        employeeMap.put("Brigitte", "Female");
        employeeMap.put("Derk", "Male");
        employeeMap.put("Orlando", "Male");
        employeeMap.put("Selle", "Female");
        employeeMap.put("Marika", "Female");
        employeeMap.put("Griffy", "Male");
        employeeMap.put("Shanon", "Female");
        employeeMap.put("Clerkclaude", "Male");
        employeeMap.put("Rickard", "Male");
        employeeMap.put("Job", "Male");
        employeeMap.put("Aida", "Female");
        employeeMap.put("Alonzo", "Male");

        System.out.println("employeeMap = " + employeeMap);

        //TASK 1 : Get the name of all the Female from map

        Set< Map.Entry<String,String> > entryView = employeeMap.entrySet() ;
//        for( Map.Entry<String,String> eachEmployee :   entryView ){
//        }

        //below is one shot:
        for (Map.Entry<String, String> eachEmployee : employeeMap.entrySet()) {
            if (eachEmployee.getValue().equals("Female")) {
                System.out.println("Female Employee name = " + eachEmployee.getKey());
            }
        }

        //TASK 2 :  update the Female to Queen and Male to King

        for (Map.Entry<String, String> eachEmployee : employeeMap.entrySet()) {
            if (eachEmployee.getValue().equals("Female")) {
                eachEmployee.setValue("Queen");
            } else {
                eachEmployee.setValue("King");
            }

        }
        System.out.println("employeeMap = " + employeeMap);
    }
}