package Problem1;

public class Sphere extends Shapes3D
{
    double rad;

    public Sphere(double rad) {
        super();
        this.rad = rad;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(rad, 2);
    }
    public double volume() {
        return (4 * Math.PI * Math.pow(rad, 3)) / 3;
    }
    
    public String toString() {
    	return "The Sphere with " + super.toString();
    }
}
