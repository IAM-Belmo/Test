public class B extends A {
	
	private byte couleur;
	
	public B (int x, int y, byte couleur) {
		super(x, y);
		this.couleur=couleur;
	}
	
	public void colore (byte couleur) {
		this.couleur=couleur;
	}
	
	public void afficher () {
		
		System.out.println(" ma couleur est"+couleur);
		return;
	}
}
