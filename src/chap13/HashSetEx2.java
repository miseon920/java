package chap13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		//HashSet<E>
		//Set<E>
		Set set=new HashSet();
		set.add(new String("abc"));
		set.add(new String("abc"));
		
		set.add(new Member("홀길동",40));
		set.add(new Member("홀길동",40));
		
		System.out.println(set);
	}
}
