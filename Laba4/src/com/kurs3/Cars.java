package com.kurs3;

import java.util.ArrayList;
import java.util.Arrays;

public class Cars {
ArrayList<Car> list2;

    public Cars() {
        this.list2 = new ArrayList<>();
    }

    public Cars(int length) {
        this.list2 = new ArrayList<>(length);
    }

    public void addToList(Car car)
    {
        list2.add(car);
    }

    public Cars getWithModelAndColor(String model, String color) {
        Cars sublist = new Cars();
        for (Car car : this.list2) {
            if (car.model.equals(model) && car.color.equals(color))
                sublist.addToList(car);
        }
        return sublist;
    }

    public ArrayList<Car> deleteWithRegNum(String registrationNumber) {
        this.list2.remove(registrationNumber);
        return this.list2;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "list2=" + list2 +
                '}';
    }
}
