package moviebooking;

public class Executive extends ticket
	{
	
		public void execubook()
		{
			if(aexec>0)
			 {	
				aexec--;
				tcost=tcost+600;
				ttotal++;
				ebooked++;
				System.out.println("Executive ticket booked sucessfully");		
			 }
			else {
				System.out.println("NO more available ticket in executive section");
			}
		}
	}