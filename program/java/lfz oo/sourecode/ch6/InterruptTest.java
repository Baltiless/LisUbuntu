//: InterruptTest.java

//package g3ds.joop.ch6;

public class InterruptTest{
	public static void main(String[] args){
		//�����ⲿ��ʵ��
		InterruptTest obj=new InterruptTest();
		
		//����μ�������
		Interviewee p1 = obj.new Interviewee("����");
		Interviewee p2 = obj.new Interviewee("����");
		Interviewee p3 = obj.new Interviewee("������");
		Interviewee p4 = obj.new Interviewee("��СѾ");
		
		//֪ͨ������ѡ
		Interviewee[] persons={p1, p3, p4};
		
		//�����ټ�����������Ա
		Interviewer p = obj.new Interviewer("�Թ���", persons);
		
		//��ʼѡ��
		p.start();
	}
	
	//���һ����չThread���ڲ��࣬����������
	private class Interviewee extends Thread{
		//��¼�Ƿ�ѡ�е�״̬
		private boolean isNodded;
		
		//��ƴ���ʵ�����Ĺ��췽��
		Interviewee(String name){
			super(name);
		}
		
		//���Ǹ����run����
		public void run(){
			try{			
				//�����ߵ��龰�Ự
				answer();
				
				//ģ���һ���������̻��ѵ�ʱ��;��������£�
				//���û�л�����̫�̣����ܱ��жϵ��߳�Ҳ�����ִ����ȥ��
				Thread.sleep(1000);
				
				System.out.println("��������Ľ���������������...");
				System.out.println("лл��");
			}catch(InterruptedException e){}
		}
		
		//����Ƿ�ѡ��
		boolean isNodded(){
			return isNodded;
		}
		
		//�����Ƿ�ѡ��
		void setNodded(boolean isNodded){
			this.isNodded=isNodded;
		}
		
		//ģ�������ߵĻش�
		void answer(){
			if(isNodded)
				System.out.println("�ҽ�"+ getName() + "������ͨ���׼ǣ�"+
						"Ϊ����ͣ����ںͿͻ���ͨ������...");
			else
				System.out.println("�ҽ�"+ getName() + "����...?");
		}
	}
	
	//���һ����չThread���ڲ��࣬����������
	private class Interviewer extends Thread{
		//������������
		private Interviewee[] persons;
		
		//��ƴ���ʵ�����Ĺ��췽��
		Interviewer(String name, Interviewee[] persons){
			super(name);
			this.persons=persons;
		}
		
		//���Ǹ����run����
		public void run(){
			try{
				for(int i=0; i<persons.length; i++){
					//��ʼ����
					persons[i].start();
					
					//�����ٵ����
					interview(persons[i]);
								
					//ģ��������һ�����Ժ���ܼ�����һ��
					persons[i].join();
					
					System.out.println();
				}
			}catch(InterruptedException e){}
		}
		
		//ģ�����Թ���
		void interview(Interviewee person){
			//�����ٵ����
			decide(person);
				
			//�����ٵ�ί����
			if(!(person.isNodded())){
				System.out.println("�Բ������Ǹ���Ȥ����...");
				
				//���������������߽������˳�
				person.interrupt();
			}
			else{
				System.out.println("�����һ����������");
			}
		}
		
		//ģ�������ٶ������ߵ��ж�
		private void decide(Interviewee person){
			//��һ����������������ߵ����ˣ���������Щ���ʣ�
			int seed=(int)(Math.random()*2);

			switch(seed){
				case 0:
					person.setNodded(false);
					break;
				case 1:
					person.setNodded(true);
					break;
			}
		}
	}
}