//: Part.java

//package g3ds.joop.ch5;

import java.util.Vector;

public class Part{
	//���һ�����ڴ洢ʹ�ø�������͵ļ���
	private Vector cars = new Vector();
	
	private PricePolicy pricePolicy;

	public Car[] getCars() { 
		//�Ѽ����е�Ԫ��ת����Car���Ͳ�������ķ�ʽ����
		return (Car[]) cars.toArray(new Car[0]);
	}

	public void addCar(Car car) {
		//���ʹ����ĳ���������ѳ��ͼ��뼯����
		cars.add(car);
	}
	
	//���ö��۲���
	public void setPricePolicy(PricePolicy policy){
		pricePolicy=policy;
	}
	
	//ͨ�����۲���Ϊ��ǰ�������
	public void setPrice(double price){
		pricePolicy.setPrice(price);
	}
	
	//ͬ�����ɶ��۲��Ի�ȡ��ǰ����ļ۸�
	public double getPrice(){
		return pricePolicy.getPrice();
	}
}