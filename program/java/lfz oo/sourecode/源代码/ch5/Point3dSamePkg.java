//: Point3dSamePkg.java

//ͬһ�����п���ֱ�ӷ��ʸ����private������г�Ա
package g3ds.joop.ch5.points;

//Point3d����չ��Point�࣬���������ά����Ϣ
public class Point3dSamePkg extends Point {
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
	
	//���һ���븸��ͬ����ȱʡ����Ȩ�޵�next��������Ϊ��ͬһ�����У��˷����ɱ�����
	void next() {
		System.out.println("��ʾ��һ����ά��������Ϣ...");
	}
	
	//protected����Ȩ��������������࣬���getID�����ɱ�����
	protected int getID(){
		System.out.println("In Point3dSamePkg...");
		return super.getID();
	}
	
	//���ڲ��Ե�main����
	public static void main(String[] args){
		Point p2 = new Point(2,2);
		//��Ȼ������Ȩ��Ϊprivate�ķ��������ڱ���֮�ⱻ����
		//p2.setMasterID();
		//������ͬһ�����е����ƣ����µ���������
		int x1=p2.x;
		int ID=p2.getID();
		p2.next();
				
		//ֻ�о���public����Ȩ�޵ķ��������ڰ����ʵ���б����ã�
		System.out.println("x="+p2.getX());
		p2.show();
		
		//����ת�͵����
		Point p3=new Point3dSamePkg();
		//��������ķ���
		p3.show();
		
		//�����next����Ϊȱʡ����Ȩ�ޣ���������ͬһ�����У��ɱ�����
		p3.next();
		
		//��ȻҲ����ǿ������ת������Point3dSamePkg��next����
		((Point3dSamePkg)p3).next();
	}
}