package s3;

public class Singleton {
	
	static Singleton S;
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(S==null)
			S = new Singleton();
		else
			System.out.println("Une instance existe déjà");
		return S;
	}
}