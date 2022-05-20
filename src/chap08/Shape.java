package chap08;
/*
상속을 받은쪽에서 메서드를 정의할때 추상클래스를 사용함
-Override로 재정의 해줘야함

#도형면적 계산(같은 계산인대 계산방식만 다를경우 정의하지않음)
삼각형 면적 계산
사각형 면적 계산
...

1.삼각형은 도형이다
2.사각형은 도형이다.
3.원은 도형이다

도형의 면적을 구하시오
 */
abstract class Shape { //추상클래스의 경우 public가아닌 abstract class로 만들어야함
	String type; //도형의 종류(필드)
	public Shape(String type) {
		this.type=type;
	}
	//추상메서드
	abstract double area(); //면적
	abstract double length(); //길이
}
