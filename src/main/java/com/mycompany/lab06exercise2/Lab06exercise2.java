/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab06exercise2;

/**
 *
 * @author Umar
 */

class Person{
    private String fname;
    private String lname;
   
    public Person(String fname , String lname){
        this.fname = fname;
        this.lname = lname;
    }
    String getFirstName(){
        return fname;
    }
    
    void setFirstName(String fname) {
        this.fname = fname;
    }
     public String getLastName() {
        return lname;
    }

    void setLastName(String lname){
        this.lname= lname;
    }
    
    void displayDetails(){
         System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
    }
}

class Student extends Person{
    private String studentId;
    private String course;
    private String teacherName;
    
    Student(String fname, String lname , String studentId , String course , String teacherName ){
           super(fname, lname);
        this.studentId = studentId;
        this.course = course;
        this.teacherName = teacherName;    
          
    }
    
     public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Teacher Name: " + teacherName);
    }
            }

class Teacher extends Person{
    private String subjectName;
    private double salary;
    
     public Teacher(String firstName, String lastName, String subjectName, double salary) {
        super(firstName, lastName);
        this.subjectName = subjectName;
        this.salary = salary;
    }
     
     public void displayDetails(){
          super.displayDetails();
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Salary: Rs= " + salary);
     }
     
}

public class Lab06exercise2 {

    public static void main(String[] args) {
        Student s1 = new Student("Umar","Aqeel","23-Cs-43","OOPs","Sir Saleem");
        Student s2 = new Student("Anus","Aqeel","23-Cs-45","DLD","Miss Anum");
        
        Teacher t1 = new Teacher("Sir", "Saleem", "OOPs", 50000);
        Teacher t2 = new Teacher("Miss", "Anum", "DLD", 55000);
        
System.out.println("Student 1 Details:");
        s1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details:");
        s2.displayDetails();
        System.out.println();

        System.out.println("Teacher 1 Details:");
        t1.displayDetails();
        System.out.println();

        System.out.println("Teacher 2 Details:");
        t2.displayDetails();
    }
}
