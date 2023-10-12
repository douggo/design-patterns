package br.com.douggo.adapter.hexagonal.core.model;

public class User {
	private final String name;
	private final String email;
	private final String password;
	
	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	public static class Builder {
		private String name;
		private String email;
		private String password;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public User build() {
			return new User(this.name, this.email, this.password);
		}

	}

}
