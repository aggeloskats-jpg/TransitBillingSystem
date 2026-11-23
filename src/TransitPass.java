
public abstract class TransitPass implements Chargeable {
	private String passId;
	private String holderName;
	private double baseFare;
	private static int totalPassesIssued = 0;
	
	public TransitPass(String passId, String holderName, double baseFare) {
		this.passId = passId;
		this.holderName = holderName; 
		setBaseFare(baseFare);
		totalPassesIssued++;
	}
	
	public String getPassId() {
		return passId;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public double getBaseFare() {
		return baseFare;
	}
	// Διόρθωση: Τριαδικός τελεστής.
	public void setBaseFare(double baseFare) {
	    this.baseFare = (baseFare < 0.0) ? 0.0 : baseFare;
	}
	
	public static int getTotalPassesIssued() {
		return totalPassesIssued;
	}
	@Override 
	public String toString() {
		return String.format("[%s] Κάτοχος: %s | Βασικό κόμιστρο %.2f$", passId, holderName, baseFare);
		
	}
}
