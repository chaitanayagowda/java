class BlinkitRunner{
    public static void main(String items[]){
	
	
        System.out.println("---The Items Available are----");
        double item = Blinkit.takeOrder("Groceries");
        System.out.println("Groceries: " + item);
        double item1 = Blinkit.takeOrder("Dairy Products");
        System.out.println("Dairy Products: " + item1);
        double item2 = Blinkit.takeOrder("Fresh Vegetables");
        System.out.println("Fresh Vegetables: " + item2);
        double item3 = Blinkit.takeOrder("Fruits");
        System.out.println("Fruits: " + item3);
        double item4 = Blinkit.takeOrder("Meat");
        System.out.println("Meat: " + item4);
        double item5 = Blinkit.takeOrder("Bakery");
        System.out.println("Bakery: " + item5);
        double item6 = Blinkit.takeOrder("Beverages");
        System.out.println("Beverages: " + item6);
        double item7 = Blinkit.takeOrder("Snacks");
        System.out.println("Snacks: " + item7);
        double item8 = Blinkit.takeOrder("Personal Care");
        System.out.println("Personal Care: " + item8);
        double item9 = Blinkit.takeOrder("Home Care");
        System.out.println("Home Care: " + item9);
        double item10 = Blinkit.takeOrder("Baby Care");
        System.out.println("Baby Care: " + item10);
        double item11 = Blinkit.takeOrder("Pet Supplies");
        System.out.println("Pet Supplies: " + item11);
        double item12 = Blinkit.takeOrder("Health");
        System.out.println("Health and Wellness: " + item12);
        double item13 = Blinkit.takeOrder("Stationery");
        System.out.println("Stationery: " + item13);
        double item14 = Blinkit.takeOrder("Electronics");
        System.out.println("Electronics: " + item14);
        double item15 = Blinkit.takeOrder("Household Essentials");
        System.out.println("Household Essentials: " + item15);
        System.out.println("---End of list---");
		double item16 = Blinkit.takeOrder("Meat",3);
        System.out.println("Meat: " + item16);
		double item17 = Blinkit.takeOrder("Beverages",4);
        System.out.println("Beverages: " + item17);
		
    
	
	
	
	
	
	
	}


}
