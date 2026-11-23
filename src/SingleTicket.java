
public  class SingleTicket extends TransitPass {
	private int zones;
	
	public SingleTicket(String passId, String holderName, double baseFare, int zones) {
		super(passId, holderName, baseFare);
		this.zones = (zones < 1 )? 1 : zones;
	}
	
	
	@Override
	public double calculateCost(){
		return getBaseFare()*zones;		//Τιμή μονάδας * πλήθος ζωνών
	}
	
	@Override
	public String toString() {
		return String.format("%s | Τύπος: Απλό Εισιτήριο (%d ζώνες)", super.toString(), zones);
	}
}
