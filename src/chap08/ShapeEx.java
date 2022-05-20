package chap08;

class Circle extends Shape{
	int r; //반지름
	public Circle(int r) {
		super("원");
		this.r=r;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return r*r*3.14;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI; //수학이 갖고 있는 파이 숫자 가져오기
	}
	
}
class Rectangle extends Shape{
	int width; //가로
	int height; //세로
	public Rectangle(int width,int height) {
		super("사각형");
		this.width=width;
		this.height=height;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2*(width + height); 
	}
	
}
public class ShapeEx {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2]; //자료형이 같으므로 배열로 잡음
		shapes[0] = new Circle(10); //원
		System.out.println("넓이" + shapes[0].area()+"둘레" + shapes[0].length());
		
		//사각형
		shapes[1] = new Rectangle(10,10);
		
		for(Shape s:shapes) {
			System.out.println(s);
			System.out.println("넓이"+s.area()+"둘레"+s.length());
		}

	}

}
