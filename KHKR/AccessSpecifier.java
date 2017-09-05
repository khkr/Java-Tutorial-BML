public class AccessSpecifier
{
	public static void main(String[] args) 
	{

		//Access specifiers
		//They define the amount of access that others can have over a particular object or component
		//4 types: public, private,protected,default

		//Area object
		BankAccount khkr = new BankAccount();

		khkr.i = 10;

		khkr.j = 20;

		khkr.printBankBalance();

		khkr.bankBalance = 20000;
		

	}
}

class BankAccount
{
	public int i;
	protected int j;
	private int bankBalance = 10000;

	protected void printI()
	{
		System.out.println(i);
	}

	void printJ()
	{

		System.out.println(j);
	}

	void printBankBalance()
	{
		System.out.println(bankBalance);
	}
}