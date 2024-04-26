
public class Employee_1 {
 private int EmpId;
 private String EmpName;
 private int EmpContact;
 private String EmpAddress;
 
 
	/**
 * @return the empId
 */
public int getEmpId() {
	return EmpId;
}


/**
 * @param empId the empId to set
 */
public void setEmpId(int empId) {
	EmpId = empId;
}


/**
 * @return the empName
 */
public String getEmpName() {
	return EmpName;
}


/**
 * @param empName the empName to set
 */
public void setEmpName(String empName) {
	EmpName = empName;
}


/**
 * @return the empContact
 */
public int getEmpContact() {
	return EmpContact;
}


/**
 * @param empContact the empContact to set
 */
public void setEmpContact(int empContact) {
	EmpContact = empContact;
}


/**
 * @return the empAddress
 */
public String getEmpAddress() {
	return EmpAddress;
}


/**
 * @param empAddress the empAddress to set
 */
public void setEmpAddress(String empAddress) {
	EmpAddress = empAddress;
}

class EmployeeDetail 
{
 
	{
		// TODO Auto-generated method stub
		Employee_1 obj=new Employee_1();
		obj.setEmpId(1);	
		obj.setEmpName("Jack Sparrow");
		obj.setEmpContact(998877665);
		obj.setEmpAddress("Home");
		
		
		System.out.println("Employee I'd :"+obj.getEmpId());
		System.out.println("Employee Name:"+obj.getEmpName());
		System.out.println("Employee Contact Details:"+obj.getEmpContact());
		System.out.println("Employee Address:"+obj.getEmpAddress());
	}

}
}
