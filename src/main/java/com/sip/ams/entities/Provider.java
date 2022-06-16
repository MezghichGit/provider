package com.sip.ams.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Provider {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Override
	public String toString() {
		return "Provider [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public Provider(Long id, String name, String address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Provider() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String name;
	private String address;

}
