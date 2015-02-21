//: Kid.java

//package g3ds.joop.ch2;

public class Kid{
	public Kid(){
		System.out.println("I am ...");
	}
	
	public static void main(String[] args){
		Kid baby;
		int seed, times, count;
		
		//����ͨ��args[0]����ѭ������count
		try{
			if(args.length==0)
				times=1;
			else
				times=Integer.parseInt(args[0]);
		}catch(Exception e){
			times=1;
		}
		
		count=times;
		do{
			//������������
			count--;
			
			//�������������seed��ͬ��ֵ��ʹ�ÿ���ת�Ƶ�switch���Ĳ�ͬ��֧
			seed=(int)(Math.random()*3);
			//switch����б��ʽ�Ľ��������char��byte��short��int��
			switch(seed){
				case 1: baby=new Boy();
					//���������break��䣬ִ��
					//javac -Xswitchcheck Kid.java �����־���
					//warning: possible fall-through into case default:...
					break;
				
				//default��֧������ʡ�ԣ�����еĻ�����һ���������	
				default: baby=new Kid();
					//���������break��䣬ִ��
					//javac -Xswitchcheck Kid.java �����־���
					//warning: possible fall-through into case 2:...
					break;
				
				case 2: baby=new Girl();
					//���һ��break����ʡ��
					break;
			}
		
			//ʹ��if���Բ�ͬʵ������Ϊ�����ж�
			if(baby instanceof Boy)
				System.out.println("I like playing football.");
			else if(baby instanceof Girl)
				System.out.println("I like singing.");
			else
				System.out.println("I like ...");
				
			System.out.println();
		}while(count>=1);//ѭ����ֹ����
	}
}

//Boy��Kid����չ��
class Boy extends Kid{
	Boy(){
		System.out.println("I am a boy.");
	}
}

//Girl��Kid����չ��	
class Girl extends Kid{
	Girl(){
		System.out.println("I am a girl.");
	}
}