package d;

abstract class Starcraft
{
	abstract void attack();
}
class Terran extends Starcraft
{
	@Override
	public void attack()
	{
		System.out.println("�׶��� ����");
	}
}
class Zerg extends Starcraft
{
	@Override
	public void attack()
	{
		System.out.println("������ ����");
	}
}
class Protoss extends Starcraft
{
	@Override
	public void attack()
	{
		System.out.println("�����佺�� ����");
	}
}
public class abstract_class {

	public static void main(String[] args) 
	{		
		Terran marine = new Terran();
		marine.attack();
		Protoss dragoon = new Protoss();
		dragoon.attack();
		Zerg zergling = new Zerg();
		zergling.attack();
		
		Starcraft star = new Terran();
		star.attack();
		
		star = new Zerg();
		star.attack();
		
		star = new Protoss();
		star.attack();
				
	}

}
