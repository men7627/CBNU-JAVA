package inter_star;
interface Starcraft_
{
	void attack(String s);
}
class Terran_ implements Starcraft_
{
	public void attack(String s)
	{
		System.out.println(s+"의 공격");
	}
}
class Zerg_ implements Starcraft_
{
	public void attack(String s)
	{
		System.out.println(s+"의 공격");
	}
}
public class starcraft_interface {

	public static void main(String[] args) 
	{
		Starcraft_ obj;
		obj = new Terran_();
		
		obj.attack("마린");
		
		obj = new Zerg_();
		obj.attack("히드라");
	}

}
