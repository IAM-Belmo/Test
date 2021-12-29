package s3;

public class PointNom extends Point {
	
	private char nom;
	
	public PointNom (int x, int y, char nom) {
		super(x,y);
		this.nom=nom;		
	}
	
	public void setPointNom (int x, int y, char nom) {
		super.setPoint(x, y);
		this.nom=nom;
	}
	
	public void setNom (char nom) {
		this.nom=nom;
	}
	
	public void affCoord() {
		System.out.println("les coordonnées du "+nom);
		super.affCoord();
	}
}
