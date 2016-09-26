package in.ac.kletech;

public class retaildemo {

	public static void main(String[] args) {
		   customer Anusha=new customer(20,"Anusha","abc",1234567891);
		   if(Anusha.CustName() && Anusha.Teleno()){
			   Anusha.display();
			   purchase p=new purchase(12,3);
			   p.Purchasebill();
			   p.p1();
		   }
			   

	}

}
