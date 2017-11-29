package com.admin.goodsonline.entity;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
//创建的数据库表名称
@Table(name = "T_USER")
public class User {
	@Id
    //关键字生成模式
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    private String id;

    @Column(length = 32)
    private String userName;

    @Column(length = 32)
    private String age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
