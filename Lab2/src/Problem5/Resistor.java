package Problem5;

public class Resistor extends Circuit
{
	private double resistance;
	private double potDiff;
	
	public Resistor(double resistance) {
		this.resistance = resistance;
	}
	
	public double getResistance() {
		return this.resistance;
	}

	public double getPotentialDiff() {
		return this.potDiff;
	}
	public void applyPotentialDiff(double V) {
		this.potDiff = V;
	}
}