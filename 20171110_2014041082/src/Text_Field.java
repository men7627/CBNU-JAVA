import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

class TextField1 extends Frame 
{
	public TextField1(String str)	
	{
		super(str);
		Panel p = new Panel();
		Label lbl1 = new Label(" �� �� ��:");  	
		Label lbl2 = new Label(" ��й�ȣ:");  	
		TextField txt1 = new TextField("ID", 15 );
		TextField txt2 = new TextField(15);
		txt2.setEchoChar('*');
		p.add(lbl1);
		p.add(txt1);
		p.add(lbl2);  
		p.add(txt2);
		add(p);
		setSize(200,200);
		setVisible(true);  	
	}
}

public class Text_Field {

	public static void main(String[] args) {
		new TextField1("TextField �׽�Ʈ");
	}
}
