package com.generation;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent(new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent(new Student( "Ian", "1020", 28 ) );
        studentService.addStudent(new Student( "Elise", "1010", 26 ) );
        studentService.addStudent(new Student( "Santiago", "1000", 33 ) );

        studentService.enrollStudents( "Math", "1030" );
        studentService.enrollStudents( "Math", "1020" );
        
        studentService.enrollStudents( "History", "1010");
        studentService.enrollStudents( "History", "1000" );
        
        studentService.showAllCourses();
        studentService.showEnrolledStudents("Math");
        studentService.showEnrolledStudents("History");
    }
}