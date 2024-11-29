package Assignment3;

class Building25 {
    String address;
    int numberOfFloors;
    double totalArea;

    public Building25(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    public void displayDetails() {
        System.out.println("Address: " + address + ", Floors: " + numberOfFloors + ", Area: " + totalArea + " sq.m.");
    }
}

class ResidentialBuilding25 extends Building25 {
    int numberOfApartments;
    double rentPerApartment;

    public ResidentialBuilding25(String address, int numberOfFloors, double totalArea, int numberOfApartments, double rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Apartments: " + numberOfApartments + ", Rent/Apartment: ₹" + rentPerApartment);
    }
}

class CommercialBuilding25 extends ResidentialBuilding25 {
    double officeSpace;
    double rentPerSquareMeter;

    public CommercialBuilding25(String address, int numberOfFloors, double totalArea, int numberOfApartments, double rentPerApartment, double officeSpace, double rentPerSquareMeter) {
        super(address, numberOfFloors, totalArea, numberOfApartments, rentPerApartment);
        this.officeSpace = officeSpace;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }

    public double calculateTotalRent() {
        return officeSpace * rentPerSquareMeter;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Office Space: " + officeSpace + " sq.m., Rent/sq.m: ₹" + rentPerSquareMeter);
    }

    public static void main(String[] args) {
        CommercialBuilding25 commercialBuilding = new CommercialBuilding25("456 Business Ave.", 15, 10000, 50, 15000, 5000, 50);
        System.out.println("Commercial Building:");
        commercialBuilding.displayDetails();
        System.out.println("Total Rent: ₹" + commercialBuilding.calculateTotalRent());
    }
}
