package d;
interface Inter1
{
	public int a = 100; // static final
	void Inter1_method();
}
interface Inter2
{
	int b = 50;
	void Inter2_method();
}
class mulInherit implements Inter1, Inter2
{
	@Override
	public void Inter1_method()
	{
		System.out.println("Inter1�� �޼ҵ�");
	}
	@Override
	public void Inter2_method()
	{
		System.out.println("Inter2�� �޼ҵ�");
	}
}


public class inter_face 
{
	static void main(String[] args)
	{
		mulInherit mh = new mulInherit();
		mh.Inter1_method();
		mh.Inter2_method();
		
		System.out.println("Inter1 �� a : "+mulInherit.a);
		System.out.println("Inter2�� b : "+mulInherit.b);		
	}
	
	
}
