class GoldShop{
static String name="newShop";
static String userName="Amulya";
static String goldNames[]={null,null,null,null,null,null,null};
static int index;
public static boolean  addGoldName(String goldName){
   boolean isAddGoldNames=false;
   if(goldNames!=null){
   goldNames[index]=goldName;
   index++;
   isAddGoldNames=true;
   }else{
   System.out.println("the given name is not currect ,give currect name");
   }
   return isAddGoldNames;
}
public static void getgoldshop(){
	for(String goldNames:goldNames){
		System.out.println(goldNames);
	}
	return;
}
public static boolean updateGoldName(String oldName,String newName){
	System.out.println("the updateGoldName started");
	boolean isupdateGoldName=false;
	for(int index=0;index<goldNames.length-1;index++){
		if(oldName==goldNames[index]){
			goldNames[index]=newName;
			isupdateGoldName=true;
		}
	}
	if(isupdateGoldName==false){
		System.out.println(oldName+ "not foumd");
	}
	return isupdateGoldName;
}

}