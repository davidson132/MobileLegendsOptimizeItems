package weaknessList;

public class Item {

	private String name;
	private int rank;
	private String[] hero;
	
	public Item(String name, String[] hero, int rank) {
		this.name = name;
		this.hero = hero;
		this.rank = rank;
	}
	
	public Item(String name, String[] hero) {
		this.name = name;
		this.hero = hero;
		this.rank = 0;
	}
	
	public int getHeroListSize() {
		return this.hero.length;
	}
	
	public String getHero(int i) {
		return this.hero[i];
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getRank() {
		return this.rank;
	}
}
