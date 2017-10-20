class Employee
{
	private String empNo;
	private String name;
	private String part;
	
	public Employee()
	{
		
	}
	
	public Employee(String empNo, String name, String part)
	{
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	
	public String getEmpNo()
	{
		return this.empNo;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getPart()
	{
		return this.part;
	}
	
	public void setEmpNo(String empNo)
	{
		this.empNo = empNo;
	}
	public void setPart(String part)
	{
		this.part = part;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String resultStr()
	{
		String result = "";
		result += "���: " + this.empNo + "\n";
		result += "�̸�: " + this.name + "\n";
		result += "�μ�: " + this.part + "\n";
		return result;
	}
}
