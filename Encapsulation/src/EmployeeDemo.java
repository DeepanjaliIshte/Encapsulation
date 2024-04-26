
public class EmployeeDemo {

	private int empId;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}


	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}


	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	/**
	 * @return the empAge
	 */
	public String getEmpAge() {
		return empAge;
	}


	/**
	 * @param empAge the empAge to set
	 */
	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}


	private String empName;
	private String empAge;
}

 class Employee{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDemo obj=new EmployeeDemo ();
		
		obj.setEmpId(11);
		obj.setEmpName("Deepanjali");
		obj.setEmpAge("24");
		
		System.out.println("Employee ID:"+obj.getEmpId());
		System.out.println("Employee name:"+ obj.getEmpName());
		System.out.println("Empoyee Age:"+obj.getEmpAge() );
	
	}

}
