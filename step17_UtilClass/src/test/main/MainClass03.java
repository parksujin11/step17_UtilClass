package test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//������ ��ü��� ������ list ����
		List<String> list1 =Arrays.asList("�ڼ���", "������", "���Ѽ�");
		for(String name:list1) {
			System.out.println(name);
		}// 0���� �ڼ��� 1���� ������ 2���� ���Ѽ� 
		System.out.println();
		
		List<Integer> list2 =Arrays.asList(new Integer(1),new Integer(2),new Integer(3));
		//�׳� (1,2,3)��� �ڵ����� �ȴ�. 
		for(int value : list2) {
			System.out.println(value);
		}
		System.out.println();
		
		List<String> names=new ArrayList<String>();
		names.add("�豸��");
		names.add("�ذ�");
		names.add("������");
		//List �� ���� ���� ��ŭ �ݺ��� ���鼭 
		for(int i=0; i<names.size(); i++) {
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		System.out.println("--- Ȯ�� for �� ��� ----");
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}

}
