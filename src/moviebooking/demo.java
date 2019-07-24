package moviebooking;
import java.util.*;

public class demo {

	public static void main(String[] args) 
	{	
			int ichoice;
			Scanner s = new Scanner(System.in);
			ticket t = new ticket();
			for(;;)
			   {
					System.out.println("Enter options as given below\n1:-To check availableno of tickets\n2:-To book ticket\n3:-To end transaction");
					ichoice=s.nextInt();

					switch(ichoice)
						 {
						 	case 1: t.available();
						 			break;
						 	case 2: t.book();
						 			break;
						 	case 3: t.endtransaction();
						 			break;
						 	default: System.out.println("INVALID INPUT ENTER AGAIN");
						 }
			}
	}

}
