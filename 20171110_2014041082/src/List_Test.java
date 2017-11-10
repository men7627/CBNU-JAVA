import java.awt.Color;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

class ListTest extends Frame
{
	Panel p;
	List list;
	public ListTest(String str)
	{		
		super(str);
		p=new Panel();
		list=new List(2,true);
		list.add("이대");
		list.add("강남");
		list.add("종로");
		list.add("구로");
		p.add(list);
		add(p);
		this.setSize(800, 800);
		p.setBackground(Color.red);
		setVisible(true);
	}
}

public class List_Test {
	public static void main(String[] args) {
		new ListTest("멀티 선택 리스트");
	}
}
