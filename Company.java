package learning.encapsiulation;

class Employee {
	 private int Emp_id;
	 public void setEmp_id(int eid ){
		 Emp_id=eid;
	 }
	 public int getEmp_id() {
		 return Emp_id;
		 
	 }
}
 public class Company{
	 public static void main(String[] args) {
		 Employee e =new Employee();
		 e.setEmp_id(142);
		 System.out.println(e.getEmp_id());
		
	}
	 
 }
	






