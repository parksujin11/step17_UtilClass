package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass07 {
   private static String[] arg;
   public static void main(String[] args) {
      String[] names = new String[3];
      names[0] = "�豸��";
      names[1] = "�ذ�";
      names[2] = "������";
      
      // 1�� �ε����� ������ �����ؼ� ������ ���
      String a = names[1];
      // �迭�� ���� ����
      int length = a.length(); // length ��� �ʵ� ����
      // 2���� ����?
      names[2] = null; // names�� 2������ �����͸� null ������ �����. (�� ��ü�� ���� �Ұ�) 
      
      ArrayList<String> names2 = new ArrayList<String>();
      names2.add("�豸��");
      names2.add("�ذ�");
      names2.add("������");      
      
      // 1�� �ε����� ������ �����ؼ� ������ ���
      String b= names2.get(1);
      // ���� �迭�� ���� ���� ����
      int size = names2.size(); // �޼ҵ�� ���� �ޱ�
      // 2���� ����
      names2.remove(2);
      
      // �Ʒ��� �߰��� printNames() �޼ҵ带 ȣ���� ������.

      
      printNames(names);
      System.out.println("----------");
      printFriends(names2);
   }
   /*
      String[] type �� ���ڷ� ���� �޴� static �ɹ� �޼ҵ� �� ����� ������.
      ���������� : public
      ���� type : void
      �޼ҵ�� : printNames
      �޼ҵ忡 ���޵Ǵ� ���ڸ� ���� ������ : arg
   */
   public static void printNames(String[] arg) {
      // �ݺ��� ���鼭 �迭�� �ִ� ��� ���ڿ��� ����ϴ� �ڵ带 �ۼ��� ������.
      for(String tmp:arg) {
         System.out.println(tmp);
      }      
   }
   /*
      List type<String> �� ���ڷ� ���� �޴� static �ɹ� �޼ҵ� �� ����� ������.
      ���������� : public
      ���� type : void
      �޼ҵ�� : printFriends
      �޼ҵ忡 ���޵Ǵ� ���ڸ� ���� ������ : arg
    */   
   public static void printFriends(List<String> arg) {
      for(String tmp:arg) {
         System.out.println(tmp);
      }            
   }
   
}