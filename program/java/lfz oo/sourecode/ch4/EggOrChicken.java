//: EggOrChicken.java

//package g3ds.joop.ch4;

public class EggOrChicken{
	public static void main(String[] args){
		new Chicken();
	}
}

class Egg{
	//
	Chicken aChicken=new Chicken();
	Egg(){
		System.out.println("������");
	}
}

class Chicken{
	//
	static Egg aEgg=new Egg();
	Chicken(){
		System.out.println("������");
	}
}

/*
���������о�����Ϊʵ������ʱ����������ʱ����
Exception in thread "main" java.lang.StackOverflowError
	at Egg.<init><EggOrChicken.java:13>
	at Chicken.<init><EggOrChicken.java:21>
	//�����ظ����϶���
*/