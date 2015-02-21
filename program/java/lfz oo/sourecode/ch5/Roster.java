//:Roster.java

//package g3ds.joop.ch5;

import java.util.Vector;

public class Roster {
	//��¼���Ǽ�����
	protected int capacity;
	protected Vector students;

	public Roster(int max) {
		capacity = max;
		students = new Vector();
	}

	//��������Ա�Ǽǵ����У��Ǽ�ǰ�ñ���allowExcess�ж��Ƿ����
	public boolean addStringToVector(String name, boolean allowExcess){
		if (!allowExcess) {
			if (students.size() >= capacity)
				return false;
		}
		
		students.addElement(name);
		return true;
	}
}