/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

import javax.swing.JOptionPane;

/**
 * @title Car
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 4-Mar-2015 12:59:59 PM
 * @purpose The purpose of this program is to create objects that model cars
 */
public class Car {

    //first constructor that uses all default data

    private String make2, model2, colour2;
    private int price2, year2, yearbought2;

    public Car() {
        make2 = "unknown";
        model2 = "unknown";
        colour2 = "unknown";
        price2 = 0;
        year2 = 0;
        yearbought2 = 0;
    }

    public Car(String make, String model, String colour, int price, int year, int yearbought) {
        //second constructor uses all user defined data
        make2 = make;
        model2 = model;
        colour2 = colour;
        price2 = price;
        year2 = year;
        yearbought2 = yearbought;
    }

    public Car(String make, String model, String colour, int year) {
        //thrid constructor uses half user data and half default data
        make2 = make.toUpperCase();
        model2 = model;
        colour2 = colour;
        if ((make2.equals("BMW")) || (make2.equals("PORSCHE")) || (make2.equals("JAGUAR")) || (make2.equals("MERCEDES BENZ")) || (make2.equals("BENTLEY")) || (make2.equals("ROLLS ROYCE")) || (make2.equals("BUGATTI"))) {
            price2 = 130000;
        } else {
            price2 = 30000;
        }
        year2 = year;
        yearbought2 = 0;
    }

    public String toString() {
        //method to output the data from the object created by one of the above constructors
        String output;
        if (yearbought2 != 0) {
            output = "A " + colour2 + " " + year2 + " " + make2 + " " + model2 + " was worth " + price2 + " when it was bought in " + yearbought2 + ".";
        } else if (year2 != 0) {
            output = "A " + colour2 + " " + year2 + " " + make2 + " " + model2 + " is worth " + price2 + ".";
        } else {
            output = "A black HONDA Civic is worth $15750.";
        }
        return output;
    }

    public void Honk() {
        //method to make a 'car' honk
        JOptionPane.showMessageDialog(null, "Beep beep!");
    }
}
