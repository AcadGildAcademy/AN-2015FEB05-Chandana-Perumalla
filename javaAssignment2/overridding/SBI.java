package chandana.javaAssignment2.overridding;

public class SBI extends Bank{

	SBI(String bankName) {
		super(bankName);
		rateOfinterest = 7;
		// TODO Auto-generated constructor stub
	}


	void getRateOfInterest(){
		System.out.println("Rate of interest of SBI bank:"+rateOfinterest);
	}
}
