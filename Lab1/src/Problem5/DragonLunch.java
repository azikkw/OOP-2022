package Problem5;

import java.util.ArrayList;

public class DragonLunch
{
	public String kidnapp(Person p) {
		return p.name + " " + p.gender;
	}
	
	public void willDragonEatOrNot() {
		
		int cntB = 0, cntG = 0;
		
		for(int i = 0; i < Person.kidnapped.size(); i++) {
			if(Person.kidnapped.get(i).gender == Gender.BOY) {
				cntB++;
			}
			else if(Person.kidnapped.get(i).gender == Gender.GIRL) {
				cntG++;
			}
			
			if(cntB == 0 && cntG == 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			//else {
				//System.out.println("Dragon will eat");
			//}
			//if(Person.kidnapped.get(i).gender == Gender.GIRL) {
				//System.out.println(i);
				//cntG += 1;
			//}
		}
	}
}