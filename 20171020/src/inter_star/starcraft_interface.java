package inter_star;
interface Starcraft_
{
	void attack(String s);
}
class Terran_ implements Starcraft_
{
	public void attack(String s)
	{
		System.out.println(s+"�� ����");
	}
}
class Zerg_ implements Starcraft_
{
	public void attack(String s)
	{
		System.out.println(s+"�� ����");
	}
}
public class starcraft_interface {

	public static void main(String[] args) 
	{
		Starcraft_ obj;
		obj = new Terran_();
		
		obj.attack("����");
		
		obj = new Zerg_();
		obj.attack("�����");
	}

}
