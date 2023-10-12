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
}
