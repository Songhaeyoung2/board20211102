package board;

public class Reply {
	//private 붙혀주기
	private int partentNo;
	private String rBody;
	private String Writer;
	private String regDate;
	
	//생성자 
	public Reply(int partentNo, String rBody, String writer, String regDate) {
		super();
		this.partentNo = partentNo;
		this.rBody = rBody;
		Writer = writer;
		this.regDate = regDate;
	}
	
	
	
	//getter setter 만들기 
	public int getPartentNo() {
		return partentNo;
	}
	public void setPartentNo(int partentNo) {
		this.partentNo = partentNo;
	}
	public String getrBody() {
		return rBody;
	}
	public void setrBody(String rBody) {
		this.rBody = rBody;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

}
