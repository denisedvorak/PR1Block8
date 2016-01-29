package org.campus02.emp;

import java.util.ArrayList;

public class DemoEmp {

	public static void main(String[] args) {
		
		EmployeeManager em = new EmployeeManager();
		
		Employee emp1 = new Employee(123, "Max Mustermann", 1000.0, "Engineering");
		em.addEmployee(emp1);
		
		Employee emp2 = new Employee(456, "Susi Sorglos", 2500.0, "Engineering");
		em.addEmployee(emp2);
		
		Employee emp3 = new Employee(789, "Ano Nym", 4900.0, "Management");
		em.addEmployee(emp3);
		
		Employee empByNumber1 = em.findByEmpNumber(123);
		System.out.println("has number 123 -> " + empByNumber1);
		
		Employee empByNumber2 = em.findByEmpNumber(999);
		System.out.println("has number 999 -> " + empByNumber2);
		
		ArrayList<Employee> byDept = em.findByDepartment("Engineering");
		System.out.println("Engineering (" + byDept.size()+") -> "+byDept);
		
		Employee empMaxSalary = em.findByMaxSalary();
		System.out.println("has MAX salary -> " + empMaxSalary);

	}

}
