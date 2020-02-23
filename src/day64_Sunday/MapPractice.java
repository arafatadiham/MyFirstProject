package day64_Sunday;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

        // what if you want to have multiple value for one key ?
        // for example groupCode ----> group members
                    // String     List <String>

        Map<String, List<String> > groupMap = new HashMap<>();

        groupMap.put ("PowerOf4", Arrays.asList("Furkan","Daria","Serife","Muge"));
        groupMap.put("Achievers", Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like",
                "Aytem", "Yerkhanat"));
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seymaumeyyra","Huvayda"));

       // System.out.println("groupMap = " + groupMap);

        // we can use Lamba for nice order
        groupMap.forEach( (groupCode,allMembers) -> System.out.println("groupCode = " + groupCode +"\n\t members : "+ allMembers ) );

        //What if we want ti get spicific member from one group ( if we know the index for that member) :
        System.out.println(groupMap.get("Achievers").get(3));

        // check whether this map has Gulzina or not in BugHunter ?
        // get method from Map | contains method is coming from list
        // because the values are List<String> get method will return the entire List
        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));

        // we want to add a group entry so we can add or remove members from the group

        groupMap.put("Justice League", new ArrayList<>(Arrays.asList("Superman", "Batman", "WonderWoman")));
        groupMap.get("Justice League").add("Flash");
        System.out.println("groupMap.get(\"Justice League\") = " + groupMap.get("Justice League"));

        // the key for the Map should be a type Immutable

    }


}
