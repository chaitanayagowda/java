class GoldShopRunner{
	
	
public static void main(String [] args){
System.out.println("the main started");


boolean isaddGoldNames=GoldShop.addGoldName("shoe");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("ring");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("braclet");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("earings");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("necklace");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("longchain");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("hair pin");
System.out.println("the gold names"+isaddGoldNames);

GoldShop.getgoldshop();
boolean isupdateGoldName=GoldShop.updateGoldName("shoe","goldring");
System.out.println("the gold names"+isupdateGoldName);

GoldShop.getgoldshop();
System.out.println("the main ended");

}
}