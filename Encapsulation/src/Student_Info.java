
		public class Student_Info
		{
		private int StudentId;
		private String StudntName;
		private int StudentContact;
		private String StudentAddress;		
		/**
		 * @return the studentId
		 */
		public int getStudentId()
		{
			return StudentId;
		}

		/**
		 * @param studentId the studentId to set
		 */
		public void setStudentId(int studentId) 
		{
			StudentId = studentId;
		}
		/**
		 * @return the studntName
		 */
		public String getStudntName()
		{
			return StudntName;
		}
		/**
		 * @param studntName the studntName to set
		 */
		public void setStudntName(String studntName)
		{
			StudntName = studntName;
		}
		/**
		 * @return the studentContact
		 */
		public int getStudentContact() 
		{
			return StudentContact;
		}
		/**
		 * @param studentContact the studentContact to set
		 */
		public void setStudentContact(int studentContact) 
		{
			StudentContact = studentContact;
		}
		/**
		 * @return the studentAddress
		 */
		public String getStudentAddress()
		{
			return StudentAddress;
		}
		/**
		 * @param studentAddress the studentAddress to set
		 */
		public void setStudentAddress(String studentAddress)
		{
			StudentAddress = studentAddress;
		}
		public static void main(String[] args)
			{
			Student_Info obj=new Student_Info();
			obj.setStudentId(1);
			obj.setStudntName("Thor");
			obj.setStudentContact(987654321);
		    obj.setStudentAddress("Sky");
		    System.out.println("Student Id:"+obj.getStudentId());
			System.out.println("Student name:"+obj.getStudntName());
			System.out.println("Student contact:"+obj.getStudentContact());
			System.out.println("Student address:"+obj.getStudentAddress());
		    obj.setStudentId(2);
			obj.setStudntName("Jack Sparrow");
			obj.setStudentContact(998866775);
		    obj.setStudentAddress("Ocean");
		    System.out.println("Student Id:"+obj.getStudentId());
		    System.out.println("Student name:"+obj.getStudntName());
		    System.out.println("Student contact:"+obj.getStudentContact());
		    System.out.println("Student address:"+obj.getStudentAddress());
			}
		}











