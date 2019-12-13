public class Address
{
	private String city;
	private String state;
	private int zip;
	private String street;
	
	public address()
	{
	setStreet("");
	setCity("");
	setState("");
	setZip(0);
	}
	
	public Address(String s, String c, String st, int z)
	{
		setStreet(s);
		setCity(c);
		setState(st);
		setZip(z);
	}
	
	public void setStreet(String s)
	{
	street = s;
	}
	
	public void setCity(String c)
	{
	city = c
	}
	
	public void setState(st)
	{
	state = st
	}
	
	public void setZip(z)
	{
	zip = z
	}
	