package com.task.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.task.Util.DButil;
import com.task.bean.EmployeeBean;

public class EmployeeDaoImpl implements IEmployeeDao {

	
	public static PreparedStatement pst=null;
	public static Connection connection=null;
	
	
	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		int EmpId=bean.getEmpId();
		String EmpName=bean.getEmpName();
		String EmpAddress=bean.getEmpAddress();
		
		
		connection =DButil.getDBConnection();
		pst=connection.prepareStatement("insert into employee valurs(?,?,?)");
		pst.setInt(1, EmpId);
		pst.setString(2,EmpName );
		pst.setString(3,EmpAddress);
		pst.execute();
		System.out.println("one record is inserted sucessfully");
		
	}
	@Override
	public void UpdateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		int EmpId=bean.getEmpId();
		String EmpName=bean.getEmpName();
		String EmpAddress=bean.getEmpAddress();
		
		
		connection =DButil.getDBConnection();
		pst=connection.prepareStatement("update employee set EmployeeName=?,EmpAdress=? where EmpId Id=?");
		pst.setInt(3, EmpId);
		pst.setString(1,EmpName );
		pst.setString(2,EmpAddress);
		pst.executeUpdate();
		System.out.println("Updated sucessfully");
	
	}
	public void SelectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		int EmpId=bean.getEmpId();
		
		
		connection =DButil.getDBConnection();
		pst=connection.prepareStatement("Select * from employee where EmpId=? ");
		pst.setInt(1, EmpId);
		pst.executeQuery();
		System.out.println("selected sucessfully");
}
	
	public void DeleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		int EmpId=bean.getEmpId();
		
		
		
		connection =DButil.getDBConnection();
		pst=connection.prepareStatement("delete employee where empid=?");
		pst.setInt(3, EmpId);
		pst.executeUpdate();
		System.out.println("Deleted sucessfully");
}
}


