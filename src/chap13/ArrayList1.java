package chap13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 리스트는 인터페이스()
 * ArrayList 또한 리스트의 상속을 받음 따라서 리스트의 정보가있음
 * */
public class ArrayList1 {
	public static void main(String[] args) {
		//List<E>
		//ArrayList<E>
		List list = new ArrayList();
		list.add(1);list.add(2);list.add(3);list.add(4); //입력하기
		System.out.println(list); //배열과 비슷하므로 for문사용
		
		for (int i=0;i<list.size();i++) { //배열은 길이를 length으로 하나 리스트는 size로 길이를 구함
			System.out.println(i+":"+list.get(i));
		}
		//LinkedList<E>
		list=new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		
		list.remove(1);
		int len=list.size();

		for (int i=0;i<list.size();i++) { 
			System.out.println(i+":"+list.get(i));
		}
	}
}
