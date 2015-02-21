//:RosterUpdate.java

//package g3ds.joop.ch5;

import java.util.Vector;

public class RosterUpdate{
	protected int capacity;
	protected Vector students;

	public RosterUpdate(int max) {
		capacity = max;
		students = new Vector();
	}

	//�Ǽǲ���
	public void addStringToVector(String name) {
		students.addElement(name);
	}
	
	//�ԵǼ��Ƿ���������ж�
	public boolean conditionalAddStringToVector(String name) {
		if (students.size() >= capacity)
			return false;
    
		addStringToVector(name);
		
		return true;
  }
}