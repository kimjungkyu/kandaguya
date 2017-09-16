package kamdagiya;

public class StaticDiffInstance {
	public static void main(String[] args) {

		Phone.ID = 0;
		System.out.println(Phone.ID);
		
		Test.changePhoneID();
		System.out.println(Phone.ID);
		
		PLaptop notebook1 = new PLaptop();
		notebook1.ID =1;
		System.out.println(notebook1.ID);
		
		Test test = new Test();
		
	}
}
