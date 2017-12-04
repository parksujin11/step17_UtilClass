package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		//자바스크립트 var names=[]; 가변배열
		//			names.push("kim");
		//자바 		List<String> names=new ArrayList<String>();
		//			names.add("kim");
		
		/*
		 * javascript 에서의 {} 와 유사하게 데이터를 관리하는 type->HashMap
		 */
		Map<String, Object> map=new HashMap<>();//보통 키값은 스트링으로 쓴다.
		//key generic->String
		//value generic->Object
		map.put("num", 1);//put 메소드
		map.put("name", "김구라");
		map.put("isMan", "true");//map의 특성상 여러가지 들어갈수있게 Object로 쓰는게 좋다.
		//map은 순서가 정해져 있지는 않다. 
		
		int a=(int)map.get("num");//get 메소드
		//num은 인트 타입이니까  map앞에 int 적음 
		String b=(String)map.get("name");
		boolean c=(boolean)map.get("isMan");
	}

}
