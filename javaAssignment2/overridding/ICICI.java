package chandana.javaAssignment2.overridding;

public class ICICI extends Bank{
	
	ICICI(String bankName){
		super(bankName);
		rateOfinterest = 8;
	}

	@Override
 void getRateOfInterest(){
		System.out.println("Rate of interest of ICICI bank: "+rateOfinterest);
		
	}
}
