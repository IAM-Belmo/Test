package s3;

public class A implements I1,I2{
	
	public void f(int a,int b) {
		int min;
		int max;
		
		if (a<b) { min = a; max = b; }
		
		else { min = b; max = a; }
		
		System.out.println("Le min est : "+min+" ,Le max est : "+max);
	}
	
	public void g(int s, int e) {
		
		int somme;
		
		somme = 0;
		for (int i = s; i <= e; i++) {
			
			somme = somme + i;
			
		}
		
		System.out.println("La somme de la suite est : "+somme);
		
	}
	
	public void h(int x, int y) {
		
		float avg;
		
		avg = (x+y)/2;
		
		System.out.println("Le avg est : "+avg);
		
	}
	
	// Modification Git //

}
