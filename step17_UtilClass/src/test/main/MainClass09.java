package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "행신동");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		map3.put("addr", "동물원");
		
		//3명의 정보를 각각 담고 있는 HashMap 객체를 ArrayList 객체에 누적 시켜 보세요.
		List<Map<String, Object>> members=new ArrayList<>();
		members.add(map1);
		members.add(map2);
		members.add(map3);
		
		//아래의 메소드를 콜해보세요.
		printMembers(members);
	}
	/*
	 * List<<Map><String, Object> type 을 전달 받는 static 멤버 메소드를 만들어 보세요.
	 * 메소드명 : printMembers 
	 */
	public static void printMembers(List<Map<String,Object>> arg) {
		/*
		 * 인자로 전달받은 arg 에 있는 참조값을 이용해서 회원정보를 아래와 같은 형식으로 출력해 보세요.
		 * 번호:1, 이름: 김구라, 주소:노량진
		 */
		//List 는 배열 , 배열은 size
		for(int i=0; i<arg.size(); i++) {
			//List 에 i 번째 item 참조
			Map<String, Object> tmp=arg.get(i);
			//Map에 저장된 data 불러오기
			int num=(int)tmp.get("num");
			String name=(String)tmp.get("name");
			String addr=(String)tmp.get("addr");
			//콘솔에 출력하기
			System.out.println("번호:"+num+",이름:"+name+"주소:"+addr);
		}
		
		for(Map<String, Object> tmp:arg) {
			
		}
	}

}
