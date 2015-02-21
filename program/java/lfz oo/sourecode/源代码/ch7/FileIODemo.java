//: FileIODemo.java

//package g3ds.joop.ch7;

import java.io.*;

public class FileIODemo{
	private String strTemp;
	private String  strFinal=new String();
	
	//����
	public static void main(String[] args) throws IOException{
		FileIODemo obj = new FileIODemo();
		
		//��һ���ļ�FileIODemo.java
		obj.open("FileIODemo.java");
		//�������ΪFileIODemo.txt���������к�
		obj.saveAs("FileIODemo.txt");
	}
	
	public void open(String fileName){
		try{
			//���ļ����ݶ��뻺��
			BufferedReader in = new BufferedReader(
				new FileReader(fileName));
		
			while((strTemp = in.readLine())!= null)
				strFinal += strTemp + "\n";
			
			//�ر��ļ�
			in.close();
		}catch(IOException e){}
	}
	
	public void saveAs(String fileName){
		try {
      		//���뻺�����ļ�������
      		BufferedReader in = new BufferedReader(
				new StringReader(strFinal));
			
			//����д�����ļ���
			PrintWriter out = new PrintWriter(
				new BufferedWriter(new FileWriter(fileName)));
            
            //д����
			int lineCount = 1;
			while((strTemp = in.readLine()) != null )
				out.println(lineCount++ + ": " + strTemp);
			
			//�ر��ļ�
			in.close();	
			out.close();
		} catch(IOException e) {}
	}
}