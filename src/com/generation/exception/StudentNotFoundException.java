package com.generation.exception;

public class StudentNotFoundException
    extends Exception
{

    public StudentNotFoundException(String studentID )
    {
        super( "Student not found!" );
    }
}