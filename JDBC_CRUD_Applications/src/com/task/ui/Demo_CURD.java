package com.task.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.task.Service.EmployeeServiceImpl;
import com.task.bean.EmployeeBean;

public class Demo_CURD {
	
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("select your option");
		System.out.println("1. insert employee data");//create
		System.out.println("2. update employee data");//update
		System.out.println("3  select employee data");//read
		System.out.println("4  delete employee data");//delete
		int option=sc.nextInt();
		switch(option) {
		case 1:
		{
			insertEmployee();
			break;
		}
		case 2:
		{
			UpdateEmployee();
			break;
		}
		case 3:
		{
			selectEmployee();
			break;
		}
		case 4:
		{
			DeleteEmployee();
			break;
		}
		default:
		{
		System.out.println("your entered option is not matched");	
		}
		}
		
	}
	
	private static void DeleteEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
				EmployeeServiceImpl service=new EmployeeServiceImpl();
				EmployeeBean bean=new EmployeeBean();
				
				bean.setEmpId(1);
				service.SelectEmployee(bean);
		}
	

	private static void selectEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
			EmployeeServiceImpl service=new EmployeeServiceImpl();
			EmployeeBean bean=new EmployeeBean();
			
			bean.setEmpId(1);
			service.SelectEmployee(bean);
	}

	

	private static void UpdateEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		
		bean.setEmpId(1);
		
		bean.setEmpName("h");
		
		bean.setEmpAddress("h");
		service.UpdateEmployee(bean);
	}

	private static void insertEmployee() throws ClassNotFoundException, SQLException {	
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		
		bean.setEmpId(1);
		
		bean.setEmpName("happy");
		
		bean.setEmpAddress("hyd");
		service.insertEmployee(bean);


}}
