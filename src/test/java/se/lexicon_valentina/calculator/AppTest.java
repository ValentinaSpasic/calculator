package se.lexicon_valentina.calculator;

import org.junit.*;



public class AppTest {
	
	@Test
	public void addition() {
		double number1 = 10.0;
		double number2 = 2.0;
		
		double expected = 12.0;
		
		double result = App.addition(number1, number2);
		
		Assert.assertEquals(expected, result, 0);
	}
	
	@Test
	public void subtract() {
		double number1 = 10.0;
		double number2 = 2.0;
		
		double expected = 8.0;
		
		double result = App.subtract(number1, number2);
		
		Assert.assertEquals(expected, result, 0);
	}
	@Test
	public void multiply() {
		double number1 = 10.0;
		double number2 = 2.0;
		
		double expected = 20.0;
		
		double result = App.multiply(number1, number2);
		
		Assert.assertEquals(expected, result, 0);
	}
	@Test
	public void divsion() {
		double number1 = 10.0;
		double number2 = 2.0;
		
		double expected = 5.0;
		
		double result = App.division(number1, number2);
		
		Assert.assertEquals(expected, result, 0);
	}
	
	@Test
	public void divisionByZero_return_0() {
		double expected = 0;
		
		Assert.assertEquals(expected, App.division(10, 0), 0);
	}
   
}
