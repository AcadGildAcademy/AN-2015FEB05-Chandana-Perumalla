package chandana.javaAssignment2.overridding;

public class AxisBank extends Bank {
	
	AxisBank(String bankName){
		super(bankName);
		rateOfinterest = 9;
	}

	@Override
	void getRateOfInterest(){
		System.out.println("Rate of interest of Axis bank: " + rateOfinterest);
	}
	
}
