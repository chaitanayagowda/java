class FoodPandaRunner{
    public static void main(String orders[]){
		
		
        System.out.println("---The Items Available at FoodPanda are----");
        double item = FoodPanda.takeOrder("Butter Chicken");
        System.out.println("Butter Chicken: " + item);
        double item1 = FoodPanda.takeOrder("Tikka Masala");
        System.out.println("Tikka Masala: " + item1);
        double item2 = FoodPanda.takeOrder("Caesar Salad");
        System.out.println("Caesar Salad: " + item2);
        double item3 = FoodPanda.takeOrder("Greek Salad");
        System.out.println("Greek Salad: " + item3);
        double item4 = FoodPanda.takeOrder("Beef Tacos");
        System.out.println("Beef: " + item4);
        double item5 = FoodPanda.takeOrder("Chicken Tacos");
        System.out.println("Chicken Tacos: " + item5);
        double item6 = FoodPanda.takeOrder("Fish Tacos");
        System.out.println("Fish Tacos: " + item6);
        double item7 = FoodPanda.takeOrder("Ice Cream");
        System.out.println("Ice Cream: " + item7);
        double item8 = FoodPanda.takeOrder("Sashimi");
        System.out.println("Sashimi: " + item8);
        double item9 = FoodPanda.takeOrder("California Roll");
        System.out.println("California Roll: " + item9);
        double item10 = FoodPanda.takeOrder("Chicken");
        System.out.println("Chicken: " + item10);
        double item11 = FoodPanda.takeOrder("Beef with Broccoli");
        System.out.println("Beef: " + item11);
        double item12 = FoodPanda.takeOrder("Club Sandwich");
        System.out.println("Club Sandwich: " + item12);
        double item13 = FoodPanda.takeOrder("Cake");
        System.out.println("Cake: " + item13);
        double item14 = FoodPanda.takeOrder("Pastry");
        System.out.println("Pastry: " + item14);
        double item15 = FoodPanda.takeOrder("Cookie");
        System.out.println("Cookie: " + item15);
        System.out.println("---End of list---");
		 double item = FoodPanda.takeOrder("Butter Chicken",6);
        System.out.println("Butter Chicken: " + item);
        double item1 = FoodPanda.takeOrder("Tikka Masala",4);
        System.out.println("Tikka Masala: " + item1);
    }
}
