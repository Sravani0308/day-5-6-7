package day6;
class Parent
{
	int a=10;
	
}
class Child extends Parent
{
	int b=20;
	void addition()
	{
		int result1=b+super.a;
		System.out.println("result1"+result1);
	}
	
}

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		c.addition();
		}

}
 