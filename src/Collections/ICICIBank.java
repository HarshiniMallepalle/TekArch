package Collections;

public class ICICIBank implements USBank, UKBank, BrazilBank {

	public void carLoan() {
		System.out.println("CarLoan from ICICIBank");
	}

	public void HomeLoan() {
		System.out.println("HomeLoan from ICICIBank");
	}

	public static void main(String[] args) {


	     ICICIBank bank = new ICICIBank();
	     bank.carLoan();
	     bank.HomeLoan();
	     bank.credit();
	     bank.debit();
	     bank.mutualfund();
	     bank.transferMoney();
	     bank.bikeLoan();
		System.out.println(name);
		System.out.println(num);

	}

	@Override
	public void mutualfund() {
		System.out.println("MutualFund from BrazilBank");
	}

	@Override
	public void transferMoney() {
		System.out.println("TransferMoney from UKBank");
	}

	@Override
	public void credit() {
		System.out.println("Credit from USBank & BrazilBank. Body we should define what ever we want");
	}

	@Override
	public void debit() {
		System.out.println("Debit from USBank");		
    }

	@Override
	public void bikeLoan() {
		System.out.println("BikeLoan from Brazil Bank");
		
	}
	

}
