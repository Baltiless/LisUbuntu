//: ValueScope.java

//package g3ds.joop.ch3;

public class ValueScope{
	public static void main(String[] args){
		//��������
		byte b;
		char c;
		short s;
		int i;
		long l;
		float f;
		double d;
		
		/*
		// ֱ�Ӹ�ֵԽ�����Σ�����ʱ������
		// �������н�����error: possible loss of precision
		b=130;//����ȡ-130
		c=70000;//����ȡ-70000
		s=40000;//����ȡ-40000
		
		// �������н�����error: integer number too large
		i=3000000000;//����ȡ-3000000000
		l=9223372036854775809L;//����ȡ-9223372036854775809L
		
		// �������н�����error: floating point number too large
		f=4.0e50f;//����ȡ-4.0e50f
		d=2.0e325;//����ȡ-2.0e325
		
		// �������н�����error: floating point number too small
		f=4.0e50f;//����ȡ-4.0e50f
		d=2.0e325;//����ȡ-2.0e325
		*/
		
		int factor=2;//��Ϊʹ��������ֵ���Խ�������
		String str="factor=2\n";//�洢��Ҫ��ӡ�Ľ��
			
		//��������ȥ��������֣�Ȼ��ʣ�²��ּ�Ϊ����
		//����ע���е���ֵ����ʮ�����Ʋ�����ʽ�Ļ�����
		b=(byte)(-0xf0*factor);//���Ϊ��0XE0
		str+="(byte)(-0xf0*factor)="+b+"\n";
		
		c=(char)(0xf000*factor);//���Ϊ��0XE000
		str+="(char)(0xf000*factor==\'\\uE000\')="+(c=='\uE000')+"\n";
		
		s=(short)(0xf000*factor);//���Ϊ��0XE000
		str+="(short)(0xf000*factor)="+s+"\n";
		
		i=0xf0000000*factor;//���Ϊ��0XE0000000
		str+="0xf0000000*factor="+i+"\n";
		
		l=0xf000000000000000L*factor;//���Ϊ��0XE000000000000000
		str+="0xf000000000000000L*factor="+l+"\n";
				
		
		//�����Ͷ������е���ֵ���ɽ��д���
		f=-3.0e38f*factor;//���Ϊ��-Infinity
		str+="-3.0e38f*factor="+f+"\n";
		
		f=-1.0e-45f/factor;//���Ϊ��-0.0
		str+="-1.0e-45f/factor="+f+"\n";
				
		d=4.9e-324/factor;//���Ϊ��0.0
		str+="4.9e-324*factor="+d+"\n";
				
		d=1.7e308*factor;//���Ϊ��Infinity
		str+="1.7e308*factor="+d+"\n";
			
		f=-1.0e-45f/0;//���Ϊ��-Infinity
		str+="-1.0e-45f/0="+f+"\n";
		
		d=4.9e-324/0;//���Ϊ��Infinity
		str+="4.9e-324/0="+d+"\n";
		
		System.out.print(str);
		
		
		//����˵����������佫�����쳣
		try{
			//�������ֵ���������ۡ�=����ߵı���Ϊ�������ͣ�
			//������������ʱ����ֵ0��Ϊ������������������0���㽫�����쳣
			d=50/0;
		}catch(ArithmeticException e){
			System.out.println("������������50/0�����쳣��"+e.toString());
		}
		
	}
}