package br.com.douggo.prototype.protoBuilder.model;

public class Address {
	private final String street;
	private final Integer number;
	
	public Address(String street, Integer number) {
		super();
		this.street = street;
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public Integer getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + "]";
	}

	public static class Builder {
		private String street;
		private Integer number;

		public Builder(String street, Integer number) {
			this.street = street;
			this.number = number;
		}

		public Builder street(String name) {
			this.street = street;
			return this;
		}

		public Builder number(Integer number) {
			this.number = number;
			return this;
		}

		public Address build() {
			return new Address(this.street, this.number);
		}

	}

}
