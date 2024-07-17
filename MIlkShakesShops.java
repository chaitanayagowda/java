class MilkShakesShops{

static String name="Milky wayShop";
static String ownername="Sanchit";
static String fruitsnames[]={null,null,null,null,null,null};
static double fruitsprices[]={0.0,0.0,0.0,0.0,0.0,0.0};
static int fruitsindex;
static int fruitspriceindex;

public static boolean createFruiteName(String fruitsname){
 boolean isfruiteName=false;
 System.out.println("the createFruiteName method started");
 if(fruitsname!=null){
 fruitsnames[fruitsindex]=fruitsname;
 fruitsindex++;
 isfruiteName=true;
 }else{
 System.out.println("the fruits name null,can not be created,add currect name");
 }
return isfruiteName;
}
public static boolean addFruitsprice(double fruitsprice){
	System.out.println("the addFruitsprice started");
	boolean isaddFruitsprice=false;
	if(fruitsprice>0.0){
		fruitsprices[fruitspriceindex]=fruitsprice;
		fruitspriceindex++;
		
	}else{
		System.out.println("the fruits price are not currect");
	}
	System.out.println("the addFruitsprice ended");
	return isaddFruitsprice;
}
public static void getFruitsName(){
	for(String fruitsnames:fruitsnames){
	System.out.println(fruitsnames);
	}
	
	return ;
}
public static void getFruitsprice(){
	for(double fruitsprices:fruitsprices){
		System.out.println(fruitsprices);
	}
	return;
}
public static boolean updatesFruitsName(String oldName,String newname){
	System.out.println("the updatesFruitsName is started");
	boolean isfruiteNameupdates=false;
	for(int index=0;index<fruitsnames.length-1;index++){
		if(oldName==fruitsnames[index]){
			fruitsnames[index]=newname;
			isfruiteNameupdates=true;
		}
	}
	if(isfruiteNameupdates==false){
		System.out.println(oldName+"not found");
	}
	System.out.println("the updatesFruitsName is ended");
	return isfruiteNameupdates;
}

}