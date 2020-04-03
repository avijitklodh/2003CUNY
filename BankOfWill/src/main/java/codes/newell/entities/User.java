package codes.newell.entities;

import codes.newell.utilities.Hasher;

public class User {

	private String id;
	private String firstName;
	private String lastName;
	private String passwordHash;
	private String username;
	private boolean adminStatus;

	public User() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return firstName + ' ' + lastName;
	}

	public void setName(String name) {
		String[] names = name.split(" ");
		this.firstName = names[0];
		this.lastName = names[names.length - 1];
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		// AES-256 is fixed length, assume raw password if length doesn't match
		if (passwordHash.length() != 64) {
			passwordHash = Hasher.hash(passwordHash);
		}
		this.passwordHash = passwordHash;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isAdminStatus() {
		return adminStatus;
	}

	public void setAdminStatus(boolean adminStatus) {
		this.adminStatus = adminStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", passwordHash="
				+ passwordHash + ", username=" + username + ", adminStatus=" + adminStatus + "]";
	}

}
