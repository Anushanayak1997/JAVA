package in.ac.kletech;

public class customer {
	     private int icustID;
	     private String Custname;
	     private String Add;
		 private int iteleno;

	     public int getIcustID() {
			return icustID;
		}
		public String getCustname() {
			return Custname;
		}
		public String getAdd() {
			return Add;
		}
		public int getIteleno() {
			return iteleno;
		}
		
		customer(int icustID,String Custname,String Add,int iteleno){
			this.icustID=icustID;
			this.Custname=Custname;
			this.Add=Add;
			this.iteleno=iteleno;
		}
		
		boolean Teleno(){
			if(iteleno/1000000000 <1 || iteleno/1000000000 >10)
				return false;
			else 
				return true;
		}
		
		boolean CustName(){
			  if(Custname.length()>4 && Custname.length()<20)
					  return true;
			  else 
				  return false;
		}
	     
	     	void display(){
	     		System.out.println("custId:" +icustID);
	     		System.out.println("custname:" +Custname);
	     		System.out.println("teleno:" +iteleno);
	     		System.out.println("address:" +Add);
	     	}

}
