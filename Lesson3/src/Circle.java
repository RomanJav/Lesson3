import java.util.Scanner;

public class Circle {
	private int x;
	private int y;
	private int r;
	private double S;
	private double p;
	
	Circle(){
		System.out.println("Координата центра окружности по X: ");
		this.setX(value());
		System.out.println("Координата центра окружности по Y: ");
		this.setY(value());
		System.out.println("Радиус окружности: ");
		this.r=value();
		Square();
		Perimeter();
	}
	public double getRadius() {
		return r;
	}
	public double getSquare() {
		return S;
	}
	public double getPerimeter() {
		return p;
	}
	private int value() {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		return i;
	}
	private void Square() {
		this.S= 3.14*this.r*this.r;
		System.out.println(S);
	}
	private void Perimeter() {
		this.p= 3.14*this.r*2;
		System.out.println(p);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
