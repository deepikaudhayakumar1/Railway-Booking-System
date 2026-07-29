package com.railway.booking.model;

public class Train {

    private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private int seatsAvailable;


    public Train(int trainNumber, String trainName,
                 String source, String destination,
                 int seatsAvailable) {

        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }


    public void displayTrain(){

        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Route : " + source + " -> " + destination);
        System.out.println("Seats Available: " + seatsAvailable);
    }


    public int getSeatsAvailable(){

        return seatsAvailable;
    }


    public int getTrainNumber(){

        return trainNumber;
    }


    public boolean bookSeat(){

        if(seatsAvailable > 0){

            seatsAvailable--;
            return true;
        }

        return false;
    }
}