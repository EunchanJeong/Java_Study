class Accounting {
	public static double ValueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static double income;
	
	public static void print() {
		System.out.println("Value of supply : " + ValueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDividend1());
        System.out.println("Dividend 2 : " + getDividend2());
        System.out.println("Dividend 3 : " + getDividend3());
	}

	public static double getDividend1() {
		return income*0.5;
	}
	
	public static double getDividend2() {
		return income*0.3;
	}
	
	public static double getDividend3() {
		return income*0.2;
	}

	public static double getIncome() {
		return ValueOfSupply-getExpense();
	}

	public static double getExpense() {
		return ValueOfSupply*expenseRate;
	}

	public static double getTotal() {
		return ValueOfSupply+ getVAT();
	}

	public static double getVAT() {
		return ValueOfSupply*vatRate;
	}

}
public class AccountingClassApp {
		
	public static void main(String[] args) {

		Accounting.ValueOfSupply = Double.parseDouble(args[0]);
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		
		Accounting.print();
	}


}
