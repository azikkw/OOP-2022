package Problem2;

import java.util.HashSet;
import java.util.Vector;

public class Tester
{
    public static void main(String[] args)
    {
        HashSet <Car> cars = new HashSet <Car>();
        
        ElectricCar e = new ElectricCar("Tesla", Color.WHITE, 50);
        DVSCar d = new DVSCar("Hyundai", Color.BLACK, 92);
        ElectricCar e1 = new ElectricCar("Tesla", Color.RED, 100);

        Car c = new ElectricCar("Tesla", Color.WHITE, 50);
        ElectricCar e2 = e;
        Car c1 = new DVSCar("Hyundai", Color.BLACK, 92);
        
        System.out.println(e.equals(c));
        System.out.println(e.equals(e2));
        System.out.println(d.equals(c1));

        cars.add(e);
        cars.add(d);
        cars.add(e1);
        cars.add(c);
        cars.add(c1);

        System.out.println();
        System.out.println(cars);
        
        Vector <Car> car = new Vector <Car>();

        car.add(e);
        car.add(d);
        car.add(e1);
        car.add(c);
        car.add(c1);
        
        System.out.println();
        
        for(Car carr: car) {
        	carr.fuel();
        	
        	if(carr instanceof DVSCar) {
        		DVSCar dv = (DVSCar)carr;
        		System.out.println(dv);
        		dv.fuel();
        	}
        	
        	if(carr instanceof ElectricCar) {
        		ElectricCar ec = (ElectricCar)carr;
        		System.out.println(ec);
        		ec.fuel();
        	}
        }
        
        System.out.println();
        
        System.out.println(d.fillTank(5, 150));
        System.out.println(d.fillTank(5, 150, 50));
        System.out.println(e.fillTank(100, 1));
        System.out.println(e.fillTank(100, 1, 1.5));
    }
}
