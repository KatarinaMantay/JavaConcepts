package dev.kataray.javaconcepts.exceptions;
import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 10;
        System.out.println("enter num to divide with: ");
        int divisor = scan.nextInt();

        //since there is a chance of a user entering 0, we handle with try/catch
        try{
            int c = calculate(num, divisor);
            System.out.println("10/" + divisor + " = " + c);
        } catch (DivideByZeroException e) { //catches error of user dividing by 0
            System.out.println(e.getMessage()); //gets default message we defined
        }
    }

    // a method that throws exception
    public static int calculate(int number, int divide) throws DivideByZeroException {

        // checks the input and throws exception
        if(divide == 0 ){
            throw new DivideByZeroException();
            // throw new DivideByZeroException("You stink"); to use other constructor
        }
        return number/divide;
    }
}