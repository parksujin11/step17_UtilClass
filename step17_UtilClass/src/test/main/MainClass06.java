package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;

public class MainClass06 {
   public static void main(String[] args) {
      MemberDto dto1 = new MemberDto(1, "�豸��", "�뷮��");
      MemberDto dto2 = new MemberDto(2, "�ذ�", "��ŵ�");
      MemberDto dto3 = new MemberDto(3, "������", "�󵵵�");            
      
      MemberDto[] members = new MemberDto[3];
      // ���� �迭�� MemberDto ��ü�� ������ �����ϱ�
      members[0] = dto1;
      members[1] = dto2;
      members[2] = dto3;      
      
      // members �� ��� �ִ� �������� �̿��ؼ� "�ذ�"
      // �� �����ؼ� a��� �̸��� ������ ������ ������.
      
      String a = members[1].getName();
      
      List<MemberDto> members2 = new ArrayList<>();
      // ���� �迭�� MemberDto ��ü�� ������ �����ϱ�
      members2.add(dto1);
      members2.add(dto2);
      members2.add(dto3);      
      
      // members2 �� ��� �ִ� �������� �̿��ؼ� "�ذ�"
      // �� �����ؼ� b��� �̸��� ������ ������ ������.      
      String b = members2.get(1).getName();
   }

}