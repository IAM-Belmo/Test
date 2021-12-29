public class Ex {
	private int a;
	private int b;
	public Ex( int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public void boucle() {
		int n = 0;
		for (int i=this.a; i<=this.b; i++) {
			if (i%2 == 0) {
				System.out.println("le "+n+" numéro paire est : "+i);
				n++;
			}
		}
	}
	public static void main(String[] args) {
		Ex a1 = new Ex(0,2);
		a1.boucle();	
		}
	}