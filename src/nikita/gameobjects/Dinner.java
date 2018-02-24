package nikita.gameobjects;

public class Dinner {
	Soup soup;
	SecondCourse secondCourse; 
	Garnish garnish;
	Vegetables vegetables; 
	Drink drink;

 double totalProteins(){
	 double totalProteins = soup.proteins + secondCourse.proteins + garnish.proteins;
	return  totalProteins; 
 }
 double totalFats() {
	double totalFats = vegetables.fats +soup.fats + secondCourse.fats;	 
	 return totalFats;
 }
 double totalCarbons() {
	 double totalCarbons = garnish.carbons + soup.carbons + vegetables.carbons + drink.carbons;
	 return totalCarbons;
 }	 
 
 }
 
