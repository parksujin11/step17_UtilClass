package test.main;

import java.util.Stack;

/*
 * [Stack]
 * -���� ���� ������ �����͸� ���� �ϰ� ������ ���
 * -������ �ִ� �������̴� (�ε����� ����)
 * 
 * ������ ����: .push(������)
 * ������ ������:.pop()
 * ��� ���� : clear()
 */
public class MainClass13 {
	public static void main(String[] args) {
		
	Stack<String> stack1 =new Stack<String>();
	stack1.push("���");
	stack1.push("��Ȳ��");
	stack1.push("������");
	
	String one=stack1.pop();
	String two=stack1.pop();
	String three=stack1.pop();
	
	}
}
