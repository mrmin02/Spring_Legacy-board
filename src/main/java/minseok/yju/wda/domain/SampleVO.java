package minseok.yju.wda.domain;

public class SampleVO {
	private int mno;
	private String firstName;
	private String lastName;
	
	public SampleVO(int mno, String firstName, String lastName) {
		this.mno = mno;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
