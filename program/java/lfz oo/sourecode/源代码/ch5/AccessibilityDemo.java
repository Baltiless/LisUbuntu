//: AccessibilityDemo.java

package g3ds.joop.ch5;

import g3ds.joop.ch5.points.*;
import g3ds.joop.ch5.threePoint.*;

//���ڲ�ͬ���в����ڼ̳й�ϵ���ֻ࣬�ܾۺ��������е�public����
//����ֻ�ܵ�����������Ϊpublic����Ȩ�޵ķ���
class AccessibilityDemo{
	public static void main(String[] args){
		//��������ȫ�޶�������һ������
		g3ds.joop.ch5.points.Point p1 = new g3ds.joop.ch5.points.Point(1,1);
		p1.show();
		
		//��ͬ����public���Ϳ��Է���
		Point p2 = new Point(2,2);
		p2.show();
		
		Point3d p3=new Point3d();
		p3.show();
		
		Point3dSamePkg p4=new Point3dSamePkg();
		p4.show();
		
		//��ͬ���з�public�����޷�����
		//PointList p5=new PointList();
	}
}