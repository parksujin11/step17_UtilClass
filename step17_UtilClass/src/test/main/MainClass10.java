package test.main;

import java.util.HashSet;
import java.util.Iterator;

/*
 * [HashSet]
 * 
 * -������ ����.
 * -�ߺ��� ������� �ʴ´�.
 * -������ �������� �����͸� ���� �ϰ� ������ ����Ѵ�.
 * 
 */
public class MainClass10 {
	public static void main(String[] args) {
		HashSet<Integer>nums=new HashSet<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(50);
		nums.add(50);
		nums.add(40);
		
		//set �� ����ִ� �������� ���� ���� 
		int size=nums.size();
		
		//�ݺ��� ��ü ���� �ޱ� 
		//iterator �ϸ� ������ ������� ������ �Ϸķ� ���� �� �ִ�.
		Iterator<Integer>it=nums.iterator();
		while(it.hasNext()){
			int tmp=it.next();
			//�ֿܼ� ����� ����
			System.out.println(tmp);
		}
	}

}
