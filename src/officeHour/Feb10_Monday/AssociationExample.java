package officeHour.Feb10_Monday;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    String studentName;


    public Student (String studentName){
        this.studentName = studentName;
    }


    @Override
    public String toString (){
        return studentName;
    }
        }

        class School {
     String schoolName;
     List<Student> AllStudentsList;

     public School (String schoolName,List<Student> AllStudentsList){
         this.schoolName=schoolName;
         this.AllStudentsList = AllStudentsList;
     }

     public void AddNewStudent(Student Student){

         this.AllStudentsList.add(Student);

     }

     public void AddNewStudent (Student[] students){
         this.AllStudentsList.addAll(Arrays.asList(students));
     }

     public void AddNewStudent (List<Student> listOfStudents ){
         this.AllStudentsList.addAll(listOfStudents);
     }

            @Override
            public String toString() {
                return "" + AllStudentsList;
            }

        }


public class AssociationExample {

    public static void main(String[] args) {
        Student s1 = new Student ("Hasan");
        System.out.println(s1);
        System.out.println(s1.studentName);

        Student s2 = new Student ( "Muge");
        Student s3 = new Student ( "Aiko");
        Student s4 = new Student ( "Abdul");
        Student s5 = new Student ( "Asat");

        List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
        System.out.println(list);


        School cybertek = new School("Cybertek",list);
        cybertek.AddNewStudent(new Student ("Irina"));
        cybertek.AddNewStudent(new Student ("Denis"));

        Student [] students = {
                new Student  ("Gulnaz"),
                new Student  ("Rukhshona")
        };

        cybertek.AddNewStudent(students);

        System.out.println(cybertek.AllStudentsList);
      //  System.out.println(cybertek.schoolName); //Cybertek

        for (Student eachStudent : cybertek.AllStudentsList){
            System.out.println(eachStudent);
        }

        System.out.println(cybertek);

    }

}
