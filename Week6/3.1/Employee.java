package employee;

class Employee {
	public Employee(String n, double s, int day, int month, int year){ 
		 name = n;
		 salary = s;
		 hireday = day;
		 hiremonth = month;
		 hireyear = year;
		}
		public void print(){ 
		 System.out.println(name + " " + salary + " " + hireYear());
		}
		public void raiseSalary(double byPercent){ 
		 salary *= 1 + byPercent / 100;
		}
		public int hireYear(){ 
		return hireyear;
		}
		private String name;
		private double salary;
		public int hireday;
		public int hiremonth;
		private int hireyear;
}