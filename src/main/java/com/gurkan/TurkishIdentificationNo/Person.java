package com.gurkan.TurkishIdentificationNo;

public class Person {
	
	private long tcNo;
	private String name;
	private String surname;
	private int birthday;	
	
	
	public Person(long tcNo, String name, String surname, int birthday) {
		super();
		this.tcNo = tcNo;
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
	}


	public long getTcNo() {
		return tcNo;
	}
	public void setTcNo(long tcNo) {
		this.tcNo = tcNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

}
