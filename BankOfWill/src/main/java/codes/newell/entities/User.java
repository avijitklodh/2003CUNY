package codes.newell.entities;

import codes.newell.utilities.Hasher;

public class User {

	// internal names match database names for easier DAO reflection
	private int id;
	private String first_name;
	private String last_name;
	private String username;
	private String password_hash;
	private boolean is_super;

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return first_name + ' ' + last_name;
	}

	public void setName(String name) {
		String[] names = name.split(" ");
		this.first_name = names[0];
		this.last_name = names[names.length - 1];
	}

	public String getPasswordHash() {
		return password_hash;
	}

	public void setPasswordHash(String passwordHash) {
		// AES-256 is fixed length, assume raw password if length doesn't match
		if (passwordHash.length() != 64) {
			passwordHash = Hasher.hash(passwordHash);
		}
		this.password_hash = passwordHash;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean getAdminStatus() {
		return is_super;
	}

	public void setAdminStatus(boolean adminStatus) {
		this.is_super = adminStatus;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastName) {
		this.last_name = lastName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + first_name + ", lastName=" + last_name + ", passwordHash="
				+ password_hash + ", username=" + username + ", adminStatus=" + is_super + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		User user = (User) obj;
		return user.id == this.id;
	}

}
