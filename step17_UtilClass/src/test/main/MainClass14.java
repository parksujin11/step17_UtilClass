package test.main;

public class MainClass14 {
	public static void main(String[] args) {
		//java.lang.StringBuilder
		StringBuilder builder=new StringBuilder();
		
		String myStr="";
				
		for(int i=0; i<10; i++) {
			builder.append("������ ���ڿ�...");
			myStr=myStr+"������ ���ڿ�2...";
		}
		//StringBuilder ��ü�� ������ ���ڿ��� String type ���� ����
		String str=builder.toString();
		System.out.println(str);
		System.out.println(myStr);
	}

}
