package taxiBooking2;
import java.util.Scanner;
public class MainClass 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		boolean loop = true;
		
		while(loop)
		{
			System.out.println(" \t Choose any one Information about 'TAXI' \t\n1.Book Taxi \t\n2.Display Yaxi Details \t\n3.Exit");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			switch(n)
			{
			case 1:
			{
				System.out.println("Enter Pickup Location");
				char pickupLocation = s.next().charAt(0);
				System.out.println("Enter Drop Location");
				char dropLocation = s.next().charAt(0);
				System.out.println("Enter Pickup Time");
				int pickupTime = s.nextInt();
				System.out.println(TaxiBooking.booking(pickupLocation, dropLocation, pickupTime));
				break;
			}
			
			case 2:
			{
				TaxiBooking.display();
				break;
			}
			
			case 3:
			{
				loop = false;
				System.out.println("\n \t \t \t Thank You!!!");
				System.out.println("\n \t \t \t BYE  :-)");
				s.close();
				break;
			}
			}
		}
	}
}
                