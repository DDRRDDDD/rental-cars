package board;

import java.sql.Timestamp;

public class Board {
	private int boardNo;
	private String writer;
	private String title;
	private String contents;
	private int count;
	private Timestamp modifyDate;
	
	public Board(int boardNo, String writer, String title, String contents, int count, Timestamp modifyDate) {
		this.boardNo = boardNo;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.count = count;
		this.modifyDate = modifyDate;
	}
	
	public Board(String writer, String title, String contents) {
		this.writer = writer;
		this.title = title;
		this.contents = contents;
	}
	
	public Board(BoardRequest boardDto) {
		this.boardNo    = boardDto.getBoardNo();
		this.writer     = boardDto.getWriter();
		this.title      = boardDto.getTitle();
		this.contents   = boardDto.getContents();
		this.count      = boardDto.getCount();
		this.modifyDate = boardDto.getModifyDate();
		
	}

	public int getBoardNo() {
		return boardNo;
	}

	public String getWriter() {
		return writer;
	}

	public String getTitle() {
		return title;
	}

	public String getContents() {
		return contents;
	}
	
	public String getPreview(int limmit) {
		// 20줄 미리보기
		int length = this.contents.length();
		int preview   = length < limmit ? length : limmit;
		String anyDot = length < limmit ? "" : "...";
		return contents.substring(0, preview) +anyDot;
	}
	

	public int getCount() {
		return count;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}	
}
