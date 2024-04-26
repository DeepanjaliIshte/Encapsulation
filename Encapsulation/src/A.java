 class A
{
private int aValue;

/**
 * @return the aValue
 */
public int getaValue() {
	return aValue;
}

/**
 * @param aValue the aValue to set
 */
public void setaValue(int aValue) {
	this.aValue = aValue;
} //data hiding
}
class B
{
public static void main (String[] args)
{
 A obj= new A();
  obj.setaValue(91464353);
  
  System.out.println("A value is:"+obj.getaValue());
}

}




