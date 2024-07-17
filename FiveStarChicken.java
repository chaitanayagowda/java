class FiveStarChicken{

    public static double takeOrder(String foodItems){
        if(foodItems == "Hot & Crispy Chicken"){
            return 179.00;
        }
        if(foodItems == "Chicken Wings"){
            return 149.00;
        }
        if(foodItems == "Chicken Nuggets"){
            return 99.00;
        }
        if(foodItems == "Chicken Popcorn"){
            return 129.00;
        }
        if(foodItems == "Grilled Chicken"){
            return 169.00;
        }
        if(foodItems == "Chicken Burger"){
            return 119.00;
        }
        if(foodItems == "Chicken Wrap"){
            return 129.00;
        }
        if(foodItems == "Chicken Lollipop"){
            return 139.00;
        }
        if(foodItems == "Chicken Tenders"){
            return 159.00;
        }
        if(foodItems == "Chicken Hotdog"){
            return 109.00;
        }
        else {
            System.out.println(foodItems + " not found");
            
        }
	
	return 0.0;
	}
	public static double takeOrder(String foodItems,int quantity){
	double price = takeOrder(foodItems);
        if (price > 0) {
			price *= quantity;
            System.out.println("Order placed for: "+foodItems+"of "+ quantity);
            return price;
		}
		else{
			 System.out.println("please select the item correctly!!");
		}
	
	
	
}
