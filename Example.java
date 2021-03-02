import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.*;


class Student {
   String name; 
   int age; 
   int id; 
   public String getName() {
      return name; 
   } 
   public int getAge() { 
      return age; 
   } 
   public int getId() { 
      return id; 
   } 
   Student(String n, int a, int i){ 
      name = n; 
      age = a; 
      id = i; 
   } 
   
    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

	public int compare(Student s1, Student s2) {
	   String StudentName1 = s1.getName().toUpperCase();
	   String StudentName2 = s2.getName().toUpperCase();

	   //ascending order
	   return StudentName1.compareTo(StudentName2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};
   @Override public String toString() {     
      return ("Student[ "+"Name:"+this.getName()+             
              " Age: "+ this.getAge() +                     
              " Id: "+ this.getId()+"]"); 
   }
}
public class Example {
   public static void main(String[] args) {
      List<Student> studentlist = new ArrayList<Student>();
      studentlist.add(new Student("Jon", 22, 1001)); 
      studentlist.add(new Student("Steve", 19, 1003)); 
      studentlist.add(new Student("Kevin", 23, 1005)); 
      studentlist.add(new Student("Ron", 20, 1010)); 
      studentlist.add(new Student("Lucy", 18, 1111));
     // System.out.println("Before Sorting the student data:"); 
 
      //java 8 forEach for printing the list 
      studentlist.forEach((s)->System.out.println(s));

      System.out.println("After Sorting the student data by Age:"); 
            System.out.println("____________________"); 

	   Collections.sort(studentlist, Student.StuNameComparator);

      studentlist.forEach((s)->System.out.println(s));


     /*Lambda expression for sorting the list by student name       
      studentlist.sort((Student s1, Student s2)->s1.getName().compareTo(s2.getName())); 
      studentlist.forEach((s)->System.out.println(s));        
      System.out.println("After Sorting the student data by Id:"); 
      */
      
      
      
     
      
      
   }
}
