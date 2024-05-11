//last-modified: October 2, 2022, 1:45:11 PM
//Umair Saad

public class IbaCafeteria {
	public IbaCafeteria()
	{
		System.out.println("Cafeteria is Open\n"
				+ "1. Pizza\n"
				+ "2. fingerFries\n"
				+ "3. juice\n"
				+ "4. Sandwich\n\n");
	}
	
	//queue class.
	static class Queue
	{
		private static int[] tokenNo;
		private static int[] customers;
		private static int generate=79;
		private static int[] time;
		private static int endPerson = 0;
		private static int t=0;
		
		public Queue( int Ncustomers )
		{
			customers = new int[Ncustomers];
			tokenNo = new int[Ncustomers];		//	N customers ? N token Numbers
			time = new int[Ncustomers];
		}
		
		//similar to enqueue.
		public void newCustomer(int order)
		{
			if(order<1 || order>4)
			{
				endPerson++;
				customers[endPerson] = -1;
				System.out.println("Invalid choice for customer " + endPerson);
				
			}
			else
			{
				if( endPerson == customers.length )
				{
					System.out.println("\nThere is no Customer number "+ (++endPerson) +" in a waiting line.\n");
				}
				else
				{
					customers[endPerson] = order;
					tokenNo[endPerson] = generate;
					generate += 10;		//generate token
					time[endPerson] = t;	
					t+=20;		// avg time
					++endPerson;
				}
			}
			return;
		}
		public void display()
		{
			System.out.println("\nOrder_No\tExpected waititng time(seconds)\t\tCustomerChoiceNumber");
			for(int i=0; i<customers.length; i++)
			{
				System.out.println(tokenNo[i] + "\t|\t\t" + time[i] + "\t\t\t|\t\t"+ customers[i]);
			}
		}
	}
	public static void main(String[] args) {
		IbaCafeteria display = new IbaCafeteria();
		Queue ctm = new Queue(6);
		ctm.newCustomer(5);		// (1 to 4) 
		ctm.newCustomer(2);
		ctm.newCustomer(1);
		ctm.newCustomer(4);
		ctm.newCustomer(7);
		ctm.newCustomer(4);
		ctm.display();
		
		ctm.newCustomer(4);
		
	}

}
