package s3;

public class Context {
	
	private IStrategie strategie;

	
	
	public void process(int[] t) {
		
		strategie.AppliquerStratégie(t);
		
	}

	public void setStrategie(IStrategie strategie) {
		this.strategie = strategie;
	}
	
	public void afficher (int[] t) {
	int i;
	for (i=0;i<t.length;i++) {
		System.out.println(t[i]);
	}
}
}
