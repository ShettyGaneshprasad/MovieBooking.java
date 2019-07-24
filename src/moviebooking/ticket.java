package moviebooking;
import java.util.*;

public class ticket 
{
	Scanner b = new Scanner(System.in);
	public static int agold=200,aplat=100,aexec=60,tcost=0,ttotal=0;
	public static int gbooked=0,pbooked=0,ebooked=0;
		
	public void available()
	  {
		System.out.println("AVAILABLE NO OF SEAT ARE");
		
				System.out.println("Total no of Gold Seats are"+agold);
				System.out.println("Total no of platinum Seats are"+aplat);
				System.out.println("Total no of executive Seats are"+aexec);
				System.out.println("\n");
	  }
	
	public void book()
	{	int ichoice;
	
	if(ttotal<8)
	 {
		System.out.println("Enter the options as mentioned below\n1:-Book GOLD ticket\n2:-Book PLATINUM ticket\n3:-Book PLATINUM tickets");
		ichoice=b.nextInt();
		
		Gold gold = new Gold();
		Platinum plat = new Platinum();
		Executive execu = new Executive();
		
		
		
		switch(ichoice)
		{
		case 1:	 gold.goldbook();
				 break;
		case 2 : plat.platbook();
				 break;
		case 3 : execu.execubook();
				 break;
		}
	 }
	else
	{
		System.out.println("EXCEDED LIMIT OF BOOKING A TICKET IN ONE TRANSACTION");}		
	}
	
	public void endtransaction()
	{

		System.out.println("Total cost of tickets is"+tcost);
		System.out.println("No of Gold tickets booked are"+gbooked);
		System.out.println("No of platinum tickets booked are"+pbooked);
		System.out.println("No of executive tickets booked are"+ebooked);
		System.out.println("Total tickets booked are"+ttotal);
		ttotal=0;
		tcost=0;
		gbooked=0;
		pbooked=0;
		ebooked=0;
		
	}	
}

