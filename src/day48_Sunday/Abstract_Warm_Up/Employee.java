package day48_Sunday.Abstract_Warm_Up;

public abstract class Employee {

    String name;
    int id;

    //add constructor

    public Employee(){

    }

    // WHY DO WE HAVE CONSTRUCTOR HERE;
    // WE CAN NOT CREATE AN OBJECT OUT OF IT ?
    // WHAT IS THE POINT?
    // SO SUB-CLASS CAN REUSE THE CODE OF setting ID and
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void calculateAnnualSalary ();


    public abstract String toString();

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