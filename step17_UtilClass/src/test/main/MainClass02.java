package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {
	public static void main(String[] args) {
	//String type �� ���� �� �ִ� ArrayList ��ü ����
	List<String> msgs=new ArrayList<String>();
	//.add �޼ҵ�� ����ִ� ������ �ε����� ��Ʈ�� ��ü�� ���� 
	msgs.add("�ϳ�");
	msgs.add("�ο�");
	msgs.add("����");
	msgs.add(1, "�׿�");//1�� �ε����� �׿����� �ٲ� 
	
	int size=msgs.size();
	System.out.println("�Ѱ�ü��:"+size);
	
	String skill =msgs.get(2);//skill�� ���� 
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
	
	//int type �� ���� �� �ִ� ArrayList ��ü ����
	List<Integer>nums=	new ArrayList<Integer>();
	nums.add(10);
	nums.add(20);
	nums.add(30);
	
	//.get(index) ������ ���� 
	String a=msgs.get(0);
	String b=msgs.get(1);
	String c=msgs.get(2);
	}
}
