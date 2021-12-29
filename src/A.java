public class A {
	protected int x;
	protected int y;
	
	public A (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void initialise (int abs, int ord) {
		x=abs;
		y=ord;
	}
	
	public void deplace (int dx, int dy) {
		x=x+dx;
		y=y+dy;
	}
	
	public void affiche () {
		System.out.println("Je suis en "+x+" "+y);
		return;
	}
}
