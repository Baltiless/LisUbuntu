//: ArrayInit.java

//package g3ds.joop.ch4;

public class ArrayInit{
	public static void main(String[] args){
		//empty�������
		int[] i=new int[0];
		System.out.println("empty����i�Ĵ�С��"+i.length);
		
		//��������null�Ĳ�����
		i=null;
		try{
			System.out.println("����i����null��������Ĵ�С��"+i.length);
		}catch(Exception e){
			System.out.println("����i����null��������Ĵ�С�������쳣��"+e.toString());
		}
		
		//������ǣ�����ʱֱ�ӳ�ʼ��
		int[][] yanghuiTriangle={
				{1},
				{1,1},
				{1,2,1},
				{1,3,3,1},
				{1,4,6,4,1},
			};
		//empty�������
		yanghuiTriangle=createYanghuiTriangle(0);
		printYanghuiTriangle(yanghuiTriangle);
		//һ�����
		yanghuiTriangle=createYanghuiTriangle(6);
		printYanghuiTriangle(yanghuiTriangle);
		
		//��������������Ϊʵ��
		printYanghuiTriangle(new int[][]{{1},{1,1},{1,2,1},{1,3,3,1}});
	}
	
	//����Ϊ�˷�������main�����е��ã������·�������Ϊstatic
	static int[][] createYanghuiTriangle(int row){
		//����new������ֱ�Ϊ��ά�������ռ�
		//���row=0���򴴽�һ��empty����
		int[][] result=new int[row][];
		for(int i=0; i<result.length; i++){
			int column=i+1;
			result[i]=new int[column];
			
			//�������ÿ����βԪ�ظ�ֵ
			result[i][0]=1;
			result[i][i]=1;
		}
		
		//�����������Ԫ�ظ�ֵ
		for(int i=1;i<result.length; i++){
			for(int j=1;j<i;j++){
				result[i][j]=result[i-1][j-1]+result[i-1][j];
			}
		}
		
		return result;
	}
	
	static void printYanghuiTriangle(int[][] yanghuiTriangle){
		//�ж��Ƿ�Ϊempty����
		if(yanghuiTriangle.length==0){
			//����empty����
			System.out.println("��������Ϊ0��");
		}
		else{
			//��ӡ�����������
			for(int i=0; i<yanghuiTriangle.length; i++){
				for(int j=0; j<yanghuiTriangle[i].length; j++){
					System.out.print(yanghuiTriangle[i][j]+ "\t");
				}
				System.out.println();
			}
		}
	}
}