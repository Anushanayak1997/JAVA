package traveler;

public class checks {
	boolean checkbaggage(traveler Anusha){
		if(Anusha.getiBaggageweight()>0 && Anusha.getiBaggageweight()<40)
			return true;
		else
			return false;
	}
	
	boolean checkimmigration(traveler Anusha){
		if(Anusha.getiExpiry()>=2001 && Anusha.getiExpiry()<=2025)
			return true;
		else 
			return false;
	}
	
	 boolean checksecurity(traveler Anusha){
		 if(Anusha.isbNOCstatus()==true)
			 return true;
		 else
			 return false;
	 }
	

}
