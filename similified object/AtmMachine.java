class AtmMachine {
    String bankName;
    String location;
    int withdrawalLimit;

    public boolean createAtm(String bankName, String location, int withdrawalLimit) {
        boolean isAtmCreated = false;
        if (bankName != null && location != null && withdrawalLimit > 0) {
            this.bankName = bankName;
            this.location = location;
            this.withdrawalLimit = withdrawalLimit;
            isAtmCreated = true;
        }
        return isAtmCreated;
    }

    public void displayAtmInfo() {
        System.out.println("---------------------------------------------");
        System.out.println("Bank Name: " + this.bankName);
        System.out.println("Location: " + this.location);
        System.out.println("Withdrawal Limit: Rs." + this.withdrawalLimit);
        System.out.println("---------------------------------------------");
    }
}


