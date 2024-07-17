class Liberty{
static String name="liberty shoe shop";
static String userName="Thanuj Dalini";
static String brandNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int shoeIndex;
public static boolean addShoeBrands(String brandName){
boolean isAddShoeBrands=false;
if(brandNames!=null){
	brandNames[shoeIndex]=brandName;
	shoeIndex++;
	isAddShoeBrands=true;
}else{
	System.out.println("the given name not currect");
}
return isAddShoeBrands;
}
public static void getAllShoeBrands(){
	for(String brandNames:brandNames){
		System.out.println(brandNames);
	}
	return;
}
public static boolean updateShoeBrand(String oldname,String newName){
	System.out.println("the updateShoeBrand is start");
	boolean isupdateShoeBrand=false;
	for(int index=0;index<brandNames.length-1;index++){
		if(oldname==brandNames[index]){
			brandNames[index]=newName;
			isupdateShoeBrand=true;
		}
	}
	if(isupdateShoeBrand==false){
		System.out.println(oldname+"not found");
	}
	System.out.println("the updateShoeBrand is start");
	return isupdateShoeBrand;
}
}