package weaknessList;

import java.util.ArrayList;
import java.util.Scanner;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> armors = new ArrayList<>();
		String[] radiantArmorList = {"Alice", "Chang'e", "Gord", "Guinevere", "Harley", "Kimmy", "Odette", "Silvanna", "Valir", "Zhask"};
		Item radiantArmor = new Item("Radiant Armor", radiantArmorList, 0);
		armors.add(radiantArmor);
		
		
		String[] twilightArmorList = {"Aldous", "Argus", "Badang", "Bane", "Benedetta", "Brody", "Bruno", "Cecilion", "Chang'e", "Claude", "Clint", "Dyrroth", "Eudora", "Gatotkaca", "Gord", "Granger", "Guinevere", "Gusion",
									  "Hanzo", "Harley", "Hayabusa", "Helcurt", "Irithel", "Jawhead", "Kadita", "Lancelot", "Lapu-lapu", "Leomord", "Lesley", "Ling", "Lunox", "Natan", "Odette", "Pharsa", "Popol", "Roger",
									  "Terizla", "Vale", "Valentina", "Wanwan", "X.Borg", "Yve"};
		Item twilightArmor = new Item("Twilight Armor", twilightArmorList, 0 );
		armors.add(twilightArmor);
		
		String[] bruteForceList = {"Aamon", "Alucard", "Benedetta", "Fanny", "Gusion", "Hanzo", "Harley", "Hayabusa", "Helcurt", "Kadita", "Karina", "Lancelot", "Ling", "Lesley", "Mathilda", "Natalia", "Saber", "Selena",
								   "Yi", "Zilong"};
		Item bruceForce = new Item("Brute Force", bruteForceList);
		armors.add(bruceForce);
		
		String[] immortalityList = {"general"};
		Item immortality = new Item("Immortality", immortalityList, 1);
		armors.add(immortality);
		
		String[] dominanceIceList = {"Alice", "Alucard", "Angela", "Balmond", "Cecilion", "Dyrroth", "Esmeralda", "Estes", "Fanny", "Gusion", "Guinevere", "Harith", "Hanabi", "Lolita", "Lunox", "Silvanna", "Rafaela","X.Borg", "Yu Zhong", "Ruby","Thamuz", "Hylos", "Uranus", "Belerick", "Alpha"};
		Item dominanceIce = new Item("Dominance Ice", dominanceIceList);
		armors.add(dominanceIce);
		
		
		String[] athenaShieldList = {"Eudora", "Vale", "Aurora", "Lunox", "Kadita", "Kagura", "Cyclops", "Luo", "Harley", "Yve"};
		Item athenaShield = new Item("Athena Shield", athenaShieldList);
		armors.add(athenaShield);
		
		String[] oracleList = {"general"};
		Item oracle = new Item("Oracle", oracleList, 1);
		armors.add(oracle);
		
		
		String[] antiqueCuirassList = {"Akai","Aldous", "Argus", "Badang", "Bane", "Barats", "Benedetta", "Brody", "Bruno", "Cecilion", "Chang'e", "Claude", "Clint", "Dyrroth", "Eudora", "Gatotkaca", "Gord", "Granger", "Guinevere", "Gusion",
				  "Hanzo", "Harley", "Hayabusa", "Helcurt", "Hilda", "Hylos", "Irithel", "Jawhead", "Kadita", "Khufra", "Lancelot", "Lapu-lapu", "Leomord", "Lesley", "Ling", "Lunox", "Minotaur", "Natan", "Odette", "Pharsa", "Popol", "Roger",
				  "Terizla", "Vale", "Valentina", "Wanwan", "X.Borg", "Yve"};
		Item antiqueCuraiss = new Item("Antique Cuirass", antiqueCuirassList);
		armors.add(antiqueCuraiss);
		
		String[] guardianHelmetList = {"general"};
		Item guardianHelmet = new Item("Guardian Helmet", guardianHelmetList, 1);
		armors.add(guardianHelmet);
		
		String[] cursedHelmetList = {"general"};
		Item cursedHelmet = new Item("Cursed Helmet", cursedHelmetList, 2);
		armors.add(cursedHelmet);
		
		String[] thunderBeltList = {"general"};
		Item thunderBelt = new Item("Thunder Belt", thunderBeltList, 2);
		armors.add(thunderBelt);
		
		String[] queensWingList = {"general"};
		Item queensWing = new Item("Queens Wing", queensWingList, 1);
		armors.add(queensWing);
		
		String[] bladeArmorList = {"general"};
		Item bladeArmor = new Item("Blade Armor", bladeArmorList, 3);
		armors.add(bladeArmor);
		
		startApp(armors);
		
		
	}

	public static void startApp(ArrayList<Item> list) {
		Scanner input = new Scanner(System.in);
		String hero1, hero2, hero3, hero4, hero5;
		System.out.print("hero1:");
		hero1 = input.next();
		System.out.print("hero2:");
		hero2 = input.next();
		System.out.print("hero3:");
		hero3 = input.next();
		System.out.print("hero4:");
		hero4 = input.next();
		System.out.print("hero5:");
		hero5 = input.next();
		
		ArrayList<String> heroList = new ArrayList<>();
		heroList.add(hero1);
		heroList.add(hero2);
		heroList.add(hero3);
		heroList.add(hero4);
		heroList.add(hero5);
		
		ArrayList<String> hero1ArmorList = new ArrayList<>(heroArmorList(hero1, list));
		ArrayList<String> hero2ArmorList = new ArrayList<>(heroArmorList(hero2, list));
		ArrayList<String> hero3ArmorList = new ArrayList<>(heroArmorList(hero3, list));
		ArrayList<String> hero4ArmorList = new ArrayList<>(heroArmorList(hero4, list));
		ArrayList<String> hero5ArmorList = new ArrayList<>(heroArmorList(hero5, list));
		
		
		
		
		int largestArray = 0;
		int arrayNum = 0;
		if(largestArray < hero1ArmorList.size()) {
			largestArray = hero1ArmorList.size();
			
			arrayNum = 1;
		}
		if(largestArray < hero2ArmorList.size()) {
			largestArray = hero2ArmorList.size();
			
			arrayNum = 2;
		}
		if(largestArray < hero3ArmorList.size()) {
			largestArray = hero3ArmorList.size();
		
			arrayNum = 3;
		}
		if(largestArray < hero4ArmorList.size()) {
			largestArray = hero4ArmorList.size();

			arrayNum = 4;
		}
		if(largestArray < hero5ArmorList.size()) {
			largestArray = hero5ArmorList.size();

			arrayNum = 5;
		}
		ArrayList<String> mustHaves;
		if(arrayNum == 1) {
			mustHaves = new ArrayList<>(mustHave(hero1ArmorList, hero2ArmorList, hero3ArmorList, hero4ArmorList, hero5ArmorList));
		}else if(arrayNum == 2) {
			mustHaves = new ArrayList<>(mustHave(hero2ArmorList, hero1ArmorList, hero3ArmorList, hero4ArmorList, hero5ArmorList));
		}else if(arrayNum == 3) {
			mustHaves = new ArrayList<>(mustHave(hero3ArmorList, hero2ArmorList, hero1ArmorList, hero4ArmorList, hero5ArmorList));
		}else if(arrayNum == 4) {
			mustHaves = new ArrayList<>(mustHave(hero4ArmorList, hero2ArmorList, hero3ArmorList, hero1ArmorList, hero5ArmorList));			
		}else {
			mustHaves = new ArrayList<>(mustHave(hero5ArmorList, hero2ArmorList, hero3ArmorList, hero4ArmorList, hero1ArmorList));
		}
		
		
		printTable(hero1, hero2, hero3, hero4, hero5, hero1ArmorList, hero2ArmorList, hero3ArmorList, hero4ArmorList, hero5ArmorList, mustHaves, list);
		
	}
	
	public static ArrayList<String> heroArmorList(String hero, ArrayList<Item> armors) {
		
		ArrayList<String> armorArray = new ArrayList<>();
		int count = 0;
		
		for(int i = 0; i < armors.size(); i++) {
			
			for(int j = 0; j < armors.get(i).getHeroListSize(); j++) {
				if(hero.equals(armors.get(i).getHero(j))) {
					armorArray.add(armors.get(i).getName());
					count++;
				}
			}
		}
		
		
		return armorArray;
	} 
	
	public static ArrayList<String> mustHave(ArrayList<String> largest, ArrayList<String> array1, ArrayList<String> array2, ArrayList<String> array3, ArrayList<String> array4){
		ArrayList<String> haveThese = new ArrayList<>();
		
		for(int i = 0; i < largest.size(); i++) {
			
			for(int j = 0; j < array1.size(); j++) {
				if(largest.get(i).equals(array1.get(j))) {
					for(int k = 0; k < array2.size(); k++) {
						if(array1.get(j).equals(array2.get(k))) {
							for(int l = 0; l < array3.size(); l++) {
								if(array2.get(k).equals(array3.get(l))) {
									for(int m = 0; m < array4.size(); m++) {
										if(array3.get(l).equals(array4.get(m))) {
											haveThese.add(largest.get(i));
										}
									}
								}
							}
						}
					}
				}
				
			}
			
		}
		
		
		return haveThese;
	}
	
	
	public static void printTable(String hero1, String hero2, String hero3, String hero4,
								  String hero5, ArrayList<String> armor1List, ArrayList<String> armor2List,
								  ArrayList<String> armor3List, ArrayList<String> armor4List,
								  ArrayList<String> armor5List, ArrayList<String> haveThis, ArrayList<Item> theList) {
		
		System.out.print("Must Haves: ");
		for(int i = 0; i < haveThis.size(); i++) {
			System.out.print(haveThis.get(i) + ", ");
		}
		
		System.out.print("\n" + hero1 + ": ");
		for(int i = 0; i < armor1List.size(); i++) {
			System.out.print(armor1List.get(i) + ", ");
		}
		
		System.out.print("\n" + hero2 + ": ");
		for(int i = 0; i < armor2List.size(); i++) {
			System.out.print(armor2List.get(i) + ", ");
		}
		
		System.out.print("\n" + hero3 + ": ");
		for(int i = 0; i < armor3List.size(); i++) {
			System.out.print(armor3List.get(i) + ", ");
		}
		
		System.out.print("\n" + hero4 + ": ");
		for(int i = 0; i < armor4List.size(); i++) {
			System.out.print(armor4List.get(i) + ", ");
		}
		
		System.out.print("\n" + hero5 + ": ");
		for(int i = 0; i < armor5List.size(); i++) {
			System.out.print(armor5List.get(i) + ", ");
		}
		
		System.out.print("\nRank 3: ");
		for(int i = 0; i < theList.size(); i ++) {
			for(int j = 0; j < theList.get(i).getHeroListSize(); j++) {
			if(theList.get(i).getHero(j).equals("general") && theList.get(i).getRank() == 3) {
				System.out.print(theList.get(i).getName() +  " ,");
				
			}
			}
		}
		
		System.out.print("\nRank 2: ");
		for(int i = 0; i < theList.size(); i ++) {
			for(int j = 0; j < theList.get(i).getHeroListSize(); j++) {
			if(theList.get(i).getHero(j).equals("general") && theList.get(i).getRank() == 2) {
				System.out.print(theList.get(i).getName() +  " ,");
				
			}
			}
		}
			
		
		System.out.print("\nRank 1: ");
		for(int i = 0; i < theList.size(); i ++) {
			for(int j = 0; j < theList.get(i).getHeroListSize(); j++) {
			if(theList.get(i).getHero(j).equals("general") && theList.get(i).getRank() == 1) {
				System.out.print(theList.get(i).getName() +  " ,");
				
			}
			}
		}
	}
	
}
