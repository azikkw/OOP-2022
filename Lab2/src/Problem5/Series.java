package Problem5;

public class Series extends Circuit
{
	Circuit r1;
	Circuit r2;
	
	private double potDiff;
	
	public Series(Circuit r1, Circuit r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
	
	public double getResistance() {
		return r1.getResistance() + r2.getResistance();
	}

	public double getPotentialDiff() {
		return this.potDiff;
	}
	public void applyPotentialDiff(double V) {
		this.potDiff = V;
		r1.applyPotentialDiff(this.getCurrent() * r1.getResistance());
		r2.applyPotentialDiff(this.getCurrent() * r2.getResistance());
	}
	
	public double getCurrent() {
		return getPotentialDiff() / getResistance();
	}
	public double getPower() {
		return (getCurrent() * getCurrent()) * getResistance();
	}
}