package org.application.lamda;

public class Printable {

    private Printable() {}

//    Static Method we use for print
    public static void printer(CarDetails car) {
        System.out.println("Printing Benz Using Static method");
        /**Since we implement Car.java from CarDetails.java, we can simply
         * use car object here by calling parameter*/
        car.printCar();
    }

    public static void allCarPrinter(CarDetails carDetails) {
        carDetails.printCar();
    }

    public static String allBusPrinter (BusDetails busDetails) {
        return busDetails.printBus("Volvo");
    }

}
