package test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//고정된 객체들로 구성된 list 생성
		List<String> list1 =Arrays.asList("박수진", "용지희", "조한솔");
		for(String name:list1) {
			System.out.println(name);
		}// 0번방 박수진 1번방 용지희 2번반 조한솔 
		System.out.println();
		
		List<Integer> list2 =Arrays.asList(new Integer(1),new Integer(2),new Integer(3));
		//그냥 (1,2,3)적어도 자동으로 된다. 
		for(int value : list2) {
			System.out.println(value);
		}
		System.out.println();
		
		List<String> names=new ArrayList<String>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		//List 의 방의 갯수 만큼 반복문 돌면서 
		for(int i=0; i<names.size(); i++) {
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		System.out.println("--- 확장 for 문 사용 ----");
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}

}
