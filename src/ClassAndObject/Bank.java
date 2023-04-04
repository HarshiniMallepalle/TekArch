package ClassAndObject;
/*4> Polymorphism. 
 Create class for Account. Create class for Savings Account. Create class for Current Account. In the Account class 
 create a function for WithdrawAmount(). In the Account class create a function for Make Payment(). In the WithdrawAmount
  function Add charges to withdraw only if it    is a current account. Extra 10%. Your account class will have double 
  Balance; -> property. Add a property in Current account “ExtraCharges”. when withdraw amount, If its current account
   Also add from ExtraCharges and print it.
  */
class Account {
	 double Balance,amount = 5000;
	
	void withDrawAmount() {
		System.out.println("With draw Amount from Account :"+amount);
	}
	void makePayment() {
		System.out.println("Make payment to Account");
	}
	
}
class SavingAccount extends Account {
}
class CurrentAccount extends Account {
	double ExtraCharges;
	void withDrawAmount() { // overriding
	ExtraCharges =amount- amount*0.1;
		System.out.println("Extra 10% charges if we withdraw in Current Account :"+ExtraCharges);
	}
	
}
public class Bank {
	public static void main(String[] args) {
	

		Account a = new Account();
		a.withDrawAmount();
	    CurrentAccount c = new CurrentAccount();
	 	c.withDrawAmount();
		
	}
}
