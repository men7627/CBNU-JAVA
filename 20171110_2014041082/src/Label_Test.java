import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

class LabelTest extends Frame {
	Panel p;
	Label label1, label2, label3;
	public LabelTest(String str) {
		super(str);
		p=new Panel();
		label1=new Label("�̴�",Label.LEFT);
		label2=new Label("����", Label.CENTER);
		label3=new Label("����", Label.RIGHT);
		label1.setBackground(Color.red);
		label2.setBackground(Color.blue);
		label3.setBackground(Color.green);
		p.add(label1); 	p.add(label2); 	p.add(label3);
		add(p);
		setSize(300,300);
		setVisible(true);	
	}
}

public class Label_Test {

	public static void main(String[] args) {
		new LabelTest("���̺� �׽�Ʈ");

	}

}
