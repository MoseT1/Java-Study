package chapter04;

public class Point {
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	private int x,y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y = y;
	}
	
}
