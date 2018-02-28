package carPayment;

public class Calculator {
	
	private int totalPrice;
	private int downPayment;
	private int lengthOfLoan;
	private double interestRate;
	private double monthlyPayment;
	private double totalInterest;
	
	
	
	
	
	
	public Calculator(int totalPrice, int downPayment, int lengthOfLoan, double interestRate) {
		super();
		this.totalPrice = totalPrice;
		this.downPayment = downPayment;
		this.lengthOfLoan = lengthOfLoan;
		this.interestRate = interestRate;
	}

	public double monthlyPayment() {
		totalPrice -= downPayment;
		monthlyPayment = (double)((interestRate / 12) * totalPrice) / 
				(1 - Math.pow((1 + (interestRate/12)), (lengthOfLoan * -1) ));
		return monthlyPayment;
	}
	
	public double totalInterest() {
		totalPrice -= downPayment;
		totalInterest = 0;
		double interestPerMonth;
		for(int i = 0; i < (lengthOfLoan + 1); i++) {
			interestPerMonth = ((interestRate / 12) * totalPrice);
			totalPrice -= (monthlyPayment - interestPerMonth);
			totalInterest += interestPerMonth;
			}
		return totalInterest;
	}
}
