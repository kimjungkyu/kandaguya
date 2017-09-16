package kamdagiya;

public class MonsterSub {
	public static void main(String[] args) {
		/*Monster mob1 = new Monster("Zombie");
		mob1.spawn();
		
		Monster mob2 = new Monster("Skeleton");
		mob2.spawn();*/
		
		Monster.Brain brain = new Monster.Brain();
		brain.think();
	}
}
