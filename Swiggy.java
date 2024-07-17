class Swiggy{

	public static double takeOrder(String foodItems){
		
	if(foodItems == "Pizza"){
		return 199.00;
	}
	if(foodItems == "Burger"){
		return 99.00;
	}
	if(foodItems == "FrenchFries"){
		return 69.00;
	}
	if(foodItems == "OreoMilkShake"){
		return 119.00;
	}
	if(foodItems == "Biriyani"){
		return 299.00;
	}
	if(foodItems == "Momos"){
		return 109.00;
	}
	if(foodItems == "Panner65"){
		return 199.00;
	}
	if(foodItems == "mushroom65"){
		return 219.00;
	}
	if(foodItems == "pannerpeperdry"){
		return 259.00;
	}
	if(foodItems == "MasalaDosa"){
		return 109.00;
	}
	if(foodItems == "idliVada"){
		return 79.00;
	}
	if(foodItems == "ChikenRoll"){
		return 169.00;
	}
	if(foodItems == "moBurger"){
		return 159.00;
	}
	if(foodItems == "MasalaCoke"){
		return 40.00;
	}
	if(foodItems == "KFCWings"){
		return 249.00;
	}
	if(foodItems == "IceCream"){
		return 179.00;
	}
	else{
	System.out.println(foodItems +"Not Found");
	
	}
	return 0.0;
	}
	public static double takeOrder(String foodItems,int quantity){
		double price = 0.0 ;
			if(foodItems == "Pizza"){
				
		price = 199.00*quantity;
		return price;
	}
	if(foodItems == "Burger"){
		price = 99.00*quantity;
		return price;
	}
	if(foodItems == "FrenchFries"){
		price = 69.00*quantity;
		return price;
	}
	if(foodItems == "OreoMilkShake"){
		price = 199.00*quantity;
		return price;
	}
	if(foodItems == "Biriyani"){
		price = 299.00*quantity;
		return price;
	}
	if(foodItems == "Momos"){
	price = 129.00*quantity;
		return price;
	}
	if(foodItems == "Panner65"){
		price = 199.00*quantity;
		return price;
	}
	if(foodItems == "mushroom65"){
		price = 219.00*quantity;
		return price;
	}
	if(foodItems == "pannerpeperdry"){
		price = 259.00*quantity;
		return price;
	}
	if(foodItems == "MasalaDosa"){
		price = 209.00*quantity;
		return price;
	}
	if(foodItems == "idliVada"){
		price = 79.00*quantity;
		return price;
	}
	if(foodItems == "ChikenRoll"){
	price = 169.00*quantity;
		return price;
	}
	if(foodItems == "moBurger"){
		price = 159.00*quantity;
		return price;
	}
	if(foodItems == "MasalaCoke"){
		price = 40.00*quantity;
		return price;
	}
	if(foodItems == "KFCWings"){
		price = 299.00*quantity;
		return price;
	}
	if(foodItems == "IceCream"){
		price = 179.00*quantity;
		return price;
	}
	else{
	System.out.println(foodItems +"Not Found");
	
	}
	return 0.0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}