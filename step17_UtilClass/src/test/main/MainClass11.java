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
public class MainClass11 {
	public static void main(String[] args) {
		//HashSet ��ü �����ؼ� �������� ������ ���
	
		Set<Integer> lottoNums=new HashSet<Integer>();
		
		Random ran=new Random();
		
		while(true) {
			int num=ran.nextInt(45)+1;
			//Set ����
			lottoNums.add(num);
			//Set �� 6 ���� ����Ǹ� �ٺ��� Ż��
			if(lottoNums.size()==6) {
				break; //�ݺ��� �� ���� ������
			}
		}
		//�ݺ��� ��ü ���Ϲޱ�
	      Iterator<Integer> it=lottoNums.iterator();
	      while(it.hasNext()) {
	         int tmp=it.next();
	         //�ֿܼ� ����غ���
	         System.out.println(tmp);
	      }
	}

}
