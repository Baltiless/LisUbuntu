/*
* @(#)ConventionExample.java 1.0 2004-6-6.
*
* Copyright (c) 2004 Global 3D Studio
* All Rights Reserved.
*/

package g3ds.joop.ch5;

import javax.swing.*;

/**
* ConventionExample����������Java������ʹ�õ�һЩ�淶��
*
* @version 1.0 18 2004-6-6
* @author F.Z. Lee
*/
public class ConventionExample extends JFrame {
	/* �����ڴ�����й���ʵ�ֵ�һЩ��ص�ע�� */
	
	/** �й������classVar1���ĵ�ע��*/
	public static int classVar1;
	
	/**
	 * �й������classVar2 ���ĵ�ע��
	 * ע�Ϳ��Զ��б�ʾ�����ɰ���һЩHTML��ʶ����
	 */
	private static Object classVar2;
	
	/** �й�ʵ������instanceVar1���ĵ�ע�� */
	public Object instanceVar1;
	
	/** �й�ʵ������instanceVar2���ĵ�ע�� */
	protected int instanceVar2;
	
	/** �й�ʵ������instanceVar3���ĵ�ע�� */
	private Object[] instanceVar3;
	
	/**
	 * �йع��췽��ConventionExample���ĵ�ע��
	 */
	public ConventionExample() {
		// ���췽���ľ���ʵ��...
	}
	
	/**
	 * �й�doSomething���� ���ĵ�ע��
	 */
	public void doSomething() {
		// �����ľ���ʵ��...
	}
	
	/**
	 * �й�doSomethingElse �������ĵ�ע��
	 * @param �в�someParam����;����
	 */
	public void doSomethingElse(Object someParam) {
		// �����ľ���ʵ��...
	}
}
