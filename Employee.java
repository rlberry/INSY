public class Employee
{
	private String name;
	private Date dateHired;
	private Date dateReleased;
	private Address address;
	
	public Employee()
	{
		setName("");
		setDateHired(new Date());
		setDateReleased(new Date());
		setAddress(new Address());
	}
	
	public Employee(String n, Date d)
	{
		setName(n);
		setDateHired(d);
		setDateReleased(r);
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setDateHired(Date d)
	{
		dateHired = d;
	}
	
	public void setDateReleased(Date r)
	{
		dateReleased = r;
	}
		
	public String getName()
	{
		return name;
	}
	
	public Date getdateHired()
	{
		return dateHired();
	}
	
	public Date getdateReleased()
	{
		return dateReleased();
	}
	
	public String toString()
	{
		return ("Name " + name + "DateHired " + dateHired.toString() + "Date Released " + dateReleased.toString());
	}	
	
}