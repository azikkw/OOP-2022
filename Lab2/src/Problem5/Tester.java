package Problem5;

public class Tester 
{
	public static void main(String[] args) 
	{
		Circuit a = new Resistor(3);
		Circuit b = new Resistor(3);
		Circuit c = new Resistor(6);
		Circuit d = new Resistor(3);
		Circuit e = new Resistor(2);
		Circuit f = new Series(a, b);
		Circuit g = new Parallel(c, d);
		Circuit h = new Series(g, e);
		Circuit circuit = new Parallel(h, f);
		double R = circuit.getResistance();
		
		System.out.println(R);
		
		f.applyPotentialDiff(24);
		System.out.println(f.getPotentialDiff());
		System.out.println(f.getCurrent());
		System.out.println(f.getPower());
		
		g.applyPotentialDiff(24);
		System.out.println(g.getPotentialDiff());
		System.out.println(g.getCurrent());
		System.out.println(g.getPower());
		
//		System.out.println(f.getResistance());
//		System.out.println(f.getPower());
		
//		System.out.println(circuit.getPotentialDiff());
//		System.out.println(circuit.getCurrent());
//		System.out.println(circuit.getPower());
	}
}