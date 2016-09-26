package traveler;

public class travelerDemo {

	public static void main(String[] args) {
            traveler Anusha = new traveler(19, 20, 2023, true);
            
            checks checkpoint = new checks();
            
 if(checkpoint.checkbaggage(Anusha) && checkpoint.checksecurity(Anusha) && checkpoint.checkimmigration(Anusha))
        System.out.println("Fly");
 else
	    System.out.println("Stay back");
 
 
            	
            	
           }

}
