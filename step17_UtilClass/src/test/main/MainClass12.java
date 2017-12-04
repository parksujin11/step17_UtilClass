package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * [HashSet]
 * 
 * -������ ����.
 * -�ߺ��� ������� �ʴ´�.
 * -������ �������� �����͸� ���� �ϰ� ������ ����Ѵ�.
 * 
 */
public class MainClass12 {
	public static void main(String[] args) {
		//HashSet ��ü �����ؼ� �������� ������ ���
	
		Set<Integer> lottoNums=new HashSet<Integer>();
		
		Random ran=new Random();
		
		while(true) {
			int num=ran.nextInt(45)+1;
			//Set ����
			lottoNums.add(num);
			//Set �� 6 ���� ����Ǹ� �ݺ��� Ż��
			if(lottoNums.size()==6) {
				break; //�ݺ��� �� ���� ������
			}
		}
		//set �� List�� ��ȯ! 
		List<Integer> nums=new ArrayList<>(lottoNums);
		//����
		Collections.sort(nums);
		//���
		for(int tmp:nums) {
			System.out.println(tmp);
		}
	}

}