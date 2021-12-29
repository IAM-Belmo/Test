public class Point
{
	private int x;
	private int y;

	public Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public int x()
	{
		return this.x;
	}
	public int y()
	{
		return this.y;
	}
	
	public void copie(Point o) {
		this.x = o.x;
		this.y = o.y;
	}
	
	public void deplacer(int a, int b){
		x = x+a;
		y = y +b;
		
	}
}