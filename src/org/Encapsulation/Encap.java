package org.Encapsulation;

public class Encap {

	private String username;
	private int password;
	
	public String getUsername() {
		return username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setUsername(String username) {
		if (username.equals("mani")) {
		this.username ="mani personal account";
	}
		else if(username.equals("raj")) {
			this.username="raj personal account";
		}
		else {
	   this.username="invalid username";
		
		}
           
System.out.println("kihhh");


	}
public static void main(String[] args) {
	Encap e=new Encap();
     e.getUsername();
}

}
