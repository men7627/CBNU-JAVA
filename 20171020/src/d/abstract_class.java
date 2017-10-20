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
		System.out.println("테란의 공격");
	}
}
class Zerg extends Starcraft
{
	@Override
	public void attack()
	{
		System.out.println("저그의 공격");
	}
}
class Protoss extends Starcraft
{
	@Override
	public void attack()
	{
		System.out.println("프로토스의 공격");
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
