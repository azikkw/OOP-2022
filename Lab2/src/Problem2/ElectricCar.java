package Problem2;

import java.util.Objects;

public class ElectricCar extends Car
{
    int battery;

    public ElectricCar(String mark, Color color, int battery) {
        super(mark, color);
        this.battery = battery;
    }

    @Override
    public void fuel() {
        System.out.println("Give me electricity !!!");
    }
    
    public double fillTank(int needBattery, double timeForOne) {
    	return timeForOne * (needBattery - this.battery);
    }
    public double fillTank(int needBattery, double timeForOne, double faster) {
    	return (timeForOne / faster) * (needBattery - this.battery);
    }

    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        ElectricCar e = (ElectricCar)o;
        return this.battery == e.battery;
    }
    
    public int hashCode() {
    	return Objects.hash(mark, color, battery);
    }

    public String toString() {
        return "[" + super.toString() + ", Battery: " + battery + "]";
    }
}
