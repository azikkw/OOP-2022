package Problem5;

public class Chocolate implements Comparable <Chocolate>
{
	int weight;
	
	String name;
	
	public Chocolate(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public int compareTo(Chocolate c) {
		if(this.weight > c.weight) return 1;
		if(this.weight < c.weight) return -1;
		return 0;
	}
	
	public String toString() {
		return "Chocolate " + this.name + ", with weight: " + this.weight;
	}
}