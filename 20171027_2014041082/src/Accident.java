
public class Accident {

	public static void main(String[] args) {
		try
		{
			int Jumsu = Integer.parseInt(args[0]);
			System.out.println("점수:"+args[0]);
			if(Jumsu>100)
			{
				throw new NumberFormatException("점수가 너무 큼");
			}
		}
		catch(Exception e)
		{
			System.out.println("===========================");
			System.out.println(e.getMessage()+"예외 발생");
		}

	}

}
