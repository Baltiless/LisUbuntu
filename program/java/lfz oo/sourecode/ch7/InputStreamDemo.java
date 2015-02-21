//: InputStreamDemo.java

//package g3ds.joop.ch7;

import java.io.*;

public class InputStreamDemo{
	public static void main(String[] args) throws IOException{
		InputStream in;
		
		if(args.length==0){
			System.out.println("�÷���\t\"java InputStreamDemo S\" ��ʾ��׼������"+ 
				"\n\t\"java InputStreamDemo F\" ��ʾ�ļ�������");
			return;
		}
		
		if(args[0].equalsIgnoreCase("S"))
			//��ȡ��׼������
			in=System.in;
		else if(args[0].equalsIgnoreCase("F"))
			//��ȡ�ļ�������
			in=new FileInputStream("InputStreamDemo.java");
		else
			return;
			
		int total=0;
		int b=0;
		while((b=in.read())!=-1){
			total++;
			System.out.print((char)b);
			
			//��Ϊ������������־����Щƽ̨��Ctrl+CҲ����ִ��������
			if((char)b=='@')
				break;
		}
		
		System.out.println();
		System.out.println(total+"bytes");
	}
}