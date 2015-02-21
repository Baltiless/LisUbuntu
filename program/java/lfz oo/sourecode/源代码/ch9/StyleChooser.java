//: StyleChooser.java

//package g3ds.joop.ch9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleChooser extends JFrame{
	public StyleChooser(){
		super("StyleChooserDemo");
		Container contentPane = getContentPane();
		
		contentPane.add(new ControlPanel(), BorderLayout.NORTH);
		contentPane.add(new ComponentPanel(), BorderLayout.SOUTH);
	}
	
	
	class ComponentPanel extends JPanel {
		ComponentPanel() {
			//�����߿�����ӱ���
			setBorder(
				BorderFactory.createTitledBorder("Components Show"));
			
			//��һЩ������������
			add(new JCheckBox("Checkbox", true));
			add(new JRadioButton("RadioButton"));
			add(new JButton("Button"));
			add(new JLabel("Label:"));
			add(new JTextField("TextField"));
		}
	}
	
	
	class ControlPanel extends JPanel {
		//��ӵ�ѡ��ť
		JRadioButton motifButton = new JRadioButton("Motif"),
					 windowsButton = new JRadioButton("Windows"),
					 metalButton = new JRadioButton("Metal", true);

		public ControlPanel() {
			//����һ���¼�����������
			ActionListener listener = new RadioHandler();
			
			//����һ����ť��
			ButtonGroup group = new ButtonGroup();
			group.add(metalButton);
			group.add(windowsButton);
			group.add(motifButton);
			
			//����Ӧ��ѡ��ť�����¼���������
			motifButton.addActionListener(listener);
			windowsButton.addActionListener(listener);
			metalButton.addActionListener(listener);
			
			//�Ѱ�ť�������֮��
			add(metalButton);
			add(windowsButton);
			add(motifButton);
		}
		
		
		//����¼���������
		class RadioHandler implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				JRadioButton src = (JRadioButton)e.getSource();
	
				//�԰�ť״̬���и��٣���Ӧ�Ժ�ı������ʽ����
				try {
					if(src == motifButton)
						UIManager.setLookAndFeel(
							"com.sun.java.swing.plaf." +
							"motif.MotifLookAndFeel");
							
					else if(src == windowsButton)
						UIManager.setLookAndFeel(
							"com.sun.java.swing.plaf." +
							"windows.WindowsLookAndFeel");
					
					else if(src == metalButton)
						UIManager.setLookAndFeel(
						  "javax.swing.plaf.metal." +
						  "MetalLookAndFeel");
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
				//���½���
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		}
	}
	
	//����
	public static void main(String[] args) {
		//�趨���ڷ��true��ʾJava���false��ʾ����ϵͳ���
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		StyleChooser frame = new StyleChooser();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 150);
		frame.setVisible(true);
    }
}