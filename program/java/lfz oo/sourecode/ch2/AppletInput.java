//: AppletInput.java

//package g3ds.joop.ch2;

import java.awt.Graphics;
import javax.swing.JApplet;

public class AppletInput extends JApplet {
	private String str;
	
	public void init(){
		//��HTML�ļ��д������ֵ
		str=getParameter("input");
	}
	
	public void paint(Graphics g){
    	if(str==null){
    		g.drawString("No Input!",150,50); 
    	}
    	else{
    		g.drawString(str,150,50);
    	}
    }
}