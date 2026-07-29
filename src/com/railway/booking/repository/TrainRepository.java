package com.railway.booking.repository;

import com.railway.booking.model.Train;
import java.util.ArrayList;
import java.util.List;

public class TrainRepository {

    private List<Train> trains;

    public TrainRepository() {
        trains = new ArrayList<>();
    }


    // Save train
    public void save(Train train) {
        trains.add(train);
    }


    // Find train by train number
    public Train findByTrainNumber(int trainNumber) {

        for(Train train : trains) {

            if(train.getTrainNumber() == trainNumber) {
                return train;
            }
        }

        return null;
    }


    // Get all trains
    public List<Train> findAll() {
        return trains;
    }


    // Delete train
    public boolean delete(int trainNumber) {

        Train train = findByTrainNumber(trainNumber);

        if(train != null) {
            trains.remove(train);
            return true;
        }

        return false;
    }
}