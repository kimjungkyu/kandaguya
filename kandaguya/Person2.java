package kamdagiya;

public class Person2 {
String name = "Rin";
String bloodType;
int age = 20;

	void speak(){
		System.out.println("저의 이름은 "+ name + "이고 형액형은" + bloodType+"입니다.");
	}
	
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
}
