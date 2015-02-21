//: ObjectSerialization.java

//package g3ds.joop.ch7;

import java.io.*;

public class ObjectSerialization{
	public static void main(String[] args) 
		throws IOException,ClassNotFoundException{
		//�����ɴ��л��� st����
		Student st=new Student(20010901,"����",20,"�����ϵ");
		
		//��ObjectOutputStream��ϵ����
		FileOutputStream fout=new FileOutputStream("data.ser");
		ObjectOutputStream sout=new ObjectOutputStream(fout);
		
		try{
			//�����������״̬�����ļ�"data.ser"
			sout.writeObject(st);  
			sout.close();
		}catch(IOException e){}
	
		st=null;
		// st������ObjectInputStream��ϵ����
		FileInputStream fin=new FileInputStream("data.ser");
		ObjectInputStream sin=new ObjectInputStream(fin);
		
		try{ 
			//������������״̬���ļ�"data.ser"����
			st=(Student)sin.readObject(); 
			sin.close();
		}catch(IOException e){}
		
		//�����֤
		System.out.println("ѧ����Ϣ:");
		System.out.println("ѧ��: " + st.id);
		System.out.println("����: " + st.name);
		System.out.println("����: " + st.age);
		System.out.println("Ժϵ: " + st.department);
	}
}


//Student��ʵ��Serializable�ӿ�
class Student implements Serializable{
	//��̬����ʱ����������Ҫ���л�
	static int total;//
	transient boolean isEnrolled;//
	
	//������ѧ���йصı���
	int id;
	String name;
	int age;
	String department;
	
	Student(int id, String name, int age, String department){
		this.id=id;
		this.name=name;
		this.age=age;
		this.department=department;
		total++;
		isEnrolled=true;
	}
	
	/*
	//һ��ɲ���д�����ƴ��л�ʱ��Ҫ��дwriteObject()����
	private void writeObject(ObjectOutputStream out)throws IOException
	{
		out.writeInt(id);
		out.writeInt(age);
		out.writeUTF(name);
		out.writeUTF(department);
	}
	
	//һ��ɲ���д�����ƴ��л�ʱ��Ҫ��дreadObject()����
	private void readObject(ObjectInputStream in)throws IOException
	{
		id=in.readInt();
		age=in.readInt();
		name=in.readUTF();
		department=in.readUTF();
	}
	//*/
}