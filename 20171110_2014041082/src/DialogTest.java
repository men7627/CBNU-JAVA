import java.awt.Dialog;
import java.awt.Frame;

class ModelessDialog extends Frame
{
	static final long serialVersionUID = 1;
	public ModelessDialog()
	{
		super("다이얼로그 테스트");
		Dialog d = new Dialog(this, "모덜리스 다이얼로그");
		setBounds(20,20, 400, 400);
		setVisible(true);
		d.setSize(200,200);
		d.setVisible(true);
	}
}

public class DialogTest {

	public static void main(String[] args) {
		new ModelessDialog();
	}
}
