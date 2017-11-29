package com.admin.goodsonline.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="shoppingcart")
public class ShoppingCart {
	private int paySum;
	private Customer customer;
	private List<Goods> list;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getPaySum() {
		return paySum;
	}
	public void setPaySum(int paySum) {
		this.paySum = paySum;
	}
	@OneToOne
	@JoinColumn(name="customerId")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@OneToMany
	@JoinColumn(name="goodsId")
	public List<Goods> getList() {
		return list;
	}
	public void setList(List<Goods> list) {
		this.list = list;
	}
	

}
