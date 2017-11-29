package com.admin.goodsonline.customer.dao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.admin.goodsonline.entity.Customer;

//注入  
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Resource
	HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> retireve(String customerName,String customerPassword) {
		// TODO Auto-generated method stub
		List<Customer> list = new ArrayList<>();
		list=(List<Customer>) hibernateTemplate.find("from customer as u where u.customerName='"+customerName+"' and u.customerPassword='"+customerPassword+"'");
		
		if(list.size()>0 && list!=null)
            return list;
        return Collections.emptyList();
	}
}

	/*private SessionFactory sessionFactory;
	
	public Customer find(){
		String sql = "select * from customer where customerName = ? and where customerPassword = ? ";
		Customer customer = new Customer();
				this.jdbcTemplate.query(sql,
				new Object[] {},
	    new RowCallbackHandler() {
			@Override
		        public void processRow(ResultSet rs) throws SQLException {
		        	
		        	customer.setCustomerName(rs.getString("customerName"));
		        	customer.setCustomerPassword(rs.getString("customerPassword"));
		        	
		        }
	    });
		return customer;
	}*/
	/*public boolean register(String username,String password,
			String email,String telephone,
			String address) {
		Connection connection = DbConnection.getConnection();
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement("INSERT INTO `users`(`user_username`, `user_passwd`,"
					+ "`user_email`,`user_telephone`,`user_address`)  VALUE (?,?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setString(4, telephone);
			ps.setString(5, address);
			ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public List<Users> selectAll () {
		List<Users> list = new ArrayList<Users>();
		Users user = null;
		Connection connection = DbConnection.getConnection();
		PreparedStatement ps =null;
		ResultSet rs=null;
		try {
			 ps = connection.prepareStatement("select * from users");			 
			 rs = ps.executeQuery();
			while(rs.next()) {
				user = new Users();
				user.setUser_id(rs.getInt("user_id"));
				user.setUser_username(rs.getString("username"));
				user.setUser_passwd(rs.getString("password"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}*/
