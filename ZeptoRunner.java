class ZeptoRunner {
    public static void main(String orders[]) {
        System.out.println("---The Items Available at Zepto are----");
        double item = Zepto.takeOrder("Kurkure");
        System.out.println("Kurkure: Rs" + item);
        double item1 = Zepto.takeOrder("Apple Juice");
        System.out.println("Apple Juice: Rs" + item1);
        double item2 = Zepto.takeOrder("Cheese Slices");
        System.out.println("Cheese Slices: Rs" + item2);
        double item3 = Zepto.takeOrder("Chocolate Box");
        System.out.println("Chocolate Box: Rs" + item3);
        double item4 = Zepto.takeOrder("Amul Butter");
        System.out.println("Amul Butter: Rs" + item4);
        double item5 = Zepto.takeOrder("Banana");
        System.out.println("Banana: Rs" + item5);
        double item6 = Zepto.takeOrder("Milk");
        System.out.println("Milk: Rs" + item6);
        double item7 = Zepto.takeOrder("Bread");
        System.out.println("Bread: Rs" + item7);
        double item8 = Zepto.takeOrder("Eggs");
        System.out.println("Eggs: Rs" + item8);
        double item9 = Zepto.takeOrder("Peanut Butter");
        System.out.println("Peanut Butter: Rs" + item9);
        double item10 = Zepto.takeOrder("Yogurt");
        System.out.println("Yogurt: Rs" + item10);
        double item11 = Zepto.takeOrder("Instant Noodles");
        System.out.println("Instant Noodles: Rs" + item11);
        double item12 = Zepto.takeOrder("Cereal");
        System.out.println("Cereal: Rs" + item12);
        double item13 = Zepto.takeOrder("Ice Cream");
        System.out.println("Ice Cream: Rs" + item13);
        double item14 = Zepto.takeOrder("Chips");
        System.out.println("Chips: Rs" + item14);
        System.out.println("---End of list---");
		double item16= Zepto.takeOrder("Kurkure",5);
        System.out.println("Kurkure: Rs" + item16);
    }
}
