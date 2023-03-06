package Company;

public class Employee
{

	private static Long ids = 1l;
	private Long id;
	private String name;
	private String company;

	public Employee(final String name, final String company)
	{
		this.id = ids++;
		this.name = name;
		this.company = company;
	}

	public Long getId()
	{
		return id;
	}

	public String getCompany()
	{
		return company;
	}

	public String getName()
	{
		return name;
	}

	
}
