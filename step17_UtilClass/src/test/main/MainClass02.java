package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {
	public static void main(String[] args) {
	//String type 을 담을 수 있는 ArrayList 객체 생성
	List<String> msgs=new ArrayList<String>();
	//.add 메소드는 비어있는 마지막 인덱스에 스트링 객체를 저장 
	msgs.add("하나");
	msgs.add("두울");
	msgs.add("세엣");
	msgs.add(1, "네엣");//1번 인덱스에 네엣으로 바뀜 
	
	int size=msgs.size();
	System.out.println("총객체수:"+size);
	
	String skill =msgs.get(2);//skill은 변수 
	System.out.println("2:"+skill);
	System.out.println();
	
	for(int i=0; i<msgs.size(); i++) {  
		String str=msgs.get(i);
		System.out.println(i+":"+str);	
	}
	System.out.println();
	
	msgs.remove(2);
	
	for(int i=0; i<msgs.size(); i++) {
		String str=msgs.get(i);
		System.out.println(i+":"+str);	
	}
	
	//int type 을 담을 수 있는 ArrayList 객체 생성
	List<Integer>nums=	new ArrayList<Integer>();
	nums.add(10);
	nums.add(20);
	nums.add(30);
	
	//.get(index) 데이터 참조 
	String a=msgs.get(0);
	String b=msgs.get(1);
	String c=msgs.get(2);
	}
}
