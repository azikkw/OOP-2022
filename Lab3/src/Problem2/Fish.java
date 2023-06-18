package Problem2;

public class Fish extends LivingCreature implements UnderWaterMoveable
{
	public void moveUnderWater() {
		System.out.println("I am a fish. I can mpve only under water, because it is safe for my health !!!");
	}
}