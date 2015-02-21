//: Circle.java

//package g3ds.joop.ch4;

public class Circle{
	//����һ�ֻ�Բ��������Բ�йصĲ���
	private int x;
	private int y;
	private int r;
	
	//������һ�ֻ�Բ������һ����ʽ
	public Circle(int x, int y, int r){
		this.x=x;
		this.y=y;
		this.r=r;
		draw();
	}
	
	//��û��ָ��λ��ʱ��������ԭ�㴦��Բ
	public Circle(int r){
		this(0, 0, r);
	}
	
	//����ʲô����û������ԲʱҲ��Ӧ�ñ�����ֻ�Ǹ���һ��ȱʡֵ
	public Circle(){
		this(0, 0, 10);
	}
	
	//�����еĻ��ƶ�����ȡ�����������һ��ʵ������
	public void draw(){
		System.out.println("��Բ��Բ�ģ�"+x+", "+y+"�����뾶R="+r);
	}
	
	public static void main(String[] args){
		//����
		new Circle();
		new Circle(50);
		new Circle(10,10,10);
	}
}