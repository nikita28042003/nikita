
public class Knight {
int damage;
int defense;
Sword sword;
Spear spear;
Bow bow;
Shield shield;
Armor armor;
Helmet helmet;

 int totalWeight(){
	 int totalWeight =sword.weight + spear.weight+bow.weight+shield.weight+armor.weight+helmet.weight;
	 return totalWeight;
}
 int totalDamage() {
	 int totalDamage =sword.damage + spear.damage+bow.damage;
	 return totalDamage;
 }
 int totalDefense() {
	 int totalDefense =shield.defense +armor.defense + helmet.defense;
	 return totalDefense;
 }
}