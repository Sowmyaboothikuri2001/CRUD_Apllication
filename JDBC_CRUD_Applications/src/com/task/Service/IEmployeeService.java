package com.task.Service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface IEmployeeService {
	    public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException,SQLException;

	    public void UpdateEmployee(EmployeeBean bean) throws ClassNotFoundException,SQLException;
	    
	    public void SelectEmployee(EmployeeBean bean)throws ClassNotFoundException,SQLException;
	    
	    public void DeleteEmployee(EmployeeBean bean)throws ClassNotFoundException,SQLException;
	   }

