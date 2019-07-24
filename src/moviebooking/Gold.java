package moviebooking;
import java.util.*;
public class Gold extends ticket
	{
	
		public void goldbook()
		{
			if(agold>0)
			 {	
				agold--;
				tcost=tcost+200;
				ttotal++;
				gbooked++;
				System.out.println("Gold ticket booked sucessfully");		
			 }
			else {
				System.out.println("NO more available ticket in gold section");
			}
		}
	}