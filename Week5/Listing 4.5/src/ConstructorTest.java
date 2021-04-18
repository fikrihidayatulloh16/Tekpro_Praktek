package listing45sd47;

import java.util.*;
/**
* This program demonstrates object construction.
* @version 1.01 2004-02-19
* @author Cay Horstmann
*/
public class ConstructorTest 
{
	public static void main(String[] args)
	{
		// fill the staff array with three Employee objects
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		// print out information about all Employee objects
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
					+ e.getSalary());
	}
}
