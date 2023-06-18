package Problem4;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Tester 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Person p = new Person("Alex");
		
		Employee e = new Employee("Nina", 150000, LocalDate.of(2018, 5, 2), "116-525-058");
		Employee e1 = new Employee("Carl", 170000, LocalDate.of(2017, 9, 15), "206-821-305");
		Employee e2 = new Employee("Carlos", 120000, LocalDate.of(2017, 9, 15), "206-821-305");
		Employee e3 = new Employee("Oslo", 140000, LocalDate.of(2019, 9, 15), "207-210-386");
		Employee e4 = (Employee)e.clone();
		e.salary = 160000;
		e.hireDate = LocalDate.of(2020, 5, 11);
		e.insuranceNumber = "116-525-000";
		Employee e5 = new Employee("Cane", 150000, LocalDate.of(2019, 5, 15), "206-821-305");
		Employee e6 = new Employee("Scott", 170000, LocalDate.of(2017, 12, 2), "206-821-305");
		Employee e7 = new Employee("Liam", 200000, LocalDate.of(2022, 6, 28), "206-821-305");
		
		//System.out.println(p);
		//System.out.println(e);
		
		Manager m = new Manager("Diego", 305000, LocalDate.of(2017, 3, 25), "111-235-010", new Vector <Employee>());
		Manager m1 = new Manager("Soul", 305000, LocalDate.of(2015, 12, 9), "556-895-015", new Vector <Employee>());
		Manager m2 = new Manager("Scott", 90000, LocalDate.of(2020, 12, 9), "556-895-015", new Vector <Employee>());
//		m.salary = 290000;

		m.employees.add(e);
		m.employees.add(e1);
		m.employees.add(e2);
		m.employees.add(e3);
		m.employees.add(e4);
		
//		System.out.println(m);
		//System.out.println(m2);
		
		m1.employees.add(e5);
		m1.employees.add(e6);
		m1.employees.add(e7);

		Manager m3 = (Manager)m.clone();
		System.out.println(m);
		System.out.println(m3);
	
		Employee e8 = new Employee("Jake", 250000, LocalDate.of(2012, 8, 20), "268-421-419");
		m.employees.add(e8);
		
		System.out.println();
		System.out.println(m);
		System.out.println(m3);
		
//		for(Employee em: m.employees) {
//			System.out.println(em);
//		}
//		for(Employee em: m1.employees) {
//			System.out.println(em);
//		}
		
//		Collections.sort(m.employees);
//		System.out.println();
		
//		for(Employee em: m.employees) {
//			System.out.println(em);
//		}
		
//		System.out.print(m.getBonus());
		
		Vector <Manager> managers = new Vector <Manager>();
		managers.add(m);
		managers.add(m1);
		managers.add(m2);
		
//		for(Manager mg: managers) {
//			System.out.println(mg);
//		}

		HireDateComparator comp = new HireDateComparator();
		Collections.sort(managers, comp);
		System.out.println();
		
//		for(Manager mg: managers) {
//			System.out.println(mg);
//		}
		
//		for(Employee em: m.employees) {
//			System.out.println(em);
//		}
//	
//		NameComparator comp = new NameComparator();
//		Collections.sort(m.employees, comp);
//		System.out.println();
//		
//		for(Employee em: m.employees) {
//			System.out.println(em);
//		}
		
		Vector <Employee> vem = new Vector <Employee>();
		vem.add(e);
		vem.add(e1);
		vem.add(e2);
		vem.add(e3);
		vem.add(e4);
		vem.add(e5);
		vem.add(e6);
		vem.add(e7);
		vem.add(m);
		vem.add(m1);
		vem.add(m2);

		System.out.println();
		
		for(Employee emp: vem) {
			System.out.println(emp);
		}
		
//		vem.sort(new BothComparator());
		
		Collections.sort(vem);
		System.out.println();
		
		for(Employee emp: vem) {
			System.out.println(emp);
		}
	}
}