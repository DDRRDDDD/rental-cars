package board;

import java.sql.Timestamp;

public class BoardRequest {
	private int boardNo;
	private String writer;
	private String title;
	private String content;
	private int count;
	private Timestamp modifyDate;
	
	public BoardRequest(int boardNo, String writer, String title, String content, int count, Timestamp modifyDate) {
		this.boardNo = boardNo;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.count = count;
		this.modifyDate = modifyDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return content;
	}

	public void setContents(String content) {
		this.content = content;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}	
}
