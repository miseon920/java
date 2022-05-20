package chap13;

import java.util.HashMap;
import java.util.Map;
/*
 * 해쉬 맵은 (키와 벨류) /
 * 키는 문자형 벨류는 정수형
 * */
public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String[] names= {"홍길동","김유신","이순신","강감찬","김유신"};
		int[] nums= {1234,12345,12346,12348,456232};
		
		for(int i =0;i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("홍길동 번호 : "+ map.get("홍길동") );
		System.out.println("김유신 번호 : "+ map.get("김유신") ); //값이 바뀔때 마지막 값으로 변경되어 출력함
	}
}
