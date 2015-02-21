//: SetExample.java

//package g3ds.joop.ch8;

import java.util.*;

public class SetExample{
   public static void main(String[] args) {
        Collection c = new TreeSet();
        
        String red = "red";
        String green = "green";
        String blue = "blue";
        String magenta = "magenta";
        String yellow = "yellow";
        
        Collection hs1 = new HashSet();
        hs1.add( red );
        hs1.add( green );
        hs1.add( blue );
        hs1.add( magenta );

        Collection hs2 = new HashSet();
        hs2.add( red );
        hs2.add( green );
        hs2.add( yellow );

        //���Դ���ϵ�����
        System.out.println("����hs1��" + hs1);
        System.out.println("����hs2��" + hs2);
        
        //����һ������intersectʹ֮��hs1������ͬ
        Collection intersect = new HashSet(hs1); 
        //������hs2��Ҳ�е�Ԫ�أ��õ�˫�����е�Ԫ�ؼ�
        intersect.retainAll(hs2);
     
        System.out.println("����hs1��hs2���е�Ԫ��:" + intersect);

        // ������һ������xorʹ֮��hs1������ͬ
        Collection xor = new HashSet(hs1);  
        //�����м���hs2�����в�ͬԪ��
        xor.addAll(hs2); 
        //ȥ��hs1��hs2���е�Ԫ�أ��õ�ֻ��һ���е�Ԫ�ؼ�
        xor.removeAll(intersect);
        
        System.out.println("ֻ�����ڼ���hs1��hs2�е�Ԫ��:" + xor);
   }
}