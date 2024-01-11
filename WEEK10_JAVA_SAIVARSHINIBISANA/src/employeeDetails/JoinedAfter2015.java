package employeeDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Get the names of all employees who have joined after 2015?
public class JoinedAfter2015 {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		
			employeeList.stream().map(n->n.getYearOfJoining()>2015).collect(Collectors.toList()).forEach(System.out::println);
		
	}
}
