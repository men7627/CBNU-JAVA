import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

class Checkbox1 extends Frame {
	public Checkbox1(String str){
		super(str);
		Panel p = new Panel();
		Checkbox cbx1=new Checkbox("�̴�",true);
		Checkbox cbx2=new Checkbox("����",true);	
		Checkbox cbx3=new Checkbox("����",true);
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cbx4=new Checkbox("�̴�",group,false);
		Checkbox cbx5=new Checkbox("����",group,true);	
		Checkbox cbx6=new Checkbox("����",group,false);
		p.add(cbx4);
		p.add(cbx5);
		p.add(cbx6);

		add(p);
		setSize(180, 300);
		setVisible(true);
	}
}

public class CheckboxTest {

	public static void main(String[] args) {
		new Checkbox1("üũ �ڽ� �׽�Ʈ");
	}

}
