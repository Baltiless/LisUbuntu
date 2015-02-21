//: InterfaceExample.java

//package g3ds.joop.ch3;

interface BaseColors {
	int RED=1, GREEN=2, BLUE=4;
}

interface RainbowColors extends BaseColors {
	int YELLOW=3, ORANGE=5, INDIGO=6, VIOLET=7;
}

interface PrintColors extends BaseColors {
	int YELLOW=8, CYAN=16, MAGENTA=32;
}

// �ӿ����Ϳ��Խ��ж��ؼ̳�
interface LotsOfColors extends RainbowColors, PrintColors {
	// ���г�Ա���Զ��ǳ���
	int FUCHSIA=17, VERMILION=43, CHARTREUSE=RED+90;
	// ���еĳ�Ա�������ǳ����
	void mix(int[] colors);
	// ����������Ա�ӿ�
	interface Brush{
		int LARGE=100, MIDDLE=50, SMALL=1;
	}
	//Ҳ����������Ա��
	class Tool implements Brush{
		// �����ﶨ������ 
	}
}

public class InterfaceExample implements LotsOfColors{
	// ������Ҫʵ����Ӧ�ӿڵķ���
	public void mix(int[] colors){}
	// ��Ϊ���ؼ̳������Աͬ������ʱ��Ӧ��ȷָ���������Դ
	public static void main(String[] args){
		System.out.println(PrintColors.YELLOW);
	}
}