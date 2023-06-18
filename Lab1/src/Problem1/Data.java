package Problem1;

public class Data 
{
	private int cnt;
	
	private double sum;
	private double max;
	
	public Data() {
		cnt = 0;
		sum = 0;
		max = 0;
	}
	
	public void addValue(double value) {
		
		cnt++;
		
		sum += value;
		
		if(max == 0) {
			max = value;
		}
		else if(max < value) {
			max = value;
		}
	}
	
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getCnt() {
		return cnt;
	}
	
	public String averageOfData() {
		return "Average: " + (sum / cnt);
	}
	public String maxOfData() {
		return "Maximum: " + max;
	}
	public String toString() {
		return "\n" + averageOfData() + "\n" + maxOfData();
	}
}