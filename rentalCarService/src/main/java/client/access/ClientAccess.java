package client.access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import client.Client;
import client.ClientRequest;
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
	
	public Client getClientByIdAndPw(String id, String pw) {
		Client client = null;
		this.conn = DBManager.getConnection();
		
		if(this.conn == null)
			return null;
		
		String sql = "SELECT * FROM rental_car.client WHERE client_id=? AND password=?";
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, id);
			this.pstmt.setString(2, pw);
			this.rs = this.pstmt.executeQuery();
			
			while(this.rs.next()) {
				String clientId = this.rs.getString(1);
				String password = this.rs.getString(2);
				String name = this.rs.getString(3);
				String phone = this.rs.getString(4);
				String address = this.rs.getString(5);
				Timestamp date = this.rs.getTimestamp(6);
				client = new Client(clientId, password, name, phone, address, date);
			}
			
		} catch (SQLException e) {
			System.out.println("error by getClientByIdAndPw");
			e.printStackTrace();
		}
		DBManager.closeConnection(this.conn, this.pstmt, this.rs);
		
		return client;
	}
	
	public void createClient(ClientRequest clientDto) {
		this.conn = DBManager.getConnection();
		
		if(this.conn == null)
			return;
		
		String sql = "INSERT INTO rental_car.client"+
					 "(client_id, password, name, phone, client_address)"+
					 "VALUES (?,?,?,?,?)";
		
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, clientDto.getClientId());
			this.pstmt.setString(2, clientDto.getPassword());
			this.pstmt.setString(3, clientDto.getName());
			this.pstmt.setString(4, clientDto.getPhone());
			this.pstmt.setString(5, clientDto.getAddress());
			
			this.pstmt.execute();
		} catch (SQLException e) {
			System.out.println("error by createClient");
			e.printStackTrace();
		}
		
		DBManager.closeConnection(this.conn, this.pstmt);
	}
}
