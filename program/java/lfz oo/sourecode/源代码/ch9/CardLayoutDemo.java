//: CardLayoutDemo

//package g3ds.joop.ch9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo extends JFrame implements ActionListener{
	private String[] name = {
		"���Թ�����", 
		"Ӧ֪������", 
		"����粴�ǰ", 
		"��÷����δ"
	};   
	private JLabel[] card = new JLabel[name.length];
	private JButton previous=new JButton("��һ��");
	private JButton next=new JButton("��һ��");
	
	private CardLayout cardLayout;
	private JPanel cp, sp;
	private Container c;
	
	public CardLayoutDemo(){
		super("CardLayoutDemo");
		
		c = getContentPane();
		
		//��һ�������Ĳ��ֹ�����ΪCardLayout
		cardLayout=new CardLayout();
		cp=new JPanel();
		cp.setLayout(cardLayout);
		
		//������������
		for (int i=0; i<name.length; i++){
			card[i] = new JLabel(name[i], JLabel.CENTER);
			card[i].setFont(new Font("����", Font.PLAIN, 28));
			//��Ϊ��ӵ��������
			cp.add(card[i], name[i]);
		}
		
		//��ʾָ�������
		cardLayout.show(cp, "��÷����δ");
		
		//�����һ����������Ƭ���ֵ��ƶ�����
		sp=new JPanel();
		sp.add(previous);
		sp.add(next);
		
		//������2������������뵱ǰʵ�����������
		c.add(cp, BorderLayout.CENTER);
		c.add(sp, BorderLayout.SOUTH);
		
		//��Ȩ����
		previous.addActionListener(this);
		next.addActionListener(this);
	}
	
	//����������Ӧ
	public void actionPerformed(ActionEvent e){
		String command=e.getActionCommand();
		
		/*��Ƭ�ƶ��Ĳ���*/
		if (command.equals("��һ��"))
			cardLayout.previous(cp);
		else if (command.equals("��һ��"))
			cardLayout.next(cp);
	}
	
	public static void main(String[] args) {
        CardLayoutDemo frame = new CardLayoutDemo();
        
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}