//: Dir.java

//package g3ds.joop.ch7;

import java.io.*;

public class  Dir{
	//�ֱ�������¼��Ŀ¼�ĸ������ļ��ĸ���
	static int intDirCount = 0;
	static int intFileCount = 0;
	
	//������¼�����ļ����ܳ���
	static long totalSize = 0;

	//���õݹ鷽���г�File��������Ŀ¼�У��Ķ���
	public static void recurs(File fl)throws FileNotFoundException{
		String[] fileList=fl.list();
		String filePath=fl.getAbsolutePath();
		
		for(int i=0;i<fileList.length;i++){
			File file=new File(filePath + File.separator + fileList[i]);
			
			//�ж��Ƿ�����ͨ�ļ�
			if ( file.isFile() ){
				System.out.println(file.getName() + "\t");
				intFileCount ++;
				totalSize += file.length();
			}
			//�ж��Ƿ���Ŀ¼
			else {
				System.out.println(file.getName() + " \t<DIR> " );
				intDirCount ++;
				recurs(file);
			}
		}
	}
	
	//����
	public static void main(String[] args) throws FileNotFoundException{
		File flCurrent = new File(".");
		System.out.println("Files in "+flCurrent.getAbsolutePath());
		
		recurs(flCurrent);
		
		System.out.println(intFileCount + " file(s) \t" + totalSize + " bytes");
		System.out.println(intDirCount + " dir(s) ");
	}
}