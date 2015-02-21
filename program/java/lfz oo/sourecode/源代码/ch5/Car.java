//: Car.java

//package g3ds.joop.ch5;

import java.util.Vector;

public class Car extends RoadVehicle implements Refuellable{
	//���һ�����ڴ洢�����㲿���ļ���
	private Vector parts = new Vector();

	public Part[] getParts() { 
		//�Ѽ����е�Ԫ��ת����Part���Ͳ�������ķ�ʽ����
		return (Part[]) parts.toArray(new Part[0]);
	}

	public void addPart(Part part) {
		//�Ѹ��㲿�����������㲿��������
		parts.add(part);
    
		//ͬʱ�Ѹó�ʵ�����뵱ǰ�㲿���ĳ��ͼ�����
		part.addCar(this);  
	}
	
	//ͳ�������������㲿���ĳɱ�
	public double totalCost(Part[] parts){
		double total=0.0;
		
		for(int i=0; i<parts.length; i++)
			total+=parts[i].getPrice();
			
		return total;
	}


	//�������ݹ���ʵ�ֽӿڵ����ݣ�
	public boolean license(){
		boolean isOk=false;
		
		//if...
		
		return isOk;
	}
	
	public void refuel(){
		System.out.println("�ɻ�����.");
	}
	
	public static void main(String[] args){
		 
	}
}