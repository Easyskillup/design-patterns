package com.example.creational.abstractfactory;

import com.example.creational.abstractfactory.factory.CarFactory;
import com.example.creational.abstractfactory.factory.TruckFactory;
import com.example.creational.abstractfactory.factory.VehicleFactory;

/**
 *  Factory Method design pattern could be used to create objects related to a single family.
 *
 *  Abstract Factory Design Pattern is used to create families of related or dependent objects.
 *  It’s also sometimes called a factory of factories.
 */
public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        carFactory.createChasis().create();
        carFactory.createEngine().assemble();
        System.out.println();

        VehicleFactory truckFactory = new TruckFactory();
        truckFactory.createChasis().create();
        truckFactory.createEngine().assemble();
    }
}
