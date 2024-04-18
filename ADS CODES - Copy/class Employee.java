class Employee{

private String name;
private int empid
private float salary;

public Employee(String name, int empid float salary){
this.empid = empid;
this.name=name;
this.salary=salary;
}

public String getName(){
return name;
}
public int getEmpid(){
return empid;
}

public int getSalary(){
return salary;
}

class CompareByName implements Comparator<Employee>
public int compare(Employee emp1, Employee emp2){
return emp1.getEmpid() - emp2.getEmpid();

}
public int compareTo(Employee other){
return emp1.getName().compareTo(emp2.getName());

}
public int compareTo(Employee other){
return (int) (emp1.getSalary - emp2.getSalary);

}




public String toString(){
return String.format("%s%d%f",this.name,this.empid,this.salary);
}


}

public class Program{

private static Employee[] getArray(){

Employee[] arr = new Employee[5];
arr[0] = new Employee("Rupesh",12,4567.0f);
arr[1] = new Employee("Rupesh",12,4565.0f);

arr[2] = new Employee("Rupesh",11,4563.0f);

arr[3] = new Employee("Rupesh",16,4568.0f);

arr[4] = new Employee("Rupesh",18,4569.0f);


}
private static void printRecord(Employee[] arr) {
		if( arr != null ) {
			for (Employee emp : arr) {
				System.out.println( emp.toString());
			}
			System.out.println();
		}




}

