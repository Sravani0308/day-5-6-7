package day5;




public class StaticDemo2 {
	int id;
	String Name;
	static String Companyname="fujitsu";
	void display()
	{
		System.out.println("id "+id);
		System.out.println("Name "+Name);
		System.out.println("company name " +Companyname);
	} 
	public static void main(String[] args) {
		StaticDemo2 s1=new StaticDemo2();
		s1.id=1;
		s1.Name="rahul";
		StaticDemo2 s2=new StaticDemo2();
		s2.id=2;
		s2.Name="jaya";
		StaticDemo2 s3=new StaticDemo2();
		s3.id=3;
		s3.Name="priya";
		s3.Companyname="tcs";
		s1.display();
		s2.display();
		s3.display();
		}

}
