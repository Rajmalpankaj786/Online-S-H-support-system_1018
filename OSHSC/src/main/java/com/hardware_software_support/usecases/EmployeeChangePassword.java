package com.hardware_software_support.usecases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hardware_software_support.DAO.EmployeeDao;
import com.hardware_software_support.DAO.EmployeeDaoImpl;
import com.hardware_software_support.exceptions.EmployeeException;

public class EmployeeChangePassword {

	public void employeeChangePassword() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username");
		String username = sc.next();
		System.out.println("Enter your old password");
		String oldPassword = sc.next();
		System.out.println("Enter new password to be set.Password should have 8 to 20 characters without"
				+ "space and should include atleast 1 digit 1 uppercase 1 lowercase letter"
				+ "and a special character.");
		String newPassword = sc.next();
		
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(newPassword);
		
		if(m.matches()) {
			EmployeeDao dao = new EmployeeDaoImpl();
			
			try {
				String res = dao.changeEmployeePassword(username, oldPassword, newPassword);
				System.out.println(res);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("Password should have 8 to 20 characters and must include"
					+ " an uppercase letter, a lowercase letter, a number and a special character"
					+ "without a space.");
		}
		
		
	}
}