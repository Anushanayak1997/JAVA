package traveler;

public class traveler {
	private int iTravelerID;
	private int iBaggageweight;
	private int iExpiry;
	private boolean bNOCstatus;
	
	traveler(int iTravelerID,int iBaggageweight,int iExpiry,boolean bNOCstatus){
       this.iTravelerID= iTravelerID;
       this.iBaggageweight= iBaggageweight;
       this.iExpiry= iExpiry;
       this.bNOCstatus= bNOCstatus;
	}

	
	public int getiTravelerID() {
		return iTravelerID;
	}
	public int getiBaggageweight() {
		return iBaggageweight;
	}
	public int getiExpiry() {
		return iExpiry;
	}
	public boolean isbNOCstatus() {
		return bNOCstatus;
	}
	 
}

 
