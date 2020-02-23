package repl_it_Assignments.P232_Overriding_Education;

public class EducationalInstitution {

    private int years;


    public EducationalInstitution(){

    }

    public EducationalInstitution(int years) {
        this.years = years;
    }

    public String graduationRequirements (){
        return years + " years of study";
    }



}
