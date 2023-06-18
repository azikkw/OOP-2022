package Problem5;

import practice2.Time;
import java.time.LocalDate;

import Problem4.Employee;

public class Tester 
{
	public static void main(String[] args)
	{
		// Sort with Chocolate
		System.out.println("Chocolate example:\n");
		
		Chocolate[] chocolates = new Chocolate[4];
		chocolates[0] = new Chocolate(5, "Coco");
		chocolates[1] = new Chocolate(4, "Poco");
		chocolates[2] = new Chocolate(10, "Soco");
		chocolates[3] = new Chocolate(1, "Toco");

		for(Chocolate ch: chocolates) {
			System.out.println(ch);
		}
		
		Sort.msort(chocolates, 0, chocolates.length - 1);
		System.out.println("\nSORTED:");

		for(Chocolate ch: chocolates) {
			System.out.println(ch);
		}

		// Sort with Time
		System.out.println("\nTime example:\n");
		
		Time[] times = new Time[4];
		times[0] = new Time(21, 15, 33);;
		times[1] = new Time(10, 58, 3);;
		times[2] = new Time(4, 24, 11);;
		times[3] = new Time(21, 15, 13);;

		for(Time ti: times) {
			System.out.println(ti);
		}
		
		Sort.qsort(times, 0, times.length - 1);
		System.out.println("\nSORTED:");

		for(Time ti: times) {
			System.out.println(ti);
		}

		// Sort with Employee
		System.out.println("\nEmployee example:\n");
		
		Employee[] employees = new Employee[4];
		employees[0] = new Employee("Nina", 150000, LocalDate.of(2018, 5, 2), "116-525-058");
		employees[1] = new Employee("Carl", 170000, LocalDate.of(2017, 9, 15), "206-821-305");
		employees[2] = new Employee("Carlos", 120000, LocalDate.of(2017, 9, 15), "206-821-305");
		employees[3] = new Employee("Oslo", 140000, LocalDate.of(2019, 9, 15), "207-210-386");

		for(Employee em: employees) {
			System.out.println(em);
		}
		
		Sort.msort(employees, 0, employees.length - 1);
		System.out.println("\nSORTED:");

		for(Employee em: employees) {
			System.out.println(em);
		}
		
		// Swap example with Time class
		System.out.println("\nSwap example:\n");
		
		for(Time ti: times) {
			System.out.println(ti);
		}
		
		Sort.swap(times, 0, 2);
		System.out.println("\nSWAPPED:");

		for(Time ti: times) {
			System.out.println(ti);
		}
	}
}