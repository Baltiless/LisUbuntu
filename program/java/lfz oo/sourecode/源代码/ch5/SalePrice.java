//: SalePrice.java

//package g3ds.joop.ch5;

//��չһ�������������ô��۶��۲���
public class SalePrice extends PricePolicy{
	private double discount;
	
	public void setDiscount(double discount){
		this.discount=discount;
	}
	
	public double getPrice(){
		return basePrice*discount;
	}
}