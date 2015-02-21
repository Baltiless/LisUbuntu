//: StringConvention.java

//package g3ds.joop.ch5;

public class StringConvention{
	public static void main(String agrs[]){
		String a1="test";
		String b1="test";

		/* String�����hashCode���㷨���£� 
		 * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		 * ���У�s[i]���ַ����и�λ���ַ�ASCII(UNICODE)�������
		 * ����ֵ: n���ַ����ĳ���,  ^ ��ʾ��.
		 * (���ַ�����hashCodeֵΪ0)
		 */

		//65*(31^3+32^2+31+1)=2000960
		b1="AAAA";
		System.out.println("(AAAA)��ɢ����= "+b1.hashCode());

		//b1=""��hashCodeֵΪ0,������b1=null
		b1="";
		System.out.println("(���ַ���)��ɢ����= "+b1.hashCode());
		
		//�������쳣
		//b1=null;
		//System.out.println("(null)��ɢ����= "+b1.hashCode());

		//116*31^3+101*31^2+115*31+116=3556498
		b1=new String("test");
		System.out.println("a1:(test)��ɢ����= "+a1.hashCode());
		System.out.println("b1:(test)��ɢ����= "+b1.hashCode());
	
		//������ȽϺ����ݱȽ�
		System.out.println("��ͬ���ݣ�a1.eauals(b1)= "+a1.equals(b1));
		System.out.println("(��ͬ����a1==b1)= "+(a1==b1));
		
		//����System��identityHashCode�������ø���ǰ��ɢ����
		System.out.println("����ǰa1:(test)��ɢ����= "+
				System.identityHashCode(a1));
		System.out.println("����ǰb1:(test)��ɢ����= "+
				System.identityHashCode(b1));

		//��StringBuffer���в�û�и���hashCode()
		System.out.println("\n�Աȣ�StringBuffer���в�û�и���hashCode����");
		StringBuffer aa=new StringBuffer("test");
		StringBuffer bb=new StringBuffer("test");
		System.out.println("aa��(test)��ɢ����= "+aa.hashCode());
		System.out.println("bb��(test)��ɢ����= "+bb.hashCode());
		
		//ͬһ�����󱻸��죬hashCodeһ��
		bb.insert(4, "!changed");
		System.out.println("bb��(test!changed)��ɢ����= "+bb.hashCode());
	}
}