
public class MonthlyCard extends TransitPass {
	private double discountRate;
	private int tripsCount;
	
	public MonthlyCard(String passId, String holderName, double baseFare, double discountRate, int tripsCount) {
		super(passId, holderName, baseFare);
		this.discountRate = (discountRate >= 0.0 && discountRate < 1.0) ? discountRate : 0.0;
		this.tripsCount = (tripsCount < 0 ) ? 0 : tripsCount;
	}
	
	public void addBonusTrip() {
		tripsCount++;
	}
	
	@Override
	public double calculateCost() {
		return getBaseFare()*(1.0 - discountRate);
	}
	
	@Override
	public String toString() {
		return String.format("%s | Τύπος: Μηνιαία Κάρτα (Έκπτωση: %.0f%%, Διαδρομές: %d", super.toString(), discountRate*100, tripsCount);
	}
}
