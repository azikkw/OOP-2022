package Problem4;

import java.util.Comparator;

public class NameComparator implements Comparator <Employee> 
{
	public int compare(Employee e1, Employee e2) {
		if(e1 instanceof Manager && e2 instanceof Manager) {
			Manager m1 = (Manager)e1;
			Manager m2 = (Manager)e2;
			return m1.name.compareTo(m2.name);
		}
		else return e1.name.compareTo(e2.name);
	}
}