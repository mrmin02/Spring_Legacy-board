package minseok.yju.wda.domain;

public class Criteria {
	private int pageNum;
	private int amount;
	private String type;
	private String keyword;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Criteria() {
		this(1,10);
	}
	public Criteria(int pageNum, int amount) {
		this.pageNum=pageNum;
		this.amount = amount;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getOffset() {
		return (pageNum -1) * amount;
	}
	public String toString() {
		return "pageNum["+pageNum+"] amount["+amount+"]";
	}
	
	public String[] getTypeArr() {
		return type==null? new String[] {} : type.split("");
	}
}
