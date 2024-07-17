class ChatShop{
static String name="Sri Sai ChatShop";
static String ownerName="Chat Lover";
static String chatNames[]={null , null, null, null,null, null};
static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
static int chatsindex;
static int priceindex;


public static boolean createChatName(String chatName){
boolean isChatName=true;
System.out.println("createChatName started");
if(ChatName!=null){
chatNames[chatsindex]=chatName;
chatsindex++;
isChatName=true;
System.out.println("createChatName ended");
}
else{
System.out.println("chat name is null, cann't be created add current name");
}
return isChatName;
}

public static boolean addChatPrices(String [] price){
	boolean isChatPrices=false;
	System.out.println("The addchatprice started");
	if(chatPrice>0.0){
		chatPrice[priceindex]=chatPrice;
		priceindex++;

		System.out.println("The addchatprice ended");
	}
	else{
		System.out.println("chat price is null");
	}
	return ischatPrice;
}
public static boolean updateChatName(String [] newname);{
	boolean isChatNameUpdated=false;
	System.out.println("The updateChatName started");
	 for(int index=0;index<chatName.length;index++){
		 if(oldChatName==chatNames[index]){
			 chatName[index]=newChatName;
			 isChatNameUpdated=true;
		 }
	 }
	 if(isChatNameUpdated==false){
		 System.out.println(oldChatName+"not found");
	 }
	
		System.out.println("The updateChatName ended");
		return isupdateChatName;

	
}

public static boolean getChatprice()
{
	for(double chatName:chatPrices)
	{
		System.out.println("chatPrices");
	}
}


public static void getChatShopName(){
for(String chatName:chatNames){
System.out.println(chatName);
}

return;

}








}
public static boolean updateChatName(String oldChatName, String newChatName){
	System.out.println("updateChatName started");
	boolean isChatNameUpdated = false;
for(int index= 0; index<chatNames.length;index++ ){
	if(oldChatName == chatNames[index]){
		chatNames[index] = newChatName;
		isChatNameUpdated = true;
	}
}
if(isChatNameUpdated == false){
System.out.println(oldChatName + "not found");
}
System.out.println("updateChatName ended");
return isChatNameUpdated;
}
}