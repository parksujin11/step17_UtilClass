package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		//�ڹٽ�ũ��Ʈ var names=[]; �����迭
		//			names.push("kim");
		//�ڹ� 		List<String> names=new ArrayList<String>();
		//			names.add("kim");
		
		/*
		 * javascript ������ {} �� �����ϰ� �����͸� �����ϴ� type->HashMap
		 */
		Map<String, Object> map=new HashMap<>();//���� Ű���� ��Ʈ������ ����.
		//key generic->String
		//value generic->Object
		map.put("num", 1);//put �޼ҵ�
		map.put("name", "�豸��");
		map.put("isMan", "true");//map�� Ư���� �������� �����ְ� Object�� ���°� ����.
		//map�� ������ ������ ������ �ʴ�. 
		
		int a=(int)map.get("num");//get �޼ҵ�
		//num�� ��Ʈ Ÿ���̴ϱ�  map�տ� int ���� 
		String b=(String)map.get("name");
		boolean c=(boolean)map.get("isMan");
	}

}
