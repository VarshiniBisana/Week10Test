package employeeDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NamesInDept {
public static void main(String[] args) {
	List<Employee> employeeList = new ArrayList<Employee>();
employeeList.stream().map(n->n.getName()).collect(Collectors.toList());
System.out.println("Employee department");

}
}
