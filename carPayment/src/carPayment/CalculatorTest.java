package carPayment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator calc = new Calculator(35000, 0, 60, .10);
		
		assertEquals(743.65, calc.monthlyPayment(), 0.1);
		assertEquals(9618.79, calc.totalInterest(), 0.1);
		
		fail("Not yet implemented");
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator(35000, 0, 60, .10);
		System.out.println(calc.monthlyPayment());
		System.out.println(calc.totalInterest());
	}

}
