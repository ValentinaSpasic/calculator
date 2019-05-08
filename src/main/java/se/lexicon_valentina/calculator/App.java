package se.lexicon_valentina.calculator;

/**
 * 
 * @author Valentina Spasic
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static double addition(double number1, double number2) {
    	double result = number1 + number2;
    	return result;    	
    }
    
    public static double subtract (double number1, double number2) {
    	double result = number1 - number2;
    	return result;    	
    }
    
    public static double multiply (double number1, double number2) {
    	double result = number1 * number2;
    	return result;    	
    }
    
    public static double division (double number1, double number2) {			
    			
    	if (number1 == 0 || number2 == 0) {
    		return 0;
    	}
    	double result = number1 / number2;
    	return result;    	
    }
    
}
