package Problems2;

public class Methods {
	private static int cnt=0;
	final int show;
	public int age;
	public int count;
	
	//initialization block
	{
		show=5;
		age=18;
		count=1;
	}
	
	//this keyword (2 usages)
	public Methods() {
		count+=1;
	}
	public Methods(int age) {
		this();
		this.age=age;
	}
	
	
	public void Static() {
		cnt+=1;		
	}
	
	public String toString(){
		return cnt+"";
	}
	
	//methods overloading
	public int SUM(int a,int b) {
		return a+b;
	}
	public double SUM(double a,double b) {
		return a+b;
	}
	
	//read-only field
	public int getCnt() {
		return cnt;
	}
}
