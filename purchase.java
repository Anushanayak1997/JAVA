package in.ac.kletech;

public class purchase {
	
	         private int ibillID;
	         private int qty;
	         private double billamt;
	         
	         
	         
	         public int getIbillID() {
				return ibillID;
			}

			public int getQty() {
				return qty;
			}

			public double getBillamt() {
				return billamt;
			}

			public Itemdetails getItem() {
				return item;
			}

			purchase(int ibillID,int qty){
	        	 this.ibillID=ibillID;
	        	 this.qty=qty;
	         }
	         
	         Itemdetails item=new Itemdetails(1001);
	         
	         void Purchasebill(){
	        	 if(qty<0 || qty>5)
	        		 System.out.println("Quantity should be less than 5");
	        	 else
	        		 {
	        		   billamt=qty * item.getItemprice();
	        		   if(billamt>=1000)
	        			   billamt-=0.1;
	        		   else if(billamt>=500)
	        			   billamt-=0.05;
	        		   
	        		 }
	        	 item.i1();
	         }
	         
	         void  p1(){
	        	 System.out.println("BillID:" +ibillID);
	        	 System.out.println("Quantity:"+qty);
	        	 System.out.println("total amount:" +billamt);
	         }

}
