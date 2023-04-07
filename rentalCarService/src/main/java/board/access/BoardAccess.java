package board.access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import board.Board;
import util.DBManager;

public class BoardAccess {
	private static final BoardAccess instance = new BoardAccess();
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private BoardAccess(){}
	
	public static BoardAccess getInstance() {
		return instance;
	}
	
	public ArrayList<Board> getNotice(){
		ArrayList<Board> list = new ArrayList<>();
		
		this.conn = DBManager.getConnection();
		
		if(this.conn == null)
			return null;
		
		String sql = "SELECT * FROM rental_car.board\n" +
					 "WHERE 'booking_no' != ''\n" +
					 "ORDER BY count DESC";
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			this.rs = this.pstmt.executeQuery();
				
			while(this.rs.next()) {
				int boardNo = this.rs.getInt(1);
				String writer = this.rs.getString(2);
				String title = this.rs.getString(3);
				String contents = this.rs.getString(4);
				int count = this.rs.getInt(5);
				Timestamp modifyDate = this.rs.getTimestamp(6);
				
				Board board = new Board(boardNo, writer, title, contents, count, modifyDate);
				list.add(board);
			}			
		} catch(SQLException e) {
			System.out.println("error by boardAccess getNotice!!");
			e.printStackTrace();
		}
		DBManager.closeConnection(this.conn, this.pstmt, this.rs);		
		return list;
	}	
	
}
