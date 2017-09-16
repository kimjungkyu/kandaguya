package kamdagiya;

import java.util.ArrayList;

class Nation {
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
class City extends Nation {
	
}
public class WildCard {
	public static void main(String[] args) {

		Nation nation1 = new Nation();
		Nation nation2 = new Nation();
		Nation nation3 = new Nation();
		
		nation1.setName("Korea");
		nation2.setName("Japen");
		nation3.setName("China");
	
		City city1 = new City();
		City city2 = new City();
		City city3 = new City();
		
		city1.setName("Seoul");
		city2.setName("Tokyo");
		city3.setName("Bejing");
		
		ArrayList<Nation> arrayNation = new ArrayList<Nation>();
		arrayNation.add(nation1);
		arrayNation.add(nation2);
		arrayNation.add(nation3);
		
		ArrayList<City> arrayCity = new ArrayList<City>();
		arrayNation.add(city1);
		arrayNation.add(city2);
		arrayNation.add(city3);
		
		showInfo(arrayNation);
	}
	//unbounded wildcard
	// bounded wildcard
	// 1.upper bounded wildcard
	// 2.lower bounded wildcard
	public static void showInfo(ArrayList<?/* extends Nation 상속받는다 네이션을*/> array){
		for(Object temp : array){		   // super City (시티에 부모클래스) 네이션은 시티의 부모클래스
			//다운캐스팅 temp
			System.out.println(((Nation) temp).getName());
		}		
		
	}
};
