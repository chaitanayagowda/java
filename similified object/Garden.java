class Garden {
    String name;
    String location;
    double sizeInAcres;

    public boolean createGarden(String name, String location, double sizeInAcres) {
        boolean isGardenCreated = false;
        if (name != null && location != null && sizeInAcres > 0) {
            this.name = name;
            this.location = location;
            this.sizeInAcres = sizeInAcres;
            isGardenCreated = true;
        }
        return isGardenCreated;
    }

    public void displayGardenInfo() {
		System.out.println("---------------------------------------------");
        System.out.println("Garden Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Size (in acres): " + this.sizeInAcres);
		System.out.println("---------------------------------------------");
		
    }
}



