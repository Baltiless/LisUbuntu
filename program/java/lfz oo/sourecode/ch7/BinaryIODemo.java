//: BinaryIODemo.java

//package g3ds.joop.ch7;

import java.io.*;

public class BinaryIODemo{
	public static void main(String[] args) throws IOException{
		try {
			//��һЩ����д���ļ�Data.txt
			DataOutputStream out =
				new DataOutputStream(
        		new BufferedOutputStream(
        		new FileOutputStream("Data.txt")));
        	
        	/*����ͬ�����ݸ�ʽд��*/
        	out.writeBoolean(true);	
			out.writeDouble(3.1415926);
			//DataOutputStream֧�ְ��ַ���һ�θ�ʽ��д��
			out.writeChars("That was PI\n");
			out.writeBytes("That was PI\n");
			
			//�ر������
			out.close();
			
			//׼�������Ѵ洢���ļ�
			DataInputStream in =
				new DataInputStream(
				new BufferedInputStream(
				new FileInputStream("Data.txt")));
			
			BufferedReader buffer = new BufferedReader(
        		new InputStreamReader(in));
          
			//DataInputStream֧�ֻ������͵ĸ�ʽ������
			System.out.println(in.readBoolean());
			System.out.println(in.readDouble());
			
			//�������ַ���ֻ�ܽ���BufferedReader��readLine���
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
		} catch(EOFException e) {}
	}
}