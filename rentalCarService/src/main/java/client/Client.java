package client;

import java.sql.Timestamp;

public class Client {
	
	private String clientId;
	private String password;
	private String name;
	private String phone;
	private String address;
	private Timestamp regDate;
	
	public Client(String clientId, String password, String name, String phone, String address) {
		this.clientId = clientId;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public Client(String clientId, String password, String name, String phone, String address, Timestamp regDate) {
		this.clientId = clientId;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.regDate = regDate;
	}
		
	public Client(ClientRequest clientDto) {
		this.clientId = clientDto.getClientId();
		this.password = clientDto.getPassword();
		this.name = clientDto.getName();
		this.phone = clientDto.getPhone();
		this.address = clientDto.getAddress();
	}
	
	public String getClientId() {
		return this.clientId;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	
	public Timestamp getRegDate() {
		return this.regDate;
	}
	
	
}
