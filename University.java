package in.ac.kletech;

public class University {
       school[] a=new school[8];
       static
       {
    	   System.out.println("KLE Technological University");
       }
       
       class school{
    	   private int programCode;
    	   private String schoolCoordinator;
    	   private int noOfStud;
    	   private int noOfStaff;
    	   
		public int getProgramCode() {
			return programCode;
		}
		public String getSchoolCoordinator() {
			return schoolCoordinator;
		}
		public int getNoOfStud() {
			return noOfStud;
		}
		public int getNoOfStaff() {
			return noOfStaff;
		}
    	 
		public school(int programCode,String schoolCoordinator,int noOfStud,int noOfStaff){
			this.programCode=programCode;
			this.schoolCoordinator=schoolCoordinator;
			this.noOfStud=noOfStud;
			this.noOfStaff=noOfStaff;
		}
       }
		
		void calculate()
		{
			int i=0;
			for(int j=0;j<8;j++){
				if(a[j].getNoOfStud()>120)
					System.out.println("No more students can be taken in"+a[j].getProgramCode());
				else
				{
					i=a[j].getNoOfStud();
					System.out.println("Total no of students: "+i+" in "+a[j].getProgramCode());
				}
			}
		}
		
		void createSchool(){
			a[0]=new school(1,"abc",110,10);
			a[1]=new school(2,"xyz",120,20);
			a[2]=new school(3,"qwe",56,12);
			a[3]=new school(4,"sdf",45,15);
			a[4]=new school(5,"ghj",200,32);
			a[5]=new school(6,"asd",123,45);
			a[6]=new school(7,"yui",103,23);
			a[7]=new school(8,"dfg",126,56);
		}
    	   
       }

