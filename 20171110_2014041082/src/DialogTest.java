import java.awt.Dialog;
import java.awt.Frame;

class ModelessDialog extends Frame
{
	static final long serialVersionUID = 1;
	public ModelessDialog()
	{
		super("���̾�α� �׽�Ʈ");
		Dialog d = new Dialog(this, "������� ���̾�α�");
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
