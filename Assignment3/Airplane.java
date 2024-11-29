package Assignment3;

import java.time.LocalTime;

class Airplane {
    String flightNumber;
    String destination;
    LocalTime scheduledDeparture;
    LocalTime actualDeparture;

    public Airplane(String flightNumber, String destination, String scheduledDeparture) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduledDeparture = LocalTime.parse(scheduledDeparture);
        this.actualDeparture = null;
    }

    public void showFlightStatus() {
        if (actualDeparture == null) {
            System.out.println("Flight " + flightNumber + " to " + destination + " is scheduled to depart at " + scheduledDeparture);
        } else {
            System.out.println("Flight " + flightNumber + " to " + destination + " has departed at " + actualDeparture);
        }
    }

    public void checkDelay() {
        if (actualDeparture == null) {
            System.out.println("Flight " + flightNumber + " has not yet departed.");
        } else {
            long delayMinutes = java.time.Duration.between(scheduledDeparture, actualDeparture).toMinutes();
            if (delayMinutes > 0) {
                System.out.println("Flight " + flightNumber + " was delayed by " + delayMinutes + " minutes.");
            } else {
                System.out.println("Flight " + flightNumber + " departed on time.");
            }
        }
    }

    public void setActualDeparture(String time) {
        this.actualDeparture = LocalTime.parse(time);
    }

    public static void main(String[] args) {
        Airplane plane1 = new Airplane("AB123", "London", "08:00");
        Airplane plane2 = new Airplane("CD456", "Paris", "10:30");

        plane1.showFlightStatus();
        plane2.showFlightStatus();

        plane1.setActualDeparture("08:15");
        plane2.setActualDeparture("10:30");

        plane1.checkDelay();
        plane2.checkDelay();
    }
}

