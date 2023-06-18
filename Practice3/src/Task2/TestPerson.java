package Task2;

import java.util.Scanner;

public class TestPerson
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	
    	Person p = new Person("Bob", "A street");
        Student s = new Student("Lary", "F street", "Bolashak", 2, 5000);
        Staff st = new Staff("Dilan", "N street", "KBTU", 10000);
    	
    	System.out.println("If you want to print info about all persons - 1." + "\n" + "If you want to add new person - 2.");
    	    	
    	while(true) {
        	int number;
        	number = input.nextInt();
        	
	    	if(number == 1) {
	    		for(Person cur: Person.personsList) {
	    			System.out.println(cur);
	    		}
	    	}
	    	if(number == 2) {
	    		System.out.println("For add Person - p" + "\n" + "For add Student - s" + "\n" + "For add Staff - st");
	    		
	    		String str;
	    		str = input.next();
	    		
	    		if(str.equals("p")) {
	    			Person p1 = new Person(input.next(), input.next());
	    		}
	    		else if(str.equals("s")) {
	    			System.out.println("s");
	    		}
	    		else if(str.equals("st")) {
	    			System.out.println("st");
	    		}
	    	}
    	}
      
        //System.out.println(p.getName());
        //p.setAddress("L street");

        //System.out.println(p);

        //Person p2 = new Person("Gary", "G street");

        //System.out.println(p2);
    }
}
