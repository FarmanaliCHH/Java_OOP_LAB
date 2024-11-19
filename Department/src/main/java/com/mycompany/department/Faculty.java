
package com.mycompany.department;
import java.util.*;

public class Faculty {
    String FacultyName;
    String FacultyDesignation;
    String FacultyEmail;
    String Facultycontact;
    int FacultySalary;
    int FacultyId;
    ArrayList<Course> Courselist;
    
    Faculty(String Facultyname, String FacultyDesignation, String FacultyEmail, String FacultyContact, int FacultySalary, int FacultyId){
    this.FacultyName=FacultyName;
    this.FacultyDesignation=FacultyDesignation;
    this.FacultyEmail=FacultyEmail;
    this.Facultycontact=Facultycontact;
    this.FacultySalary=FacultySalary;
    this.FacultyId=FacultyId;
    }
    void AssignCourse(Course course){
        Courselist.add(course);
        
        
        
        
        
        
    }}
  
