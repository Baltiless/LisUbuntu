//:Citizen.java

class Citizen{
	protected String identity;
	protected String socialSecurity;
	protected String name;
	
	public Citizen(String identity, String socialSecurity, String name){
		this.identity=identity;
		this.socialSecurity=socialSecurity;
		this.name=name;
	}
	
	//public boolean equals(Object obj){...}
	
	public static void main(String[] args){
		Citizen c1=new Citizen("112233445566778899", "A12345678", "��ܭ");
		Citizen c2=new Citizen("112233445566778899", "A12345678", "���޹�");
		
		System.out.println("��ܭ=���޹�: "+ c1.equals(c2));
	}
}
	