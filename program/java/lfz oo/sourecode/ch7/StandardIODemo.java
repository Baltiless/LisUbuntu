//: StandardIODemo.java

//package g3ds.joop.ch7;

import java.io.*;

public class StandardIODemo{
	public static void main(String[] args) throws IOException{
		//�ѱ�׼������ֽ���ת�����ֽ����ĵ������
		BufferedReader stdin = new BufferedReader(
        	new InputStreamReader(System.in));
        
        System.out.print("������һ������:");
		System.out.println("�������������:" + stdin.readLine());
	}
}