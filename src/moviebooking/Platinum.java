package moviebooking;

public class Platinum extends ticket
	{
	
		public void platbook()
		{
			if(aplat>0)
			 {	
				aplat--;
				tcost=tcost+400;
				ttotal++;
				pbooked++;
				System.out.println("Platinum ticket booked sucessfully");		
			 }
			else {
				System.out.println("NO more available ticket in platinum section");
			}
		}
	}