//: PipeIODemo.java

//package g3ds.joop.ch7;

import java.io.*;

public class PipeIODemo{
	public static void main(String[] args) throws IOException{
		//����һ���ܵ����������
		PipedWriter out=new PipedWriter();
		
		//����һ���ܵ�����������
		PipedReader in=new PipedReader();
		//�ѹܵ�����������͹ܵ������������������
		in.connect(out);
		
		//����2������Ч��
		//PipedReader in=new PipedReader(out);
		
		TextGenerator data=new TextGenerator(out);
		data.start();
		
		int ch;
		while((ch=in.read())!=-1)
			System.out.print((char)ch);
		System.out.println();
	}
}


//����һ���߳���
class TextGenerator extends Thread{
	private Writer out;
	
	TextGenerator(Writer out){
		this.out=out;
	}
	
	public void run(){
		try{
			try{
				for(char c='A'; c<='Z'; c++)
					out.write(c);
			}finally{
				out.close();
			}
		}catch(IOException e){
			getThreadGroup().uncaughtException(this, e);
		}
	}
}