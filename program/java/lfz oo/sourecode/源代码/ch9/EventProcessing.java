//: EventProcessing.java

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventProcessing extends JFrame implements ActionListener{
	private JTextArea textSource, textDestination;
	private JButton btCopy, btCut, btEnter;
	private KeyPress keyPress;
	
	public EventProcessing(){
		super("EventProcessing");
		
		//����һ��ʵ��KeyListener�ӿڵ�ʵ��
		keyPress=new KeyPress();
		
		Container pane=getContentPane();
		
		pane.add(getHeader(), BorderLayout.NORTH);
		pane.add(getTextArea(), BorderLayout.CENTER);
		pane.add(getButtonPanel(), BorderLayout.SOUTH);
	}
		
	protected JComponent getHeader(){
		JLabel label =new JLabel("�¼�������ʾ", JLabel.CENTER);
		label.setFont(new Font("����", Font.PLAIN, 20));
		return label;
	}
	
	protected JComponent getTextArea(){
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(2,1,0,10));
		
		textSource=new JTextArea(10,10);
		JScrollPane scrollPane=new JScrollPane(textSource);
		panel.add(scrollPane);
		
		textDestination=new JTextArea(10,10);
		scrollPane=new JScrollPane(textDestination);
		panel.add(scrollPane);
		return panel;
	}
	
	protected JComponent getButtonPanel(){
		JPanel inner=new JPanel();
		inner.setLayout(new GridLayout(1,2,10,0));
		
		btCopy=new JButton("Copy");
		//���������ڲ��������ʽ
		btCopy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textDestination.setText(textSource.getText());
			}
		});
		inner.add(btCopy);
		
		btCut=new JButton("Cut");
		//���������ڲ��������ʽ
		btCut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textDestination.setText(textSource.getText());
				textSource.setText("");
			}
		});
		inner.add(btCut);
		
		btEnter=new JButton("UsingEnter");
		//�������Ҽ�����ʽ
		btEnter.addActionListener(this);
		inner.add(btEnter);
		
		JPanel outer=new JPanel();
		outer.setLayout(new FlowLayout());
		outer.add(inner);
		
		return outer;
	}
	
	//�ڲ��������ʽ������������ʵ��
	protected class KeyPress extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
				textDestination.setText(textSource.getText());
		}
	}
	
	//����������Ķ�����Ӧ
	public void actionPerformed(ActionEvent e){	
		if(e.getActionCommand()=="UsingEnter"){
			//textSourceע��KeyListener
			textSource.addKeyListener(keyPress);
			btCopy.setEnabled(false);
			btCut.setEnabled(false);
			btEnter.setText("UsingCopy/Cut");
		}
		else if(e.getActionCommand()=="UsingCopy/Cut"){
			//textSourceȡ��ע��KeyListener
			textSource.removeKeyListener(keyPress);
			btCopy.setEnabled(true);
			btCut.setEnabled(true);
			btEnter.setText("UsingEnter");
		}
	}
	
	public static void main(String[] args){
		EventProcessing app =new EventProcessing();
		
		//�Ѵ�����ʾ����Ļ�м�Ĵ������
		int width = 400;
		int height = 300;
		Toolkit kit=app.getToolkit();
		Dimension wnd=kit.getScreenSize();
		app.setBounds((wnd.width - width)/2, (wnd.height - height)/2, 
						width, height); 
		
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}