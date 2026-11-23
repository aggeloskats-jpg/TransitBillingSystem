
public class MaintenanceFee implements Chargeable {
	private String machineCode;
	private int hours;
	private double hourlyRate;
	
	public MaintenanceFee(String machineCode, int hours, double hourlyRate) {
		this.machineCode = machineCode;
		this.hours = (hours >= 0)? hours : 0;
		this.hourlyRate = (hourlyRate >= 0.0)? hourlyRate : 0.0;
	}
	
	@Override
	public double calculateCost() {
		return hours * hourlyRate ; 
	}
	
	@Override 
	public String toString() {
		return String.format("[Συντήρηση Μηχανήματος %s] %d ώρες x %.2f€/ώρα", machineCode, hours, hourlyRate);
	}
}
