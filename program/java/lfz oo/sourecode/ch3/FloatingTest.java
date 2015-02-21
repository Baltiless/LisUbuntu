//: FloatingTest.java

//package g3ds.joop.ch3;

class FloatingTest {
	public static void main(String[] args) {	
		// NaN����
		double d = 0.0/0.0;
		System.out.println("0.0/0.0 is Not-a-Number: "+d);

		double x1= 0.0/0.0;
		double x2= 0.0/0.0;
		System.out.println("��x1��x2����NaNʱ��");
		System.out.println("(x1==x2): " + (x1==x2));
		System.out.println("(x1<x2): "+ (x1<x2));
		System.out.println("(x1<x2)==!(x1>=x2): "+ ((x1<x2)==!(x1>=x2)));
		
		// ��������ķǾ�ȷ�Ծ���
		System.out.println("\n��������ķǾ�ȷ�Ծ���:");
		float f=0.0f; 
		for (int i=0;i<10;i++) {
			f+=0.1f;
		}
		System.out.println("��f=0.0f��ִ��10��f=f+0.1f���õ��Ľ����:"+ f);	
		
		// ��������ķǾ�ȷ�Ե���һ������		
		System.out.println("��int i=0��99��ִ��z/i*i��������ֵz���������ӣ�");
		System.out.println("���ڲ�ͬ��zֵ�����ͬ������ȡz=55.0");
		System.out.print("\t���ڵ��������㣺");
		for (int i = 0; i < 100; i++) {
			float z = 55.0f / i * i;
			if (z != 55.0f)
				System.out.print(" " + i);
		}
		System.out.println();

		System.out.print("\t����˫�������㣺");
		for (int i = 0; i < 100; i++) {
			double z = 55.0 / i * i;
			if (z != 55.0)
				System.out.print(" " + i);
		}
		System.out.println();
	}
}