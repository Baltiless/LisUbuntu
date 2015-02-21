//:Judge.java

//package g3ds.joop.ch5;

//����һ���ӿڣ�������ֱ�۵�����������������
interface SharedConstants {
	//����3�������ֱ��ʾʯͷ����������
	int STONE=0;
	int SCISSORS=1;
	int CLOTH=2;
	
	//����3�������ֱ��ʾ��ͬ�Ľ��
	int LOSE=-1;
	int NOUGHT = 0;
	int WIN = 1;
}

//����һ����Ϸ����
class Player implements SharedConstants {
	//ģ����Ϸ�߳�ȭ��ʯͷ������������ѡһ��
	int play() {
		int prob = (int) (3 * Math.random());
		if (prob == 0)
			return STONE;
		else if (prob == 1)
			return SCISSORS;
		else
			return CLOTH;
	}
	
	//ģ��Ͳ�����Ϸ�ĶԷ�һ���ж�˭��˭Ӯ
	int compare(Player gambler){
		//�Լ���ȭ
		int mySign=play();
		switch(mySign){
			case(STONE):
				System.out.print(" ʯ  ͷ");
				break;
			case(SCISSORS):
				System.out.print(" ��  ��");
				break;
			case(CLOTH):
				System.out.print("     ��");
				break;
		}
		
		//�Է�Ҳ��ȭ
		int yourSign=gambler.play();
		switch(yourSign){
			case(STONE):
				System.out.print(" :  ʯ  ͷ ");
				break;
			case(SCISSORS):
				System.out.print(" :  ��  �� ");
				break;
			case(CLOTH):
				System.out.print(" :  ��     ");
				break;
		}
		
		//�ж���Ӯ
		if ((mySign==STONE && yourSign==SCISSORS) || 
			(mySign==SCISSORS && yourSign==CLOTH) || 
			(mySign==CLOTH && yourSign==STONE)){
			System.out.println("\t ����     Ӯ : ��");
			return WIN;
		}
		else if((yourSign==STONE && mySign==SCISSORS) || 
			(yourSign==SCISSORS && mySign==CLOTH) || 
			(yourSign==CLOTH && mySign==STONE)){
			System.out.println("\t ����     �� : Ӯ");
			return LOSE;
		}
		else{
			System.out.println("\t ����     ��   Ч");
			return NOUGHT;
		}
	}
}

//����һ������Ա�࣬ģ����ʤ����Ϸ
public class Judge implements SharedConstants {
	public static void main(String[] args) {
		int count=0;
		int win=0;
		int lose=0;
		
		Player banker = new Player();
		Player gambler = new Player();
		
		System.out.println("\"ʯͷ.����.��\"��Ϸ: ��ʤ��");
		System.out.println("��ͷ����:Сͷ�ְ�\t ������ͷ����:Сͷ�ְ�");
		
		for(; ; ){
			//��¼��ȭ�ܴ���
			count++;
			
			//�Ƚ���Ӯ
			int i=banker.compare(gambler);
			if(i==WIN)
				win++;
			else if(i==LOSE)
				lose++;
				
			//�˳�ѭ��������
			if((win+lose)>=3) break;
		}
		
		System.out.println("�ܹ���ȭ "+count+" ��");
		System.out.println("�����"+((win>lose)?"��ͷ����":"Сͷ�ְ�")+" ʤ");
	}
}