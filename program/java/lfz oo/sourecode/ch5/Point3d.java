//: Point3d.java

//��Խ���߽�ļ̳нṹ��ʵ�ϲ����ã����������ֻ�ܵ��ø���public��protected��Ա
package g3ds.joop.ch5.threePoint;

import g3ds.joop.ch5.points.Point;

//Point3d����չ��Point�࣬���������ά����Ϣ
public class Point3d extends Point {
	//��������ά�������
	protected int z;
	
	//�����show����Ϊpublic����Ȩ�ޣ��ܱ�������ʹ���ܷ�ӳ��ά��������Ϣ
	public void show(){
		//getID����Ϊprotected����Ȩ�ޣ��ܹ������า�ǣ�����ת��ʱֱ�ӵ������෽��
		System.out.print(getID());
		
		//x��y����ҲΪprotected����Ȩ�ޣ��ܹ�������ֱ�Ӽ̳�ʹ��
		System.out.println(": "+x+", "+y+", "+z);
	}
	
	//�����û����ʵ�Z����ֵ�Ľӿ�
	public int getZ(){
		return z; 
	}
	
	//���һ���븸��ͬ����ȱʡ����Ȩ�޵�next������ʵ���ϸ���ķ�����û�б�����
	void next() {
		System.out.println("��ʾ��һ����ά��������Ϣ...");
	}
	
	//protected����Ȩ��������������࣬���getID�����ɱ�����
	protected int getID(){
		System.out.println("In Point3d...");
		return super.getID();
	}
	
	//���ڲ��Ե�main����
	public static void main(String[] args){
		Point p2 = new Point(2,2);
		//��Ȼ������Ȩ��Ϊprivate�ķ��������ڱ���֮�ⱻ����
		//p2.setMasterID();
		//x����Ϊprotected����Ȩ�ޣ�����ͨ��ʵ��ֱ�ӱ����ʣ��������Լ���������
		//int x1=p2.x;
		//ͬ��getID����Ҳ���ܱ�����
		//int ID=p2.getID();
		//next����Ҳֻ����ͬһ�����ڱ�����
		//p2.next();
				
		//ֻ�о���public����Ȩ�޵ķ��������ڰ����ʵ���б����ã�
		System.out.println("x="+p2.getX());
		p2.show();
		
		//����ת�͵����
		Point p3=new Point3d();
		//��������ķ���
		p3.show();
		
		//Point���next����Ϊȱʡ����Ȩ�ޣ���������ͬһ�����У�
		//����Point3d��Ҳ����ͬ�ķ�������ʵ�ϲ�û�б����ǣ���˱������
		//p3.next();
		
		//����ǿ������ת������Point3d��next����
		((Point3d)p3).next();
	}
}