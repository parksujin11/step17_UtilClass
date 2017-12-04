package test.main;

import java.util.Stack;

/*
 * [Stack]
 * -선입 후출 구조로 데이터를 관리 하고 싶을때 사용
 * -순서가 있는 데이터이다 (인덱스가 있음)
 * 
 * 데이터 저장: .push(데이터)
 * 데이터 빼내기:.pop()
 * 모두 삭제 : clear()
 */
public class MainClass13 {
	public static void main(String[] args) {
		
	Stack<String> stack1 =new Stack<String>();
	stack1.push("녹색");
	stack1.push("주황색");
	stack1.push("빨간색");
	
	String one=stack1.pop();
	String two=stack1.pop();
	String three=stack1.pop();
	
	}
}
