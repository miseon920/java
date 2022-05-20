package chap15;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] {
			"홍길동","김유신","이순신","유관순"	
		});
		System.out.println("내부 반복자 사용");
		list.stream().forEach(ar->System.out.println(ar)); //s로 써도되고 상관없음
		
		for (String string : list) {
			 //forEach 문의 ar은 String string : list 를 줄여둔것! 
		}
	}	
}
