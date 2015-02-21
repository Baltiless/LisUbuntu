//: ExceptionSolution.java

//package g3ds.joop.ch5;

import java.io.*;

public class ExceptionSolution{
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
    		try {
    			//����Ϊ�ܱ������룬�ڽ������̿��������쳣
    			System.out.print("���������ͱ�����:");
    			dividend=Integer.parseInt(in.readLine());
    	
    			System.out.print("���������ͳ���:");
    			divisor=Integer.parseInt(in.readLine());
			
				result=dividend/divisor;
				System.out.println("�����("+dividend+"/"+divisor+")="+ result);
			} 
			//�Գ���Ϊ0������ArithmeticException�쳣���л�Ӧ
			catch(ArithmeticException e) {
				//�����쳣ʱ�����������ġ���ֱ���˵�����ʾ
				System.out.println("�Բ��������������󣺳���Ϊ0");
				
				//Ҳ����ֱ��������쳣�йص���Ϣ�������û���˵��Щ���ݹ��ڳ���
				//e.printStackTrace(System.err);
			} 
			//������ת������������NumberFormatException�쳣���л�Ӧ
			catch(NumberFormatException e){
				//�����쳣ʱ�����������ġ���ֱ���˵�����ʾ
				System.out.println("�Բ��������������󣺳����򱻳�������������");
				
				/*
				//Ҳ����ֱ��������쳣�йص���Ϣ�������û���˵��Щ���ݹ��ڳ���
				//ֱ�������������ϵ��쳣��Ϣ
				System.out.println("����printStackTrace����ֱ�������ջ��Ϣ��");
				e.printStackTrace(System.err);
				
				//��������getStackTrace����������Щ��ջ��Ϣ������ʱ���Եõ��������Ϣ
				System.out.println("����getStackTrace�������ض�ջ��Ϣ��");
				StackTraceElement ste[] = e.getStackTrace();
				for(int i=0; i<ste.length; i++){
					System.out.println("�쳣������ "+ ste[i].getClassName() +" ��� "+
						ste[i].getMethodName()+" ����");
					System.out.println("�� "+ste[i].getFileName()+" �ļ��е�"+
						"�� "+ste[i].getLineNumber()+" ��");
				}
				System.out.println("����ԭ�� "+e.getMessage());
				*/
			} 
			//�Է���һ���Կ������������벻�����쳣���л�Ӧ
			catch(Exception e){
				//�����쳣ʱ�����������ġ���ֱ���˵�����ʾ
				System.out.println("�Բ��𣡲������ֹ��ϣ�����������");
				
				//Ҳ����ֱ��������쳣�йص���Ϣ�������û���˵��Щ���ݹ��ڳ���
				//e.printStackTrace(System.err);
			}

			System.out.print("��������[�ǣ�Y��/��N��]: ");
			
			//����ǿ���˳�ѭ��������
			if(!new String(in.readLine()).trim().equalsIgnoreCase("Y"))
				break;
		}
	}
} 