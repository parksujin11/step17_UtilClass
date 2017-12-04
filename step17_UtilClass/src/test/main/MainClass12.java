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
 * -순서가 없다.
 * -중복을 허용하지 않는다.
 * -집합의 개념으로 데이터를 관리 하고 싶을때 사용한다.
 * 
 */
public class MainClass12 {
	public static void main(String[] args) {
		//HashSet 객체 생성해서 참조값을 변수에 담기
	
		Set<Integer> lottoNums=new HashSet<Integer>();
		
		Random ran=new Random();
		
		while(true) {
			int num=ran.nextInt(45)+1;
			//Set 저장
			lottoNums.add(num);
			//Set 에 6 개가 저장되면 반복문 탈출
			if(lottoNums.size()==6) {
				break; //반복문 블럭 빠져 나오기
			}
		}
		//set 을 List로 변환! 
		List<Integer> nums=new ArrayList<>(lottoNums);
		//정렬
		Collections.sort(nums);
		//출력
		for(int tmp:nums) {
			System.out.println(tmp);
		}
	}

}