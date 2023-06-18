package Problems2;

public class Actions {
	public static void main(String[] args) {
		//наглядный пример static, статик поля едины для всех обьектов
		Methods m = new Methods();
		Methods n = new Methods(15);
		m.Static();
		n.Static();
		System.out.println(m.toString());
		System.out.println(n);
		
		//пример final, его нельзя изменить(константа)
		//m.show=10;
		System.out.println(m.show);
		
		//methods overloading
		//несколько методов могут иметь одно и то же имя с разными параметрами
		int a= 1;
		int b= 5;
		System.out.println(m.SUM(a,b));
		double z=1.2;
		double x=3.4;
		System.out.println(m.SUM(z,x));
		
		
		//read-only 
		System.out.println(m.getCnt());
	}
}
