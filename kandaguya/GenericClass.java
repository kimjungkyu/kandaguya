package kamdagiya;

class Gen<T> {
	private T something;

	public void setSomething(T value) {
		something = value;
	}
	public T getSomething(){
		return something;
	}
}

public class GenericClass {

	public static void main(String[] args) {
		Gen<String> gen = new Gen<String>();
		gen.setSomething("Rin");
		System.out.println(gen.getSomething());
		
		Gen<Integer> gen2 = new Gen<Integer>();
		gen2.setSomething(5);
		System.out.println(gen2.getSomething());
	}
}