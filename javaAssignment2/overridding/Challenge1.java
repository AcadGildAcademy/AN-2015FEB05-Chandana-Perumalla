package chandana.javaAssignment2.overridding;

public class Challenge1 {

	public static void main(String[] args) {
		AxisBank AB = new AxisBank("AxisBank");
		SBI sbi = new SBI("SBI");
		ICICI icici = new ICICI("ICICI");
		
		AB.getRateOfInterest();
		sbi.getRateOfInterest();
		icici.getRateOfInterest();
	}

}
