package Assignment3;

public class TravelBookingSystem_19 {
	   public void searchFlights() {
	        System.out.println("Searching for available flights...");
	        System.out.println("1. Flight from New York to London - Price: ₹37,500");
	        System.out.println("2. Flight from New York to Paris - Price: ₹33,750");
	        System.out.println("3. Flight from New York to Tokyo - Price: ₹50,000");
	    }

	    public void searchHotels() {
	        System.out.println("Searching for available hotels...");
	        System.out.println("1. Hotel A in New York - Price: ₹11,250 per night");
	        System.out.println("2. Hotel B in Paris - Price: ₹9,000 per night");
	        System.out.println("3. Hotel C in Tokyo - Price: ₹12,500 per night");
	    }

	    public void bookFlight(String flight) {
	        System.out.println("Booking the flight: " + flight);
	        System.out.println("Flight booked successfully!");
	    }

	    public void bookHotel(String hotel) {
	        System.out.println("Booking the hotel: " + hotel);
	        System.out.println("Hotel booked successfully!");
	    }

	    public void cancelFlight(String flight) {
	        System.out.println("Canceling the flight booking: " + flight);
	        System.out.println("Flight canceled successfully!");
	    }

	    public void cancelHotel(String hotel) {
	        System.out.println("Canceling the hotel booking: " + hotel);
	        System.out.println("Hotel canceled successfully!");
	    }

	    public static void main(String[] args) {
	        TravelBookingSystem_19 travelSystem = new TravelBookingSystem_19();
	        
	        travelSystem.searchFlights();
	        travelSystem.searchHotels();

	        travelSystem.bookFlight("Flight from New York to London");
	        travelSystem.bookHotel("Hotel A in New York");

	        travelSystem.cancelFlight("Flight from New York to London");
	        travelSystem.cancelHotel("Hotel A in New York");

	        System.out.println("\nAfter Cancellation:");
	        travelSystem.searchFlights();
	        travelSystem.searchHotels();
	    }
}
