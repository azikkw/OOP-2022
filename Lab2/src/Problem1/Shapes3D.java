package Problem1;

public abstract class Shapes3D
{
    public Shapes3D() {}

    public abstract double surfaceArea();
    public abstract double volume();

    public boolean equals(Object o) {
    	if(this == o) return true;
    	if(o == null) return false;
    	if(this.getClass() != o.getClass()) return false;
    	
    	Shapes3D s = (Shapes3D)o;
    	
    	return this.surfaceArea() == s.surfaceArea() && this.volume() == s.volume() && this.toString().equals(s.toString());
     }
    
    public String toString() {
        return "Area - " + surfaceArea() + ", Volume - " + volume();
    }
}
