class Resort{
int id;
String areaSft;
String name;
String ownerName;
String noOfRooms;

public boolean createResort(int id, String areaSft, String name, String ownerName,String noOfRooms){
	boolean isResortOpen = false;
	if(id>0&& areaSft!=null && name!=null && ownerName!=null && noOfRooms!=null){
		this.id =id;
		this.areaSft = areaSft;
		this.name = name;
		this.ownerName = ownerName;
		this.noOfRooms = noOfRooms;
		isResortOpen = true;
		
	}
	
return isResortOpen;
}
public void displayResortInfo(){
	System.out.println("The Resort Id is:" +this.id);
	System.out.println("The Resort area in squarefeet is:" +this.areaSft);
	System.out.println("The Resort Name is:" +this.name);
	System.out.println("The Resort Owner Name is:" +this.ownerName);
	System.out.println("Number of Rooms in Resort is:" +this.noOfRooms);
	
	
}

}