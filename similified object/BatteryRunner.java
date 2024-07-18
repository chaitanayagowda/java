class BatteryRunner {

    public static void main(String[] args) {
	
        Battery battery1 = new Battery();
        battery1.createBattery("Duracell", "AA", 2000, 1.5, false, 1.50);
        battery1.displayBatteryInfo();

        Battery battery2 = new Battery();
        battery2.createBattery("Energizer", "AAA", 1000, 1.5, false, 1.20);
        battery2.displayBatteryInfo();

        Battery battery3 = new Battery();
        battery3.createBattery("Panasonic", "C", 8000, 1.5, false, 2.00);
        battery3.displayBatteryInfo();

        Battery battery4 = new Battery();
        battery4.createBattery("Sony", "D", 12000, 1.5, false, 2.50);
        battery4.displayBatteryInfo();

        Battery battery5 = new Battery();
        battery5.createBattery("AmazonBasics", "9V", 600, 9.0, false, 1.75);
        battery5.displayBatteryInfo();

        Battery battery6 = new Battery();
        battery6.createBattery("Eneloop", "AA", 2000, 1.2, true, 3.00);
        battery6.displayBatteryInfo();

        Battery battery7 = new Battery();
        battery7.createBattery("Samsung", "18650", 3000, 3.7, true, 4.00);
        battery7.displayBatteryInfo();

        Battery battery8 = new Battery();
        battery8.createBattery("LG", "18650", 2500, 3.7, true, 3.50);
        battery8.displayBatteryInfo();

        Battery battery9 = new Battery();
        battery9.createBattery("Tesla", "21700", 4800, 3.7, true, 5.00);
        battery9.displayBatteryInfo();

        Battery battery10 = new Battery();
        battery10.createBattery("Apple", "Li-ion", 2800, 3.7, true, 8.00);
        battery10.displayBatteryInfo();

        Battery battery11 = new Battery();
        battery11.createBattery("Nokia", "Li-ion", 1500, 3.7, true, 4.50);
        battery11.displayBatteryInfo();

        Battery battery12 = new Battery();
        battery12.createBattery("Xiaomi", "Li-Po", 5000, 3.7, true, 6.00);
        battery12.displayBatteryInfo();

        Battery battery13 = new Battery();
        battery13.createBattery("Anker", "Li-ion", 10000, 3.7, true, 12.00);
        battery13.displayBatteryInfo();

        Battery battery14 = new Battery();
        battery14.createBattery("Tenergy", "NiMH", 2200, 1.2, true, 2.50);
        battery14.displayBatteryInfo();

        Battery battery15 = new Battery();
        battery15.createBattery("GP", "Alkaline", 1500, 1.5, false, 1.00);
        battery15.displayBatteryInfo();
    }
}
