class ChatShopRunner{
public static void main(String[] Chat){
boolean isAdd=ChatShop.createChatName("Pani puri");
System.out.println("The added chat are:"+isAdd);
boolean isPrice=ChatShop.addChatPrices(40.0);
System.out.println("The added chat are:"+isPrice);



boolean isAdd=ChatShop.createChatName("Masala puri");
System.out.println("The added chat are:"+isAdd);
boolean isAdd=ChatShop.createChatName("Tikki Puri");
System.out.println("The added chat are:"+isAdd);
boolean isAdd=ChatShop.createChatName("Sev Puri");
System.out.println("The added chat are:"+isAdd);
boolean isAdd=ChatShop.createChatName("Dahi Puri");
System.out.println("The added chat are:"+isAdd);
boolean isAdd=ChatShop.createChatName("Dahi Samosa");
System.out.println("The added chat are:"+isAdd);

ChatShop.getChatShopName();
chatShop.getChatprice();

System.out.println("Is Chat Name updated :" +chatNameUpdated);
ChatShop.Updated();
	
}
}