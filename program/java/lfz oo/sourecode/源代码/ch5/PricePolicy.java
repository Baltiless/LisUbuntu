//: PricePolicy.java

//package g3ds.joop.ch5;

//���һ�����۲�������
public class PricePolicy{
	//����ֻ���Ĳ�Ʒ�Ļ����۸����
	protected double basePrice;
	
	public void setPrice(double price){
		basePrice=price;
	}
	
	public double getPrice(){
		return basePrice;
	}
}