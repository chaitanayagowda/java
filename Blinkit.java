class Blinkit {
	public static double takeOrder(String item){
		if(item == "Groceries"){
            return 199.00;
        }
        if(item == "Dairy Products"){
            return 99.00;
        }
        if(item == "Fresh Vegetables"){
            return 69.00;
        }
        if(item == "Fruits"){
            return 119.00;
        }
        if(item == "Meat"){
            return 299.00;
        }
        if(item == "Bakery"){
            return 109.00;
        }
        if(item == "Beverages"){
            return 199.00;
        }
        if(item == "Snacks"){
            return 219.00;
        }
        if(item == "Personal Care"){
            return 259.00;
        }
        if(item == "Home Care"){
            return 109.00;
        }
        if(item == "Baby Care"){
            return 79.00;
        }
        if(item == "Pet Supplies"){
            return 169.00;
        }
        if(item == "Health and Wellness"){
            return 159.00;
        }
        if(item == "Stationery"){
            return 40.00;
        }
        if(item == "Electronics"){
            return 249.00;
        }
        if(item == "Household Essentials"){
            return 179.00;
        }
        else{
        System.out.println(item + " not found");
		}
        return 0.0;
	
    }
	public static double takeOrder(String item,int quantity){
		double price = 0;
		if(item == "Groceries"){
            price = 179.00*quantity;
		return price;
        }
        if(item == "Dairy Products"){
            price = 99.00*quantity;
		return price;
        }
        if(item == "Fresh Vegetables"){
            price = 69.00*quantity;
		return price;
        }
        if(item == "Fruits"){
           price = 119.00*quantity;
		return price;
        }
        if(item == "Meat"){
           price = 299.00*quantity;
		return price;
        }
        if(item == "Bakery"){
            price = 109.00*quantity;
		return price;
        }
        if(item == "Beverages"){
           price = 79.00*quantity;
		return price;
        }
        if(item == "Snacks"){
            price = 179.00*quantity;
		return price;
        }
        if(item == "Personal Care"){
            price = 239.00*quantity;
		return price;
        }
        if(item == "Home Care"){
            price = 109.00*quantity;
		return price;
        }
        if(item == "Baby Care"){
          price = 79.00*quantity;
		return price;
        }
        if(item == "Pet Supplies"){
           price = 169.00*quantity;
		return price;
        }
        if(item == "Health and Wellness"){
            price = 159.00*quantity;
		return price;
        }
        if(item == "Stationery"){
            price = 59.00*quantity;
		return price;
        }
        if(item == "Electronics"){
            price = 79.00*quantity;
		return price;
        }
        if(item == "Household Essentials"){
           price = 179.00*quantity;
		return price;
        }
        else{
        System.out.println(item + " not found");
		}
        return 0.0;
	
    }
	
	
	
	
	
	

}
