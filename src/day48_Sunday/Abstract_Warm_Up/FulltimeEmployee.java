package day48_Sunday.Abstract_Warm_Up;

import day48_Sunday.Abstract_Warm_Up.Employee;

// a non-abstract sub class of abstract super class
// is called concrete class
// This class is responsible providing body (implementation)
// for all abstract methods from super class.
public class FulltimeEmployee extends Employee {

    double monthlySalary;

    public FulltimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
//        this.name = name ;
//        this.id = id ;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Fulltime Employee yearly : " + monthlySalary * 12);
    }
    @Override
    public String toString() {
        return "Full timeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                " , Yearly : " + monthlySalary * 12 +
                '}';
    }
}

/*
Warm up
----------
abstract super class called Employee
instance fields : name , id
Constructor : to set all the fields
abstract methods :
		calculateAnualSalary
		toString
HourlyEmployee
instance fields :
	hourlyWage , numsOfHours ,
Constructor : to set all the fields
instance methods ;
	calculateAnualSalary
	toString
----------------
FullTimeEmployee
	instance fields :
		 monthlySalary
Constructor : to set all the fields
instance methods ;
	calculateAnualSalary
	toString
 */