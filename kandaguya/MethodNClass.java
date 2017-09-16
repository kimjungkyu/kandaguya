package kamdagiya;

class Person{
	String name;
	String bloodType;
	
	void speak(){
	System.out.println("저의 이름은 " + name + "" +" 이고 혈액형은 " + bloodType +"입니다." );	
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
			cat1.name = "냥이";
	}
}
