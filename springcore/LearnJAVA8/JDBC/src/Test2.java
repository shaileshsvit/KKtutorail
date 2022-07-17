import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import dao.EmployeeDAO;
import dao.impl.EmployeeDAOImpl;
import model.Employee;

public class Test2 {
//public static void main(String[] args) {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		Employee employee = getEmployee();
		//employeeDAO.createEmployee(employee);
		//getEmployeeById(employeeDAO);
		employeeDAO.updateEmployeeEmailById("sam.cs2014@gmail.com", 4);
		//employeeDAO.deleteEmployeeById(6);
		//getAllEmployeesInfo(employeeDAO);
	}
	private static void getEmployeeById(EmployeeDAO employeeDAO) {
		Employee employee2 = employeeDAO.getEmployeeById(4);
		if(employee2 != null){
			System.out.println(employee2);
		}else{
			System.out.println("Employee does not exist..");
		}
	}
	
	private static void getAllEmployeesInfo(EmployeeDAO employeeDAO) {
		List<Employee> empList = employeeDAO.getAllEmployeesInfo();
		empList.forEach(System.out::println);
	}

	private static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setBonus(new BigDecimal(290));
		employee.setDoj(new Date());
		employee.setEmployeeName("John");
		employee.setEmail("jonh.cs2016@yahoo.com");
		employee.setSalary(90000.00);
		return employee;
	}

}
