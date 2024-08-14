package entities;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id,String name,double salary){
		super();
		this.id = id;
		this.name=name;
		this.salary = salary;
	}

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void increaseSalary(double percentage){
		this.salary+=this.salary*percentage/100.0;
	}


	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", salary=" + String.format("%.2f",salary) +
				'}';
	}
}
