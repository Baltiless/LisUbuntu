//: CharacterExpression.java
//: �ַ��ı�﷽ʽ

//package g3ds.joop.ch3;

public class CharacterExpression{
	public static void main(String[] args){
		// �����ַ���ʾ
		char c1='A';
		// �˽���ת���ʾ,����1��3λ����,�˴�Ϊ";"
		char c2='\73';
		// ת���ַ�,�˴�ΪTab��
		char c3='\t';
		// Unicodeת���ʾ,����4λ����,�˴�Ϊ"A"
		char c4='\u0041';

		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		System.out.print(c4);
		System.out.println();
       	
		// 'A'+'\73'+'\t'+'\u0041'�൱����ֵ���:65+59+9+65=198
		System.out.println(c1+c2+c3+c4);
		// 'A'+'\73'+'\t'+'\u0041'λ����ǰ,����Ϊ����ֵ����,�ٺ�"Hello"����
		System.out.println(c1+c2+c3+c4+"Hello");
		// 'A'+'\73'+'\t'+'\u0041'λ���ں�,��ֱ����Ϊ�ַ�����
		System.out.println("Hello"+c1+c2+c3+c4);
		
		String str="Hello";
		int i=1;
		double d=0.11;
		// ��һ��"+"Ϊ�Ӻ�,�ɻ�Ϊ���������������"-"��"*"��;�ڶ���"+"Ϊ���ӷ�,�����滻
		System.out.println(i+d+str);
		// ����"+"��Ϊ���ӷ�,�����滻
		System.out.println(str+i+d);
	}
}