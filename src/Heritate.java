public class Heritate {

	public static void main(String[] args) {
		A a = new A(5,3);
		B b = new B(5,3,(byte) 6);
		
		a.affiche();
		a.deplace(2, 4);
		a.affiche();
		b.afficher();
	}
}
