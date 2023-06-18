package Problem2;

import java.util.Objects;

public class DVSCar extends Car
{
    int petrol;

    public DVSCar(String mark, Color color, int petrol) {
        super(mark, color);
        this.petrol = petrol;
    }

    @Override
    public void fuel() {
        System.out.println("Give me 92 petrol !!!");
    }
    
    public int fillTank(int count, int sum) {
    	return sum * count;
    }
    public int fillTank(int count, int sum, int sale) {
    	return (sum - sale) * count;
    }
    
    public boolean equals(Object o) {
    	if(!super.equals(o)) return false;
    	DVSCar d = (DVSCar)o;
    	return this.petrol == d.petrol;	
    }
    
    public int hashCode() {
    	return Objects.hash(mark, color, petrol);
    }
    
    public String toString() {
        return "[" + super.toString() + ", Petrol: " + petrol + "]";
    }
}
