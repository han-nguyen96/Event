class Ntn456_Event implements Ntn456_Sellable
{
	private String Name;
	private int Days;
	private int pricePerDay;

	public void setName(String n)
	{
		this.Name=n;
	}

	public void setDays(int D)
	{
		this.Days=D;
	}

	public void setPPD(int ppd)
	{
		this.pricePerDay=ppd;
	}

	Ntn456_Event(String name, int days, int priceperday)
	{
		setName(name);
		setDays(days);
		setPPD(priceperday);
	}

	public int getPrice()
	{
		int price = Days*pricePerDay;
		return price;
	}

	public String getName()
	{
		return this.Name;
	}
}