//: IteratorExample.java

//package g3ds.joop.ch8;

import java.util.*;

public class IteratorExample{
    public static void main(String[] args) {
        //����һ�����ϣ���ʧһ���ԣ�Ӧ����ΪCollection
        Collection c = new HashSet();
		
		//���������������Ԫ��
        for(int i = 1; i <= 5; i++)
            c.add( new Double(i));
		
		if ( c.isEmpty() ) 
            System.out.println("����cΪ��");

        //Collection��add�����з���ֵ�������Ҫ�ı䷵��true��
        boolean added;
        //��������������Ͳ�ͬ��Ԫ��
        added = c.add("Hello");
        added = c.add( new Date() );
        System.out.println("Collection��add�����޸ĳɹ��ķ��أ�" + added);
        
        //�����HashSet�������ͬ��Ԫ�������޸�
        added = c.add("Hello");
        System.out.println("Collection��add�����޸Ĳ��ɹ��ķ��أ�" + added);
        
        System.out.println("����c�е�Ԫ�ظ�����" + c.size());
		
		//���õ��������ʼ����е�Ԫ��
		for(Iterator i = c.iterator(); i.hasNext();)
			System.out.print(i.next() + " ; ");
			
		System.out.println();
    }
}