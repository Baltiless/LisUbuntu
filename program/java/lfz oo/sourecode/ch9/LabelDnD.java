//: LabelDnD.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class LabelDnD extends JPanel {
	JTextField textField;
	JLabel label;

	public LabelDnD() {
		super(new GridLayout(2, 1));
		textField = new JTextField(40);
		
		//����textField֧���Ϸ�
		textField.setDragEnabled(true);
		JPanel tfpanel = new JPanel(new GridLayout(1,1));
		TitledBorder t1 = BorderFactory.createTitledBorder(
			"JTextField: drag and drop is enabled");
		tfpanel.add(textField);
		tfpanel.setBorder(t1);

		label = new JLabel("I'm a Label!", SwingConstants.LEADING);
		label.setTransferHandler(new TransferHandler("text"));

		MouseListener listener = new DragMouseAdapter();
		
		//����label֧���Ϸ�
		label.addMouseListener(listener);
		JPanel lpanel = new JPanel(new GridLayout(1,1));
		TitledBorder t2 = BorderFactory.createTitledBorder(
			"JLabel: drag from or drop to this label");
		lpanel.add(label);
		lpanel.setBorder(t2);

		add(tfpanel);
		add(lpanel);
		setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	}

	private class DragMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			JComponent c = (JComponent)e.getSource();
			TransferHandler handler = c.getTransferHandler();
			handler.exportAsDrag(c, e, TransferHandler.COPY);
		}
	}

    private static void createAndShowGUI() {
		//��ʾJava���Ĵ���װ��
		JFrame.setDefaultLookAndFeelDecorated(true);

		//����һ��JFrame����
		JFrame frame = new JFrame("LabelDnD");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//������չJPanel���LabelDnD����
		JComponent newContentPane = new LabelDnD();
		//�����������ǲ�͸����
		newContentPane.setOpaque(true); 
		//�����ŵ�JFrame��������������
		frame.setContentPane(newContentPane);

		//��ʾ����
		frame.pack();
		frame.setVisible(true);
	}
	
	//����
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
    }
}