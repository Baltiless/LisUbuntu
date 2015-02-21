//: PrimitiveWidening.java

//package g3ds.joop.ch3;

class PrimitiveWidening{
	public static void main(String[] args) {
		//һ��������������͵������Զ�ת�����������������
		char c = '\u0041';
		System.out.print("char->long:c=\'\\u0041\'->" );
		long l = c; // widen char to long
		System.out.println("l=0x" + Long.toHexString(l));
		
		float f = 1.23f;
		double d = f; // widen float to double
		System.out.println("float->double:f = 1.23f->d=" + d);
		
		//��Ҫ���ô�����ת��Ϊ�����ͣ���Ϊ���ߴ��ڲ���ȷ��
		int big = 1234567890;
		float approx = big;
		System.out.println("int->float:(1234567890-(int)1234567890f)�Ľ����"+(big - (int)approx));
		
		long large = 1234567890123456789L;
		double pricisionLosing = large;
		System.out.println("long->double:(1234567890123456789L-(long)1234567890123456789D)�Ľ����"+(large - (long)pricisionLosing));
	}
}
