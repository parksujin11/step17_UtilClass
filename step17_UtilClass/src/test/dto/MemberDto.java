package test.dto;
/*
 * Data Transfer Object의 약자 : Dto
 */
public class MemberDto {
	//맴버 필드 정의하기 
	private int num;
	private String name;
	private String addr;
	//디폴트 생성자
	public MemberDto() {}
	//우클릭 source->Generate constructor using fields
	public MemberDto(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	//우클릭 source->Generate setter and getter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
