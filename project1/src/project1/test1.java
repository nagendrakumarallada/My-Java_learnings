package project1;

public class test1 {
	public String name;

	private double salary;

	public test1 (String empName) {
		name = empName;
	}

	public void setSalary(double empSal) {
		salary = empSal;
	}

	public void printEmp() {
		System.out.println("name  : " + name );
		System.out.println("salary :" + salary);
	}

	public static void main(String args[]) {
		test1 empOne = new test1("Ransika");
		empOne.setSalary(1000);
		empOne.printEmp();
	}
}
