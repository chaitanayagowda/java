class SwiggyRunner{
	public static void main(String orders[]){
		System.out.println("---The Items Available are----");
		double item = Swiggy.takeOrder("Pizza");
		System.out.println("Pizza:" +item);
		double item1 = Swiggy.takeOrder("Burger");
		System.out.println("Burger:" +item1);
		double item2 = Swiggy.takeOrder("FrenchFries");
		System.out.println("FrenchFries:" +item2);
		double item3 = Swiggy.takeOrder("OreoMilkShake");
		System.out.println("OreoMilkShake:" +item3);
		double item4 = Swiggy.takeOrder("Biriyani");
		System.out.println("Biriyani:" +item4);
		double item5 = Swiggy.takeOrder("Momos");
		System.out.println("Momos:" +item5);
		double item6 = Swiggy.takeOrder("Panner65");
		System.out.println("Panner65:" +item6);
		double item7 = Swiggy.takeOrder("mushroom65");
		System.out.println("mushroom65:" +item7);
		double item8 = Swiggy.takeOrder("pannerpeperdry");
		System.out.println("pannerpeperdry:" +item8);
		double item9 = Swiggy.takeOrder("MasalaDosa");
		System.out.println("MasalaDosa:" +item9);
		double item10 = Swiggy.takeOrder("idliVada");
		System.out.println("idliVada:" +item10);
		double item11 = Swiggy.takeOrder("ChikenRoll");
		System.out.println("ChikenRoll:" +item11);
		double item12 = Swiggy.takeOrder("moBurger");
		System.out.println("moBurger:" +item12);
		double item13 = Swiggy.takeOrder("MasalaCoke");
		System.out.println("MasalaCoke:" +item13);
		double item14 = Swiggy.takeOrder("KFCWings");
		System.out.println("KFCWings:" +item14);
		double item15 = Swiggy.takeOrder("IceCream");
		System.out.println("IceCream:" +item15);
		System.out.println("---End of list---");
		double item17 = Swiggy.takeOrder("Pizza",3);
		System.out.println("Pizza:" +item17);
		double item18 = Swiggy.takeOrder("pannerpeperdry",5);
		System.out.println("pannerpeperdry:" +item18);

	
	}



}