import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

class FlickeringLabel extends Label implements Runnable{
	public FlickeringLabel(String text) {
		super(text);
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		int n=0;
		while(true) { 
			if(n == 0)
				setBackground(Color.YELLOW);
			else if(n==1)
				setBackground(Color.GREEN);
			else if(n==2)
				setBackground(Color.blue);
			else
				setBackground(Color.CYAN);
			if(n == 0) n = 1;
			else if(n == 1)n=2;
			else if(n==2)n=3;
			else n=0;
			try {
				Thread.sleep(500); 
			}
			catch(InterruptedException e) {
				return; 
			}
		}
	}
}
class FlickeringLabelEx extends Frame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx ����");
	
		// �����̴� ���̺� ����
		FlickeringLabel fLabel = new FlickeringLabel("����");
		// �������� �ʴ� ���̺� ����
		Label label = new Label("�ȱ���");
		// �����̴� ���̺� ����
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����");
		FlickeringLabel fLabel3 = new FlickeringLabel("���⵵ ���⵵ ����");
		Panel p = new Panel();
		p.add(fLabel);
		p.add(label);
		p.add(fLabel2);
		p.add(fLabel3);
		add(p);
		setSize(300,150);
		setVisible(true);
	}
}

public class LabelTest2 {

	public static void main(String[] args) {
		new FlickeringLabelEx();

	}

}
