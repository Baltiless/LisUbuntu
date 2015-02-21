//Copy.java

//package g3ds.joop.ch7;

import java.io.*;

public class  Copy{
	public static void main(String[] args){
		if ( args.length < 2 ){
			System.out.println("�÷�: Copy [Դ�ļ���] [Ŀ���ļ���] .");
		}
		else{
			File fSource = new File(args[0]);
			boolean isOK = true ;
			
			// �ж�Դ�ļ��Ƿ����
			if (!fSource.exists()){
				System.out.println("Source File "+args[0]+" is not a exist!");
				isOK = false ;
			}
			
			// �ж�Դ�ļ��Ƿ����ļ�,������Ŀ¼
			if (isOK && !fSource.isFile()){
				System.out.println("Source File "+args[0]+" is not a file!");
			}
			
            // �ж�Դ�ļ��Ƿ�ɶ�
			if (isOK && !fSource.canRead()){
				System.out.println("Can not read "+"Source File "+args[0]+"!");
			}
			
			File fDestination = new File(args[1]);
			try{
				// �ж�Ŀ���ļ��Ƿ����,��������Ƿ񸲸�
				if (isOK && fDestination.exists()){
					System.out.println("Destination File "+args[1]+" is already  exist!");
					System.out.print("Overwrite ? [y/n] ");
					
					int ch = System.in.read();
					if ( ch == 'n' || ch == 'N'){
						isOK = false ;
					}
				}
				
				// ���һ������,��ô���ļ����и���
				if ( isOK ){
					FileInputStream fisSource = new FileInputStream(args[0]);
					FileOutputStream fosDestination = new FileOutputStream (args[1]);
					
					System.out.println("Copy file from "+args[0]+" to "+args[1]+"...");
					
					while (fisSource.available() > 0){
						int temp = fisSource.read ();
						fosDestination.write (temp);
					}
					
					fisSource.close();
					fosDestination.close();
					
					System.out.println("File Copyed Successfully!");
				}
			}catch (IOException e){}
		}	
	}
}