package com.railway.booking.service;

import com.railway.booking.model.Train;
import com.railway.booking.repository.TrainRepository;

import java.util.List;


public class TrainService {


    private TrainRepository trainRepository;


    public TrainService(){

        trainRepository = new TrainRepository();

    }



    // Add Train
    public void addTrain(Train train){

        trainRepository.save(train);

        System.out.println("Train Added Successfully");

    }



    // Display All Trains
    public void displayAllTrains(){


        List<Train> trains = trainRepository.findAll();


        if(trains.isEmpty()){

            System.out.println("No trains available");
            return;
        }


        for(Train train : trains){

            System.out.println("--------------------");
            train.displayTrain();

        }

    }



    // Search Train
    public Train searchTrain(int trainNumber){


        return trainRepository.findByTrainNumber(trainNumber);

    }

}