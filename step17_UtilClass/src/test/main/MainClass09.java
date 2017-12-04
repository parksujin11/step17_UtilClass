package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "�豸��");
		map1.put("addr", "�뷮��");
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "�ذ�");
		map2.put("addr", "��ŵ�");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "������");
		map3.put("addr", "������");
		
		//3���� ������ ���� ��� �ִ� HashMap ��ü�� ArrayList ��ü�� ���� ���� ������.
		List<Map<String, Object>> members=new ArrayList<>();
		members.add(map1);
		members.add(map2);
		members.add(map3);
		
		//�Ʒ��� �޼ҵ带 ���غ�����.
		printMembers(members);
	}
	/*
	 * List<<Map><String, Object> type �� ���� �޴� static ��� �޼ҵ带 ����� ������.
	 * �޼ҵ�� : printMembers 
	 */
	public static void printMembers(List<Map<String,Object>> arg) {
		/*
		 * ���ڷ� ���޹��� arg �� �ִ� �������� �̿��ؼ� ȸ�������� �Ʒ��� ���� �������� ����� ������.
		 * ��ȣ:1, �̸�: �豸��, �ּ�:�뷮��
		 */
		//List �� �迭 , �迭�� size
		for(int i=0; i<arg.size(); i++) {
			//List �� i ��° item ����
			Map<String, Object> tmp=arg.get(i);
			//Map�� ����� data �ҷ�����
			int num=(int)tmp.get("num");
			String name=(String)tmp.get("name");
			String addr=(String)tmp.get("addr");
			//�ֿܼ� ����ϱ�
			System.out.println("��ȣ:"+num+",�̸�:"+name+"�ּ�:"+addr);
		}
		
		for(Map<String, Object> tmp:arg) {
			
		}
	}

}
