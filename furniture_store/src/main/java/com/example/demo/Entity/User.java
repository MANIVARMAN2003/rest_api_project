package com.example.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class  User{
	@Id
	private int userid;
	private String username;
	private String address;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="fk_payment_no")
	private Payment payment;
	public User(Payment payment) {
		super();
		this.payment = payment;
	}
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="fk_order_no")
	private Orde orderof;
	public User(Orde orderof) {
		super();
		this.orderof = orderof;
	}
	public Orde getOrderof() {
		return orderof;
	}
	public void setOrderof(Orde orderof) {
		this.orderof = orderof;
	}
	public List<Product> getPr() {
		return pr;
	}
	public void setPr(List<Product> pr) {
		this.pr = pr;
	}
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name ="fk_product")
	private List<Product> pr;
	
	public User(List<Product> pr) {
		super();
		this.pr = pr;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public User() {
		super();
	}
	public User(int userid, String username, String address) {
		super();
		this.userid = userid;
		this.username = username;
		this.address = address;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
