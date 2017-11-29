package com.admin.goodsonline.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	private int customerId;
	private String customerName;
	private String customerPassword;
	private String customerTrueName;
	private String customerAddress;
	private String customerPhone;
	private String customerBirthday;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerTrueName() {
		return customerTrueName;
	}
	public void setCustomerTrueName(String customerTrueName) {
		this.customerTrueName = customerTrueName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerBirthday() {
		return customerBirthday;
	}
	public void setCustomerBirthday(String customerBirthday) {
		this.customerBirthday = customerBirthday;
	}
	 @Override
	    public String toString() {
	        return "Customer [customerName=" + customerName + ", customerPassword=" + customerPassword + "]";
	    }
	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((customerPassword == null) ? 0 : customerPassword.hashCode());
	        result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
	        return result;
	    }
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Customer other = (Customer) obj;
	        if (customerPassword == null) {
	            if (other.customerPassword != null)
	                return false;
	        } else if (!customerPassword.equals(other.customerPassword))
	            return false;
	        if (customerName == null) {
	            if (other.customerName != null)
	                return false;
	        } else if (!customerName.equals(other.customerName))
	            return false;
	        return true;
	    }
}
