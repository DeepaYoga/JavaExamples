package javaExamples;

public class BankAccount {
	
	Long accountNumber=12345678l;
	String accountName="Deepa";
	int accountBalance=500;
	
	

	public static void main(String[] args) {
		BankAccount account=new BankAccount();
		account.accountBalance();
		account.accountName();
		account.accountNumber();

	}

	private void accountNumber() {
	System.out.println("Account number is:" + accountNumber);		
	}



	private void accountName() {
		// TODO Auto-generated method stub
		
	}



	private void accountBalance() {
		System.out.println("Account bakance is:"+ accountBalance);// TODO Auto-generated method stub
		
	}

}
