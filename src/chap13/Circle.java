package chap13;

public class Circle  extends Shape{
	double r;

	public Circle() {
		this(1);
	}
	public Circle(double r) {
		this.r = 1;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return (r*r)*Math.PI;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return (r*2)*Math.PI;
	}
	
}
