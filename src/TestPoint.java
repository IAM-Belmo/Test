public class TestPoint {

	public static void main(String[] args) {
		Point a = new Point(3,5);
		System.out.println("le point a est : "+a.x()+" "+a.y());
		Point b = new Point(2,0);
		System.out.println("le point b est : "+b.x()+" "+b.y());
		a.copie(b);
		a.deplacer(2, 0);
		System.out.println("le point a est : "+a.x()+" "+a.y());
		b.deplacer(3, 1);
		System.out.println("le point a est : "+b.x()+" "+b.y());
	}
}