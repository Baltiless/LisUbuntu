//: ProcessDemo.java

//package g3ds.joop.ch5;

class ProcessDemo{
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
    	Process p = null;

    	try {
 			//����һ������
      		p = r.exec("notepad");
      		
      		//һֱ�ȴ������̽���
      		//p.waitFor();
      		
      		//�ӳ����Ĳ���
      		new Thread().sleep(2000);
      		//����ǿ���жϽ��̣���ʱexitValue�����᷵�ط�0
      		p.destroy();
    	} catch (Exception e) {}
    
    	System.out.println("Notepad���̷���ֵ��" + p.exitValue());
	}
}