package com.task.Service;

import java.sql.SQLException;

import com.task.Dao.EmployeeDaoImpl;
import com.task.bean.EmployeeBean;

public class EmployeeServiceImpl {
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
	   dao.insertEmployee(bean);
	}
	   public void UpdateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
			EmployeeDaoImpl dao=new EmployeeDaoImpl();
		   dao.UpdateEmployee(bean);
	   }
		   public void SelectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
				EmployeeDaoImpl dao=new EmployeeDaoImpl();
			   dao.SelectEmployee(bean);
}
		   public void DeleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
				EmployeeDaoImpl dao=new EmployeeDaoImpl();
			   dao.DeleteEmployee(bean);
}		   

}
