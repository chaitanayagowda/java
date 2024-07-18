class Battery {
    String brand;
    String type;
    int capacity;
    double voltage;
    boolean rechargeable;
    double price;

    public boolean createBattery(String brand, String type, int capacity, double voltage, boolean rechargeable, double price) {
        boolean isBatteryCreated = false;
        if (brand != null && type != null && capacity > 0 && voltage > 0 && price > 0) {
            this.brand = brand;
            this.type = type;
            this.capacity = capacity;
            this.voltage = voltage;
            this.rechargeable = rechargeable;
            this.price = price;
            isBatteryCreated = true;
        }
        return isBatteryCreated;
    }

    public void displayBatteryInfo() {
		System.out.println("---------------------------------------------");
        System.out.println("The Battery Brand is: " + this.brand);
        System.out.println("The Type is: " + this.type);
        System.out.println("The Capacity is: " + this.capacity + " mAh");
        System.out.println("The Voltage is: " + this.voltage + " V");
        System.out.println("Rechargeable: " + this.rechargeable);
        System.out.println("The Price is: Rs." + this.price);
		System.out.println("---------------------------------------------");
    }
}