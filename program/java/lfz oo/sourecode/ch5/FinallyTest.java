//: FinallyTest.java

//package g3ds.joop.ch5;

import java.io.*;

public class FinallyTest{
	public static void main(String[] args) throws IOException{
		FinallyTest obj=new FinallyTest();
		
		//���ԣ����ұ�����Դ���е�һ����Ϣ
		boolean isFound=obj.searchFor("FinallyTest.java", 
			"import java.io.*;");
		
		if(isFound)
			System.out.println("���ҵ���");
		else
			System.out.println("δ�ҵ���");
	}
	
	public boolean searchFor(String file, String word) 
		throws IOException{
		FileReader input=null;
		String str=null;
		
		try{
			input=new FileReader(file);
			BufferedReader in=new BufferedReader(input);
			
			//�õ����ʱ����true
			while((str=in.readLine())!=null)
				if(str.equals(word))
					return true;
			
			//���򷵻�false		
			return false;
		}
		//Ҳ���ԶԸ���Ȥ���쳣���д���
		/*catch(FileNotFoundException e){
			//�����쳣��ʾ��Ϣ
			System.out.println("�Ҳ���ָ�����ļ���");
			
			//ͬʱ������������false
			return false;
		}*/
		//���������쳣������finally�Ӿ䶼���ڿ���ת��֮ǰ��ִ��
		finally{
			//����ļ��Դ򿪣��뿪ǰ����ر��ļ�
			if(input!=null)
				input.close();
				
			System.out.println("����ת��֮ǰfinally�Ӿ��ѱ�ִ�У�");
		}
	}
}