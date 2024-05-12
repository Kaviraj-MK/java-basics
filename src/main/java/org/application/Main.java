package org.application;

import org.application.lamda.BusDetails;
import org.application.lamda.Car;
import org.application.lamda.CarDetails;
import static org.application.lamda.CarDetails.printAnother;
import static org.application.lamda.Printable.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      (1)  Normal Interface Usage.
        Car bmw = new Car();
        bmw.printCar();
        System.out.println();

//      (2) Here we use the static method and pass the benz Car object to the method.
//      Here printer methods calls the "CarDetails interface object" as its parameter. Then using that parameter,
//      printer() calls the printCar method in the interface. (carDetails.printCar()). here we instantiate the car
//      object.
        Car benz = new Car();
        printer(benz);
        System.out.println();


        Car audi = new Car();
//        (3) Here we didn't use any object passing to static method,
//        Instead of that, we created object of an interface and assign it to lambda function.
//        then we send that interface object to the method.
//        Here what we do is instead of doing action using an object, doing the action itself directly.
//        (Interface object is not considered as Car object)
        CarDetails lambdaCar = () -> System.out.println("All Car is yellow!!");
        allCarPrinter(lambdaCar);
        System.out.println();
        /**we can use below implementation instead of above impls.
         *
         * allCarPrinter(() -> System.out.println("All Car is red!!"));
         *
         * */

//        (4) Lambdas with parameters.
        BusDetails lambdaBus = b -> "Bus is " + b;
        String printBusDetails = allBusPrinter(lambdaBus);
        System.out.println(printBusDetails);
//        When you have two parameters and more than one implementation, here's the lambda implementation block goes
        /**
         * BusDetails busdetails = (b1, b2) -> {
         *     String buss = b1 + " " + b2;
         *     System.out.println("All bus details are as below.");
         *     return "Busses types are " + buss;
         * };
         * */

        System.out.println();
        printAnother();


        /**YOU CAN CREATE LAMBDA EXPRESSION IF YOU HAVE "!!!ONLY!!!" A FUNCTIONAL INTERFACE*/

        /*You can do lambda expressions for interfaces which have multiple abstract methods using anonymous classes.*/
    }
}