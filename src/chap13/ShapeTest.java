package chap13;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
	public static void main(String[] args) {
		//List<E> //<>은 데이터 타입을 제한을 하겠다는 의미 , <String>로 쓰면 문자열만 저장하겠다는 의미,없을경우 비움
		List<Circle> list = new ArrayList<Circle>(); //써주는것이 가장 정확
		list.add(new Circle(3.0));
		list.add(new Circle(4.0));
		list.add(new Circle(5.0));		
		System.out.println("전체 도형의 합:" + sumArea(list));
	}
	
	private static double sumArea(List list) {
		double sumLength=0.0;
		for(int i=0;i<list.size();i++) {
			Shape s=(Shape)list.get(i); //값가져오기 / list 객체 형변환해야함 중요
			sumLength+=s.length();
		}
		return sumLength;
	}
}
