package MidtermPre;

import java.util.HashSet;
import java.util.Vector;

public class Tester 
{
	public static void main(String[] args) 
	{
		X xxx = new X();
		X x = new X("Alex", 19, Gender.MALE);
		X x3 = new X("L", 18, Gender.FEMALE);
		Y y = new Y("Alexa", 20, Gender.FEMALE, 1025, "KBTU");
		
		X x1 = y;
		Y x2 = new Y("Alexa", 20, Gender.FEMALE, 1025, "KBTU");
		
		System.out.println(y.idSum(0, y.getId(), x2.getId()));
		
		if(x instanceof Y) {
			Y y1 = (Y)x;
			System.out.println(y1);
		}
		
		
		System.out.println();
		
		
		x.print();
		y.print();
		x1.print();
		
		
		System.out.println();
		
		
		System.out.println(y.equals(x1));
		System.out.println(y.equals(x2));
		
		HashSet <X> xx = new HashSet <X>();
		
		xx.add(x);
		xx.add(y);
		//xx.add(x1);
		xx.add(x2);
		
		
		System.out.println();
		
		
		System.out.println(xx);
		
		
		System.out.println();
		
		
		for(X cur: xx) {
			
			System.out.println(cur);
			cur.accessTo();
		}

		
		System.out.println();
		
		
		for(X v: X.xes) {
			
			//v.print();
			
			if(v instanceof Y) {
				Y yy = (Y)v;
				yy.print();
				yy.accessTo();
			}
		}

		
		System.out.println();
		
		
		Vector <X> vv = new Vector <X>();
		
		vv.add(x);
		vv.add(y);
		
		System.out.println(vv.contains(x1));
	}
}