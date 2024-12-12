package dev.kataray.javaconcepts.exceptions;

// custom exception
public class DivideByZeroException extends Exception{

    // constructor with no params, set a custom error message
    public DivideByZeroException(){
        super("you suck at math");
    }

    // call it with a message, we use the custom message
    public DivideByZeroException(String Message){
        super(Message);
    }
}
