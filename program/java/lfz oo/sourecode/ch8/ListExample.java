//: ListExample.java

//package g3ds.joop.ch8;

import java.util.*;

public class ListExample{
	public static void main(String[] args){
		//����List��2������
		List list1=new LinkedList();
		List list2=new ArrayList();
		
		list1.add("Hello");
		//�����в��ܷŻ������ͣ���Ҫ�����װ��
		list1.add(new Integer(5));
		list1.add(new Boolean(true));
		//List��Ԫ�������ظ�
		list1.add("Hello");
		//��ָ��λ�ò���
		list1.add(1, "Insert here.");
		
		list2.add("Hello");
		//�����в��ܷŻ������ͣ���Ҫ�����װ��
		list2.add(new Integer(5));
		list2.add(new Boolean(true));
		//List��Ԫ�������ظ�
		list2.add("Hello");
		//��ָ��λ�ò���
		list2.add(1, "Insert here.");
		
		System.out.println("LinkedList:"+list1);
		System.out.println("ArrayList:"+list2);
	}
}