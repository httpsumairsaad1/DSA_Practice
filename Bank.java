
public class Bank {
	public Bank() 
	{
		System.out.println("******************************************"
				+ "\n WELCOME TO THE JAVA BANK"
				+ "\n******************************************");
	}
	static class Person
	{	
		private double totalAmount;
		private String name, location;
		private int age;
		public Person( String n, int a, String loc)
		{
			this.age =a;
			this.location=loc;
			this.name=n;
		}
		public void data()
		{
			System.out.println(
					"Name = "+this.name+", Age = "+this.age+", Location = "+this.location);
		}
		public String returnName()
		{
			return this.name;
		}
		public double deposit( double add )
		{
			totalAmount += add;
			return balanceIncuiry();
		}
		public double balanceIncuiry()
		{
			return totalAmount;
		}
		public double withdraw( double wd )
		{
			if(wd>totalAmount)
			{
				System.out.println("Avaiable balance is insufficient!");
			}
			else
			{
				totalAmount= totalAmount-wd;
			}
			return totalAmount;
		}
		public Person transferMoney( Person s, double amount)
		{
			if( this.totalAmount>amount )
			{
				s.deposit(amount);
				this.withdraw(20);
			}
			return s;
		}
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Person rizwan = new Person("Mr.Rizwan", 28, "Sukkur");
		Person safia = new Person("Miss. Safia", 25, "Karachi");
		Person [] list = {rizwan, safia};
		for(Person p: list) {
			p.data();
		}
		System.out.println();
		System.out.println(rizwan.returnName() + ", Total balance in account: " + rizwan.deposit(155.4));
		System.out.println(rizwan.returnName() + ", Total balance in account: "+ rizwan.deposit(100));
		System.out.println(rizwan.returnName() + "\'s, Current balance is: " + rizwan.balanceIncuiry());
		System.out.println(rizwan.returnName() + ", Withdraw: "+37
				+ ", Total balance in account: "+rizwan.withdraw(37));
		
		System.out.println();
		System.out.println();
		System.out.println(safia.returnName() + ", Total balance in account: "+ safia.deposit(70));
		double withdraw=110.00;
		System.out.println(safia.returnName() + ", Withdraw: "+withdraw 
									+ ", Total balance in account: "+safia.withdraw(withdraw));
		System.out.println();
		System.out.println(rizwan.returnName() + ", Transfer="+20+" to: "+ safia.returnName());
		safia = rizwan.transferMoney(safia, 20);	//20 is amount. 
		System.out.println(safia.returnName() + "\'s, Current balance is: " + safia.balanceIncuiry());
		System.out.println(rizwan.returnName() + "\'s, Current balance is: " + rizwan.balanceIncuiry());
		
		//deposit
		//withdraw
		//balanceInquiry
		//transfer
	}

}
