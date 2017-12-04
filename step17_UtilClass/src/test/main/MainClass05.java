 package test.main;

import java.util.ArrayList;

import test.dto.MemberDto;

public class MainClass05 {
   public static void main(String[] args) {
      
      // MemberDto type 의 참조값을 담을수 있는 방 3개짜리 고정 배열
      MemberDto[] members = new MemberDto[3];
      
      // MemberDto type 의 참조값을 담을수 있는 가변배열
      ArrayList<MemberDto> members2 = new ArrayList<MemberDto>();
      int[] nums = new int[3];
      
      // 아래의 배열 비교 하기      
      ArrayList<Integer> nums2 = new ArrayList<Integer>();
      
      nums2.add(10);
      
   }
}