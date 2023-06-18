package Problem2;

public class Person extends LivingCreature implements OnWaterMoveable, UnderWaterMoveable
{
	public void moveOnWater() {
		System.out.println("I can swim 200 metres !!!");
	}
	public void moveUnderWater() {
		System.out.println("I also can move under water 2 minutes !!!");
	}
}