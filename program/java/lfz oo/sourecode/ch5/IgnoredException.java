//: IgnoredException.java

//package g3ds.joop.ch5;

import java.io.*;

public class IgnoredException{
	public static void main(String[] args) throws IOException{
		//����3�����ͱ���������¼����ֵ��������
		int dividend=0;
		int divisor=0;
		int result=0;
		
		//����һ����¼�ַ����Ķ�����������һ�б�׼�����ַ�
		BufferedReader in =new BufferedReader(
        	new InputStreamReader(System.in));
        	    
    	//����һ������ѭ�������ڶ�μ��㣬ֱ�����������ַ�����
    	for(;;){	
    		System.out.print("���������ͱ�����:");
    		dividend=Integer.parseInt(in.readLine());
    	
    		System.out.print("���������ͳ���:");
    		divisor=Integer.parseInt(in.readLine());
			
			result=dividend/divisor;
			System.out.println("�����("+dividend+"/"+divisor+")="+ result);
			
			System.out.print("��������[�ǣ�Y��/��N��]: ");
			
			//����ǿ���˳�ѭ��������
			if(!new String(in.readLine()).trim().equalsIgnoreCase("Y"))
				break;
		}
	}
} 