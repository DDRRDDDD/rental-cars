package client;

public class ClientRequest {
	
	private String clientId;
	private String password;
	private String name;
	private String phone;
	private String address;
	
	public ClientRequest(String clientId, String password, String name, String phone, String address) {
		this.clientId = clientId;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
