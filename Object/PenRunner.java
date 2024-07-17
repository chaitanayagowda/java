class PenRunner{

public static void main(String [] args){

Pen ref=new Pen();
ref.name="Reynolds";
ref.id=1;
ref.color="blue";
ref.price=10.00;


System.out.println("the brand name is:"+ref.name);

System.out.println("the brand id is:"+ref.id);


System.out.println("the pen color  is:"+ref.color);


System.out.println("the pen price is:"+ref.price);

System.out.println("");

Pen ref1=new Pen();
ref1.color="black";


System.out.println("the pen color is:"+ref1.color);

}
}