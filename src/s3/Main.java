package s3;

public class Main {

	public static void main(String[] args) {
		
//		A a1 = new A();
		
//		a1.f(6, 9);
		
//		a1.g(0, 20);
		
//		a1.h(2, 4);
		
		int[] t = new int[]{5,1,7,8,2,4};
		
		
		Context C1 = new Context();
		
		C1.setStrategie(new StrategieA());
		
		C1.process(t);
		
		C1.afficher(t);
		
		System.out.println("*************************");
		
		Context C2 = new Context();
		
		C2.setStrategie(new StrategieB());
		
		C2.process(t);
		
		C2.afficher(t);
		
		System.out.println("*************************");
		
		Context C3 = new Context();
		
		C3.setStrategie(new StrategieC());
		
		C3.process(t);
		
		C3.afficher(t);
		
		System.out.println("*************************");

	}

}
