package client.access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import client.Client;
import util.DBManager;

public class ClientAccess {
	private static final ClientAccess instance = new ClientAccess();
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private ClientAccess() {}
	
	public static ClientAccess getInstance() {
		return instance;
	}
	
	public Client getClientByidAndPw(String id, String pw) {
		Client client = null;
		this.conn = DBManager.getConnection();
		
		String sql = "SELECT * FROM client WHERE client_id=? AND password=?";
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.rs = this.pstmt.executeQuery();
			
			while(rs.next()) {
				String clientId = this.rs.getString(1);
				String password = this.rs.getString(2);
				String name = this.rs.getString(3);
				String phone = this.rs.getString(4);
				String address = this.rs.getString(5);
				Timestamp date = this.rs.getTimestamp(6);
				client = new Client(clientId, password, name, phone, address, date);
			}
			
		} catch (SQLException e) {
			System.out.println("error by getClientById!!");
			e.printStackTrace();
		}
		DBManager.closeConnection(this.conn, this.pstmt, this.rs);
		
		return client;
	}
}
