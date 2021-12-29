package s3;

public class Test {

	public static void main(String[] args) {
		Point A = new PointNom(2,4, 'c');
		PointNom B = new PointNom(2,4,'B');
		
		A.deplace(5, 1);
		A.affCoord();
		
		B.affCoord();
		
	}

}
