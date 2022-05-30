/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered plagiarism
 *
 * Student Name: Iman Syakir
 * Student ID: 21014919
 * Class: W64N
 * Date/Time created: Monday 30-05-2022 11:54
 */

/**
 * @author 21014919
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public int add (int a, int b) {
		
		return a + b;

	}
	
	public int subtract (int a, int b) {
		
		return a - b;
		
	}
	
	public int multiply (int a, int b) {
		
		return a * b;
		
	}
	
	public int divide (int a, int b) {
		
		if(b == 0) {
			throw new IllegalArgumentException();
		}
		
		return a / b;
		
		
	}
	


}
