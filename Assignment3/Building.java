package Assignment3;

public class Building {
	// Base class

	    String address;
	    int numberOfFloors;
	    double totalArea;

	    // Constructor for Building
	    public Building(String address, int numberOfFloors, double totalArea) {
	        this.address = address;
	        this.numberOfFloors = numberOfFloors;
	        this.totalArea = totalArea;
	    }

	    // Method to display building details
	    public void displayDetails() {
	        System.out.println("Address: " + address);
	        System.out.println("Number of Floors: " + numberOfFloors);
	        System.out.println("Total Area: " + totalArea + " sq. meters");
	    }
	}

	// Subclass for ResidentialBuilding
	class ResidentialBuilding extends Building {
	    int numberOfApartments;
	    double rentPerApartment;

	    // Constructor for ResidentialBuilding
	    public ResidentialBuilding(String address, int numberOfFloors, double totalArea, int numberOfApartments, double rentPerApartment) {
	        super(address, numberOfFloors, totalArea);
	        this.numberOfApartments = numberOfApartments;
	        this.rentPerApartment = rentPerApartment;
	    }

	    // Method to calculate total rent
	    public double calculateTotalRent() {
	        return numberOfApartments * rentPerApartment;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Number of Apartments: " + numberOfApartments);
	        System.out.println("Rent per Apartment: " + rentPerApartment);
	        System.out.println("Total Rent: " + calculateTotalRent());
	    }
	}

	// Subclass for CommercialBuilding
	class CommercialBuilding extends Building {
	    double officeSpace; // in sq. meters
	    double rentPerSqMeter;

	    // Constructor for CommercialBuilding
	    public CommercialBuilding(String address, int numberOfFloors, double totalArea, double officeSpace, double rentPerSqMeter) {
	        super(address, numberOfFloors, totalArea);
	        this.officeSpace = officeSpace;
	        this.rentPerSqMeter = rentPerSqMeter;
	    }

	    // Method to calculate total rent
	    public double calculateTotalRent() {
	        return officeSpace * rentPerSqMeter;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Office Space: " + officeSpace + " sq. meters");
	        System.out.println("Rent per Sq. Meter: " + rentPerSqMeter);
	        System.out.println("Total Rent: " + calculateTotalRent());
	    }
	}

	// Main class to test the program
	 class BuildingTest {
	    public static void main(String[] args) {
	        // Create a ResidentialBuilding instance
	        ResidentialBuilding residential = new ResidentialBuilding("123 Maple Street", 5, 1200.0, 10, 500.0);
	        System.out.println("Residential Building Details:");
	        residential.displayDetails();

	        System.out.println();

	        // Create a CommercialBuilding instance
	        CommercialBuilding commercial = new CommercialBuilding("456 Oak Avenue", 8, 3000.0, 2000.0, 50.0);
	        System.out.println("Commercial Building Details:");
	        commercial.displayDetails();
	    }
	}

