//: RandomIODemo.java

//package g3ds.joop.ch7;

import java.io.*;

public class RandomIODemo{
	public static void main(String[] args) throws IOException{
		//����һ������ļ������Ŷ�дȨ��
		RandomAccessFile rf =
			new RandomAccessFile("rtest.dat", "rw");
		
		//������д8��double����ֵ
		for(int i = 0; i < 8; i++)
			rf.writeDouble(i*3.14);
		//���ر��ļ�
		rf.close();
		
		//ʹ��ʱ���ļ��������Ŷ�дȨ��
		rf = new RandomAccessFile("rtest.dat", "rw");
      	
      	//��λ���ļ���40���ֽ�֮��1��double��ֵռ8���ֽ�
		rf.seek(5*8);
		//���޸�������
		rf.writeDouble(33.333);
		//�ر��ļ�
		rf.close();
		
		//��ֻ����ʽ���ļ�
		rf = new RandomAccessFile("rtest.dat", "r");
		//����ͬ�ĸ�ʽ����ļ�����
		for(int i = 0; i < 8; i++)
			System.out.print(rf.readDouble() + "\t");
		//�ر��ļ�
		rf.close();
	}
}