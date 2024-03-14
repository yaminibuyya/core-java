package Externalizationnnn;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class  User implements Externalizable {
	private int id;
	private String username; 
	private transient String password;
	
	public User() {
	}
	public User(int id,String username) {
		this.id=id;
		this.username=username;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(username);	
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		setId(in.readInt());
		setUsername((String)in.readObject());
				 
	 	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", getId()=" + getId() + ", getUsername()=" + getUsername()
				+ "]";
	}
	

}
