//: Control.java

//package g3ds.joop.ch3;

import java.io.*; 

/** 
 * A demo for statements
 * @version 1.00, 10/01/03
 * @author	Global 3D Studio
 * @see  Kid
 * @since	Java OOP Ver.1
 */ 
public class Control{
	
	public static void main(String[] args) throws IOException{
		//��������
		int i, j;
		String input;
		boolean isPrint;
		
		//�ɼ�������ֵ�ж��Ƿ��ӡ		
		System.out.print("�Ƿ��ӡ�˷��ھ���\n��ӡ[y]������ӡ[n]��[y]");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		input=in.readLine();
		
		if(input.equals("n"))
			isPrint=false;
		else
			isPrint=true;
			
		//��ӡ�ɷ������ö����ص��ַ���
		System.out.println(showMessage(isPrint));
			
		outer://���ѭ����ʶ
		for(i=0;i<10;i++){
			//����continue����������ѭ��
			if(i==0) continue;
			
			inner://�ڲ�ѭ����ʶ
			for(j=0;j<10;j++){
				//�������ӡ�����ô���ʶbreak����˳����for���
				if(!isPrint) break outer;
				
				//����continue����������ѭ��,���еı�ʶ"inner"����ʡ��
				if(j==0) continue inner;
				
				//��ӡ�˷��ھ�
				if(i==1) System.out.print(i*j +"\t" );
				else {
					//����break����˳��ڲ�for���
					if(j>i) break;
					System.out.print(i*j +"\t" );
				}
			}
			System.out.println();
		}
	}
	
	//return����ʹ��ʾ��
	public static String showMessage(boolean isPrint) {
		if(isPrint)
			return "******************\n�ú�ѧϰ����������\n******************";
		else
			return "******************\n�¹�֪�£��佾����\n******************";
	}
}