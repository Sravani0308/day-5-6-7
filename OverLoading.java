package day6;


class Bank
{
	void rateOfInterest()
	{
		System.out.println("4%");
	}
}
class Axis extends Bank
{
	void rateofInterest()
	{
	System.out.println("6%");
	}
}
class Kotak extends Bank
{
	void rateofInterest()
	{
	System.out.println("8%");
	}
}

public class OverLoading {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		Bank Axis = new Axis();
		Bank kotak = new Kotak();
		
	}

}
