class Dominos {

    public static double takeOrder(String foodItems){
        if(foodItems == "Margherita Pizza"){
            return 199.00;
        }
        if(foodItems == "Pepperoni Pizza"){
            return 249.00;
        }
        if(foodItems == "Cheese Burst Pizza"){
            return 299.00;
        }
        if(foodItems == "Farmhouse Pizza"){
            return 279.00;
        }
        if(foodItems == "Veggie Paradise Pizza"){
            return 259.00;
        }
        if(foodItems == "Paneer Makhani Pizza"){
            return 269.00;
        }
        if(foodItems == "Chicken Supreme Pizza"){
            return 319.00;
        }
        if(foodItems == "Peppy Paneer Pizza"){
            return 289.00;
        }
        if(foodItems == "Extravaganzza Pizza"){
            return 339.00;
        }
        if(foodItems == "Garlic Breadsticks"){
            return 129.00;
        }
        if(foodItems == "Cheesy Garlic Bread"){
            return 149.00;
        }
        if(foodItems == "Potato Wedges"){
            return 99.00;
        }
        if(foodItems == "Choco Lava Cake"){
            return 149.00;
        }
        if(foodItems == "Coca Cola"){
            return 40.00;
        }
        if(foodItems == "Fanta"){
            return 40.00;
        }
        if(foodItems == "Sprite"){
            return 40.00;
        }
        else{
            System.out.println(foodItems + " not found");
        
		return 0.0;
        }
	}
		public static double takeOrder(String foodItems, int quantity){
		double price = takeOrder(foodItems);
        if (price > 0) {
			price *= quantity;
            System.out.println("Order placed for: "+foodItems+"of "+ quantity);
            return price;
		}
		else{
			 System.out.println("please select the item correctly!!");
		}
	return 0;
		}	
}
