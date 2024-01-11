package employeeDetails;

import java.util.ArrayList;
import java.util.List;

//How many male and female employees are there in the organization?
public class GenderCount {
public static void main(String[] args) {
	
	List<Employee> employeeList = new ArrayList<Employee>();
	long countOfEmployee=
	employeeList.stream().map(n->n.getGender()).count();
	System.out.println(countOfEmployee);
	
}
}
 