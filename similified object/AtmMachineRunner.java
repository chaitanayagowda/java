class AtmMachineRunner {

    public static void main(String[] args) {
        AtmMachine atm1 = new AtmMachine();
        if (atm1.createAtm("State Bank of India", "Mumbai", 20000)) {
            atm1.displayAtmInfo();
        }

        AtmMachine atm2 = new AtmMachine();
        if (atm2.createAtm("HDFC Bank", "Delhi", 25000)) {
            atm2.displayAtmInfo();
        }

        AtmMachine atm3 = new AtmMachine();
        if (atm3.createAtm("ICICI Bank", "Bengaluru", 30000)) {
            atm3.displayAtmInfo();
        }

        AtmMachine atm4 = new AtmMachine();
        if (atm4.createAtm("Axis Bank", "Chennai", 15000)) {
            atm4.displayAtmInfo();
        }

        AtmMachine atm5 = new AtmMachine();
        if (atm5.createAtm("Punjab National Bank", "Kolkata", 20000)) {
            atm5.displayAtmInfo();
        }

        AtmMachine atm6 = new AtmMachine();
        if (atm6.createAtm("Bank of Baroda", "Hyderabad", 25000)) {
            atm6.displayAtmInfo();
        }

        AtmMachine atm7 = new AtmMachine();
        if (atm7.createAtm("Canara Bank", "Pune", 20000)) {
            atm7.displayAtmInfo();
        }

        AtmMachine atm8 = new AtmMachine();
        if (atm8.createAtm("Union Bank of India", "Ahmedabad", 15000)) {
            atm8.displayAtmInfo();
        }

        AtmMachine atm9 = new AtmMachine();
        if (atm9.createAtm("IDBI Bank", "Jaipur", 20000)) {
            atm9.displayAtmInfo();
        }

        AtmMachine atm10 = new AtmMachine();
        if (atm10.createAtm("Kotak Mahindra Bank", "Lucknow", 30000)) {
            atm10.displayAtmInfo();
        }

        AtmMachine atm11 = new AtmMachine();
        if (atm11.createAtm("Yes Bank", "Nagpur", 25000)) {
            atm11.displayAtmInfo();
        }

        AtmMachine atm12 = new AtmMachine();
        if (atm12.createAtm("IndusInd Bank", "Indore", 15000)) {
            atm12.displayAtmInfo();
        }

        AtmMachine atm13 = new AtmMachine();
        if (atm13.createAtm("Federal Bank", "Bhopal", 20000)) {
            atm13.displayAtmInfo();
        }

        AtmMachine atm14 = new AtmMachine();
        if (atm14.createAtm("South Indian Bank", "Patna", 10000)) {
            atm14.displayAtmInfo();
        }

        AtmMachine atm15 = new AtmMachine();
        if (atm15.createAtm("Syndicate Bank", "Thiruvananthapuram", 15000)) {
            atm15.displayAtmInfo();
        }
    }
}