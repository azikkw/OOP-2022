package Problem2;

import java.util.Objects;

public class Car
{
    Color color;

    String mark;

    public Car(String mark, Color color) {
        this.mark = mark;
        this.color = color;
    }

    public void fuel() {
        System.out.println("I need the fuel !!!");
    }
    
    public boolean equals(Object o) {
    	
    	if(this == o) return true;
    	if(o == null) return false;
    	if(this.getClass() != o.getClass()) return false;
    	
    	Car c = (Car)o;
    	
    	return this.mark == c.mark && this.color == c.color;
    }
    
    public int hashCode() {
    	return Objects.hash(mark, color);
    }

    public String toString() {
        return "Car with mark " + mark + ", Color: " + color;
    }
}
