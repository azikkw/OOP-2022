package Problem4;

import java.util.Comparator;

public class HireDateComparator implements Comparator <Employee> 
{
	public int compare(Employee e1, Employee e2) {
		if(e1 instanceof Manager && e2 instanceof Manager) {
			Manager m1 = (Manager)e1;
			Manager m2 = (Manager)e2;
			return m1.hireDate.compareTo(m2.hireDate);
		}
		else return e1.hireDate.compareTo(e2.hireDate);
	}
}