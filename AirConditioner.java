class AirConditioner{
static boolean isConnected = false;
public static void onOrOff(){
System.out.println("on or off started:");
/false == false
if(isConnected = false){
isConnected = true;
System.out.println("AirConditioner is on");
}else if(isConnected ==true){
isConnected = false;
System.out.println("AirConditioner Turned off");
}
System.out.println("on or off ended:");
return;

}

public static void getDetails(){
System.out.println("Getting Details is started");
String productName = "Samsung";
int price = 