/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.psimm.order.modules.order.entity.first;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 对已有员工操作Entity
 * @author pangpj
 * @version 2018-05-16
 */
public class Employee extends DataEntity<Employee> {
	
	private static final long serialVersionUID = 1L;
	private String userName;		// 员工姓名
	
	public Employee() {
		super();
	}

	public Employee(String id){
		super(id);
	}

	@Length(min=1, max=64, message="员工姓名长度必须介于 1 和 64 之间")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}