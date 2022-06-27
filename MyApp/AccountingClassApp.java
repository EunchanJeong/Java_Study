class Accounting {
	public static double ValueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	
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
		return getIncome()*0.5;
	}
	
	public static double getDividend2() {
		return getIncome()*0.3;
	}
	
	public static double getDividend3() {
		return getIncome()*0.2;
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
		
		Accounting a1 = new Accounting();
		
		a1.ValueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		System.out.println();
		
		Accounting a2 = new Accounting();
		
		a2.ValueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		System.out.println();
		
		Accounting a3 = new Accounting();
		
		a3.ValueOfSupply = 30000.0;
		a3.vatRate = 0.1;
		a3.expenseRate = 0.3;
		a3.print();
	}


}
