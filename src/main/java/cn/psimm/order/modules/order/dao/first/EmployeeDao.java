/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.psimm.order.modules.order.dao.first;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import cn.psimm.order.modules.order.entity.first.Employee;

/**
 * 对已有员工操作DAO接口
 * @author pangpj
 * @version 2018-05-16
 */
@MyBatisDao
public interface EmployeeDao extends CrudDao<Employee> {
    Employee getEmployeeByName(String name);
}