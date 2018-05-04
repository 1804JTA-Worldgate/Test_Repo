package com.hpark12.dao;

import com.hpark12.model.EmployeeAnn;
import com.hpark12.model.EmployeeXML;

public interface EmployeeDao {

	public void insertEmployee(EmployeeXML emp);
	public void insertEmployeeAnn(EmployeeAnn emp);
}
