import java.util.Scanner;


public class Main{


    public static void main(String[] args){
        //8 primitive types
        //byte - -128 and a maximum value of 127 (inclusive)
        //short - -32,768 and a maximum value of 32,767 (inclusive)
        //int - -2,147,483,648 to 2,147,483,647
        //long - -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //double - Stores decimal numbers. Sufficient for storing 15 decimal digits
        //float - Stores decimal numbers. Sufficient for storing 6 to 7 decimal digits
        //boolean - true and false values
        //char - single char such as A, a, & , $

        //declare x 
        // int x;
        // //intialize means to give a value
        // x = 5;
        // byte b = 125;
        // System.out.println(b);

        // short bValue = 21000;
        // System.out.println(bValue);
        // int x = 5;
        // System.out.println(x);

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to multiply or divide");
        // == checks memory location of values this is best used with primitive types
        // .equals() - checks if two objects match.
        String multiOrDiv = input.nextLine();
        if(multiOrDiv.equals("multiply")){
            System.out.println("Enter your first value");
            String value = input.nextLine();
            //convert the value entered as a String to a double
            double pValue = Double.parseDouble(value);
            System.out.println("Enter your second value");
            double value2 = input.nextDouble();
            double outcome = multiply(pValue, value2);
            System.out.println(outcome);
        }else if(multiOrDiv.equals("divide")){
            System.out.println("Enter your first value");
            String value = input.nextLine();
            //convert the value entered as a String to a double
            double pValue = Double.parseDouble(value);
            System.out.println("Enter your second value");
            double value2 = input.nextDouble();
            double outcome = divide(pValue, value2);
            System.out.println(outcome);
        }else{
            System.out.println("Uh you didn't enter what I asked for...");
        }
        //Multiply
        //Divide
        //Want the user to be able to choose if they want to multiply or divide. 
            //if -else statement
        //Get user input. Scanner. 
       
        // multiply(3, 5);
        input.close();

    }

    public static double multiply(double a, double b){
        double product =  a*b;
        return product;

        // return a*b;
        //this is the code I would use if my return type was void
        // System.out.println(a*b);
     }

     public static double divide(double a, double b){
        double quotation = a/b;
        return quotation;
     }

   

}