package chandana.javaAssignment2.abstractclass;

public class StringedInstrument extends Instrument {
	int numberOfStrings;
	public StringedInstrument(String s, int n){
		InstrumentName = s;
		numberOfStrings = n;
	}
	
	@Override
	public void play() {
		System.out.println("Playing Instrument "+InstrumentName+"\nNumber of Strings "+numberOfStrings);
		
	}
	
	

}
