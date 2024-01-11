package employeeDetails;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//3. Get the youngest employee details each department wise (By Using Optional)?
public class YoungestEmployee {
public static void main(String[] args) {
	List<Employee> employeeList = new ArrayList<Employee>();
	Optional.employeeList.stream().filter(n->n.getAge()).min().forEach(System.out::println);
}
}
