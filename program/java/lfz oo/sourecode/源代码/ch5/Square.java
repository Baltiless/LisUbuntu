//: Rectangle.java

//package g3ds.joop.ch5;

class Square extends Rectangle{
	public Square(double s){
		super(s, s);
	}
	
	//���ڼ̳еķ����ǲ���ѡ��ģ����ֻ�ܸ�дsetWidth��
	//setHeight������ʹ֮���������α߳���ȵ�Ҫ��
	public void setWidth(double w){
		super.setWidth(w);
		super.setHeight(w);
	}
	
	public void setHeight(double h){
		super.setWidth(h);
		super.setHeight(h);
	}
}