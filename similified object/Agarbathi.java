class Agarbathi {
    String brandName;
    int qty;
    String fragrance;
    double price;
    String mgfDate;
    String expDate;

    public boolean createAgarbathi(String brandName, int qty, String fragrance, double price, String mgfDate, String expDate) {
        boolean isAgarbathiCreated = false;
        if (brandName != null && qty > 0 && fragrance != null && price > 0 && mgfDate != null && expDate != null) {
            this.brandName = brandName;
            this.qty = qty;
            this.fragrance = fragrance;
            this.price = price;
            this.mgfDate = mgfDate;
            this.expDate = expDate;
            isAgarbathiCreated = true;
        }
        return isAgarbathiCreated;
    }

    public void displayAgarbathiInfo() {
        System.out.println("---------------------------------------------");
        System.out.println("The Brand Name is: " + this.brandName);
        System.out.println("The quantity is: " + this.qty);
        System.out.println("The Fragrance is: " + this.fragrance);
        System.out.println("The Price is: " + this.price);
        System.out.println("The manufactured date is: " + this.mgfDate);
        System.out.println("The expiring date is: " + this.expDate);
        System.out.println("---------------------------------------------");
    }
}


