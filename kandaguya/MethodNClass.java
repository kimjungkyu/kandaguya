package kamdagiya;

class Person{
	String name;
	String bloodType;
	
	void speak(){
	System.out.println("���� �̸��� " + name + "" +" �̰� �������� " + bloodType +"�Դϴ�." );	
	}
}
class Cat{
	String name;
}

public class MethodNClass {

	public static void main(String[] args) {

			Person person1 = new Person();
			person1.name = "Rin";
			person1.bloodType = "O";
			person1.speak();
			
			Cat cat1 = new Cat();
			cat1.name = "����";
	}
}
