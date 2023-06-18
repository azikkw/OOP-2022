package Problem1;

public class Cube extends Shapes3D
{
    double a;

    public Cube(double a) {
        super();
        this.a = a;
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(a, 2);
    }
    public double volume() {
        return Math.pow(a, 3);
    }
    
    public String toString() {
    	return "The Cube with " + super.toString();
    }
}
