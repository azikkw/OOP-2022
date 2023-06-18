package Problem5;

public class Parallel extends Circuit
{
	Circuit r1;
	Circuit r2;

	private double potDiff;
	
	public Parallel(Circuit r1, Circuit r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
	
	public double getResistance() {
		return 1 / ((1 / r1.getResistance()) + (1 / r2.getResistance()));
	}

	public double getPotentialDiff() {
		return this.potDiff;
	}
	public void applyPotentialDiff(double V) {
		this.potDiff = V;
		r1.applyPotentialDiff(r1.getCurrent() * this.getResistance());
		r2.applyPotentialDiff(r2.getCurrent() * this.getResistance());
	}
	
	public double getCurrent() {
		return (r1.getResistance() + r2.getResistance());
	}
	public double getPower() {
		return (this.getPotentialDiff() * this.getPotentialDiff()) / this.getResistance();
	}
}