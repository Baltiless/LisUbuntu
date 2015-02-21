//: MapExample.java

//package g3ds.joop.ch8;

import java.util.*;

public class MapExample{
    //����һ��ӳ���
	Map phoneBook = new HashMap();

    //���췽��
	public MapExample(String[] numbers, String[] names) {
		for(int i=0; i< numbers.length; i++) 
			phoneBook.put( numbers[i], names[i] );
    }

	public static void main(String[] args) {
		//׼������
		String[] names = { "����", "����", "��С��", "���ϴ�" };
		String[] numbers = { "63124567", "54667890", "33456238", "23456789"};

       //����ʵ��
		MapExample ex = new MapExample( numbers, names);

       //�����������
       System.out.println("Map:  " + ex.phoneBook);

       //����ӳ������ͼ��
       Set s = ex.phoneBook.entrySet();

       //���õ�����������ͼ��������
       for (Iterator i = s.iterator(); i.hasNext(); ) {
           Map.Entry me = (Map.Entry) i.next();
           Object ok = me.getKey();
           Object ov = me.getValue();
           System.out.println("object��" + me );
           System.out.print("key��" + ok + "\t");
           System.out.println("value��" + ov );
       }
   }
}