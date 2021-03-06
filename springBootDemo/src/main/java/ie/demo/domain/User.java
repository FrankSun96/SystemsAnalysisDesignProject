package ie.demo.domain;

import java.io.Serializable;

public class User implements Serializable{

	private int userId;
	private String username;
	private String password;
	private boolean banned;
	private long studentCardId;
	private int userTypeId;
	private String email;
	
	public User() {
	}
	public User(String username, String password, long studentCardId, String email, int userTypeId) {
		this.username = username;
		this.password = password;
		this.studentCardId = studentCardId;
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public boolean isBanned() {
		return banned;
	}
	public void setBanned(boolean banned) {
		this.banned = banned;
	}
	public long getStudentCardId() {
		return studentCardId;
	}
	public void setStudentCardId(long studentCardId) {
		this.studentCardId = studentCardId;
	}
	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
