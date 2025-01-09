package com.example.persistance.entities;

import java.util.Objects;

public class Officer {

	Integer id;
	Rank rank;
	String firstName;
	String lastName;
	
	public Officer() {
		// TODO Auto-generated constructor stub
	}

	public Officer(Rank rank, String firstName, String lastName) {
		super();
		this.rank = rank;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Officer(Integer id, Rank rank, String firstName, String lastName) {
		super();
		this.id = id;
		this.rank = rank;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
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
		return "Officer [id=" + id + ", rank=" + rank + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName, rank);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Officer other = (Officer) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName) && rank == other.rank;
	}
	
	
	
	

}
