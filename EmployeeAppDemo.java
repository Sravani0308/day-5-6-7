package day5;
class Employee
{

int id;
String name;
double salary;
int expeerience;


void displayEmployeeDetails()
{
	System.out.println("id" +id);
	System.out.println("Name"+name);
	System.out.println("salary"+ salary);
	System.out.println("expeerience"+ expeerience);
}
String checkForLoanOption()
{
	if(salary>75000.0)
		return "you can apply for loan";
	return "you can not apply for loan";
}
}

public class EmployeeAppDemo {

	public static void main(String[] args) {
		
Employee ravi= new Employee();
ravi.id=1;
ravi.name="ravi kumar";
ravi.salary=85000.0;
ravi.expeerience=7;
ravi.displayEmployeeDetails();
System.out.println(ravi.checkForLoanOption());


	}

}
