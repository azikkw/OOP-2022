package Problem1;
 
public class Cylinder extends Shapes3D
{
    double h, rad;

    public Cylinder(double rad, double h) {
        super();
        this.rad = rad;
        this.h = h;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * rad * (rad + h);
    }
    public double volume() {
        return Math.PI * Math.pow(rad, 2) * h;
    }
    
    public String toString() {
    	return "The Cylinder with " + super.toString();
    }
}
