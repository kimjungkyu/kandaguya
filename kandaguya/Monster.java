package kamdagiya;

public class Monster {
	private String name;
	
	public Monster(String name){
		this.name = name;
	}
	
	static class Brain {
		public void think(){
			System.out.println("some brain is  thinking...");
		}
	}
	public void spawn() {
		Brain brain =  new Brain();
		brain.think();
	}
	
}
