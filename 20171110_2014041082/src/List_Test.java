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
		list.add("�̴�");
		list.add("����");
		list.add("����");
		list.add("����");
		p.add(list);
		add(p);
		this.setSize(800, 800);
		p.setBackground(Color.red);
		setVisible(true);
	}
}

public class List_Test {
	public static void main(String[] args) {
		new ListTest("��Ƽ ���� ����Ʈ");
	}
}
