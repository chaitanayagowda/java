class MilkShakesShopRunning{
public static void main(String [] fruits){

boolean isAdd=MilkShakesShops.createFruiteName("Mango Milkshake");
System.out.println("the added fruits are:"+isAdd);
boolean isprice=MilkShakesShops.addFruitsprice(200.00);
System.out.println("the added fruits are:"+isprice);
isAdd=MilkShakesShops.createFruiteName("Oreo Milkshake");
System.out.println("the added fruits are:"+isAdd);
isprice=MilkShakesShops.addFruitsprice(100.00);
System.out.println("the added fruits are:"+isprice);
isAdd=MilkShakesShops.createFruiteName("Orange");
System.out.println("the added fruits are:"+isAdd);
isprice=MilkShakesShops.addFruitsprice(50.00);
System.out.println("the added fruits are:"+isprice);
isAdd=MilkShakesShops.createFruiteName("Strawberry Milkshake");
System.out.println("the added fruits are:"+isAdd);
isprice=MilkShakesShops.addFruitsprice(300.00);
System.out.println("the added fruits are:"+isprice);
isAdd=MilkShakesShops.createFruiteName("pomagranet Milkshake");
System.out.println("the added fruits are:"+isAdd);
isprice=MilkShakesShops.addFruitsprice(240.00);
System.out.println("the added fruits are:"+isprice);
isAdd=MilkShakesShops.createFruiteName("all fruits");
System.out.println("the added fruits are:"+isAdd);
isprice=MilkShakesShops.addFruitsprice(1000.00);
System.out.println("the added fruits are:"+isprice);

boolean isupdates=MilkShakesShops.updatesFruitsName("Strawberry Milkshake","Chocolate Milkshake");
boolean isupdates1=MilkShakesShops.updatesFruitsName("Orange","Pineapple");
boolean isupdates2=MilkShakesShops.updatesFruitsName("pomagranet Milkshake","Dry fruit");

System.out.println("the updatesFruitsName are:"+isupdates);
MilkShakesShops.getFruitsName();
MilkShakesShops.getFruitsprice();
}


}