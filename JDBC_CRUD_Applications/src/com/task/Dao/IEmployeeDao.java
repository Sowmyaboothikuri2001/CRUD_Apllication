package com.task.Dao;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface IEmployeeDao {

	public void UpdateEmployee(EmployeeBean bean) throws ClassNotFoundException , SQLException;
	
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException , SQLException;

	void SelectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
	
	void DeleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
}

