package day48_Sunday.Abstract_Warm_Up;

import day48_Sunday.Abstract_Warm_Up.Employee;

public class HourlyEmployee extends Employee {

    double hourlyWage;
    int numbersOfHours; // annual hours worded


    public HourlyEmployee(String name, int id, double hourlyWage, int numbersOfHours){
        super (name, id);
        this.hourlyWage = hourlyWage;
        this.numbersOfHours = numbersOfHours;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Hourly Employee yearly : " + (hourlyWage * numbersOfHours));
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numbersOfHours=" + numbersOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                " , yearly salary = " + (hourlyWage * numbersOfHours)+
                '}';
    }
}



