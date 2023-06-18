package Problem4;

import java.util.Comparator;

public class BothComparator implements Comparator <Employee>
{
	public int compare(Employee e1, Employee e2) {
		if(e1 instanceof Manager && e2 instanceof Manager) {
			Manager m1 = (Manager)e1;
			Manager m2 = (Manager)e2;
			if(m1.salary > m2.salary) return 1;
			else if(m1.salary < m2.salary) return -1;
			else {
				if(m1.getBonus() > m2.getBonus()) return 1;
				if(m1.getBonus() < m2.getBonus()) return -1;
			}
		}
		else {
			if(e1.salary > e2.salary) return 1;
			if(e1.salary < e2.salary) return -1;
		}
		return 0;
	}
}