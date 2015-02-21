//: PrimitiveNarrowing.java

//package g3ds.joop.ch3;

class PrimitiveNarrowing {
	public static void main(String[] args) {
		//������ֵȱʡΪint
		//����byte, char, short, ��ȡֵ��Χ�е���ֵ���Զ�ת��������д��ת������
		byte b=65;//�൱��b=(byte)65
		char c=65;//�൱��c=(char)65
		short s=65;//�൱��s=(short)65
		
		//��������ȡֵ��Χ����ֵ����Ҫд��ǿ��ת�����ͣ��������
		//int->short��λ����ʧ:
		System.out.println("(short)0x12345678==0x" +
			Integer.toHexString((short)0x12345678));
			
		//int->byte���ź���ֵ���п��ܸı�:
		System.out.println("(byte)255==" + (byte)255);//0xff(����)=-1
				
		//int->char��ȡֵ��Χ֮��Ҫǿ��ת��
		int i =35000+333*65536; //=0x14d88b8
		System.out.print("int->char:i=0x" + Integer.toHexString(i));
		c= (char)i; // =0x88b8=35000(ʮ����)
		System.out.println("->c="+ ((c== '\u88b8')? "0x88b8":"error")+"=" + c);
		
		i =35000-50*65536; //=0xffce88b8
		c= (char)i; // =0x88b8=35000(ʮ����)
		System.out.print("int->char:i=0x" + Integer.toHexString(i));
		System.out.println("->c="+ ((c== '\u88b8')? "0x88b8":"error")+"=" + c);
		
		//������ת��ҲҪǿ��д��ת������
		System.out.println("(int)0x123456789L==0x" +
			Integer.toHexString((int)0x123456789L));
		
		//byte->char�����Ƿ���ȡֵ��Χ�ڶ�Ҫǿ��ת������֮��Ȼ
		b=97;
		c=(char)b;
		System.out.println("byte->char:b=97->c=" + c);
		b=-10;//0xf6�����룩ʵ������0xfffffff6(int)
		c=(char)b;
		System.out.println("byte->char:b=0xf6->c=" +((c== (char)0xfff6)?"0xfff6":"error"));

		//short->char�����Ƿ���ȡֵ��Χ�ڶ�Ҫǿ��ת������֮��Ȼ
		s =32500; 
		c= (char)s; 
		//s = c; // error:Ҫ������ת��
		System.out.println("short->char:s =32500->c=" + c);
		
		s =35000-65536; //=-30536(ʮ����)=-7748(ʮ������ԭ��)=0x88b8(����)
		c= (char)s; //=0x88b8=35000(ʮ����)
		System.out.print("short->char:s=" + ((s== (short)0x88b8)?"0x88b8":"error"));
		System.out.println("->c=" + ((c== '\u88b8')? "0x88b8":"error")+"="+c);
				
		//������ת��Ϊ���ͽ�ȥ��β��:
		System.out.print("double->int: 12345.6 .. ");
		double d = 12345.6;
		System.out.println((int)d + " " + (int)(-d));
		
		//������ֵNaN->int���Ϊ0:
		System.out.println("(int)NaN==" + (int)Float.NaN);

		// ����ֵ�����ת��������ֵ:
		float fmin = Float.NEGATIVE_INFINITY;
		float fmax = Float.POSITIVE_INFINITY;
		System.out.println("��Float NEGATIVE_INFINITY..POSITIVE_INFINITYת����������ֵ�Ľ����");
		System.out.println("\tlong: " + (long)fmin +
			".." + (long)fmax);
		System.out.println("\tint: " + (int)fmin +
			".." + (int)fmax);
		System.out.println("\tshort: " + (short)fmin +
			".." + (short)fmax);
		System.out.println("\tchar: " + (int)(char)fmin +
			".." + (int)(char)fmax);
		System.out.println("\tbyte: " + (byte)fmin +
			".." + (byte)fmax);
	}
}
