package test.main;

import java.util.ArrayList;

import test.dto.MemberDto;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 3�� �� ȸ�������� ���� MemberDto ��ü�� ��Ƽ�
		 * ArrayList ��ü�� MemberDto ��ü�� �������� ���� ���� ������.
		 */
		MemberDto dto1=new MemberDto(1, "�豸��", "��ŵ�");
		MemberDto dto2=new MemberDto(2, "�ڼ���", "�뷮��");
		MemberDto dto3=new MemberDto(3, "������", "���｣");
		
		ArrayList<MemberDto> members=new ArrayList<MemberDto>();
		members.add(new MemberDto(1, "�豸��", "�뷮��" ));
		members.add(new MemberDto(2, "�ڼ���", "��ŵ�" ));
		members.add(new MemberDto(3, "������", "���｣" ));
	}
		
}
	
	

