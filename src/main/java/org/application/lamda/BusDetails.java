package org.application.lamda;

// If an interface has only one abstract method it is called as functional interface.
//In that case as best practise, add the @FunctionalInterFace so compiler enforce that this interface has one
//abstract method.
//When an Interface has only one Abstract method, it is called "SAM interface" (Single Abstract Method)

@FunctionalInterface
public interface BusDetails {

    //abstract method
    String printBus(String brand);

}
