package cartester;

import javax.swing.*;

/**
 * @title CarTester
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 4-Mar-2015 12:59:59 PM
 * @purpose The purpose of this program is to output info about cars
 */
public class CarTester {

    public static void main(String[] args) {
        String make, model, colour;
        int price, year, yearbought;
        //make one new object using default data 
        Car car3 = new Car();
        //get data from user to construct an object
        make = JOptionPane.showInputDialog("input the make of the first car");
        model = JOptionPane.showInputDialog("input the model of the first car");
        colour = JOptionPane.showInputDialog("input the colour of the first car");
        price = Integer.parseInt(JOptionPane.showInputDialog("input the price of the first car"));
        year = Integer.parseInt(JOptionPane.showInputDialog("input the year of the first car"));
        yearbought = Integer.parseInt(JOptionPane.showInputDialog("input the year when the first car was bought"));
        //create second object useing data from the user
        Car car1 = new Car(make, model, colour, price, year, yearbought);
        //get some data to construct an objecct using half default and half user data
        make = JOptionPane.showInputDialog("input the make of the second car");
        model = JOptionPane.showInputDialog("input the model of the second car");
        colour = JOptionPane.showInputDialog("input the colour of the second car");
        year = Integer.parseInt(JOptionPane.showInputDialog("input the year of the second car"));
        Car car2 = new Car(make, model, colour, year);
        //call method on the 3 objects to output their info
        JOptionPane.showMessageDialog(null, car1.toString());
        JOptionPane.showMessageDialog(null, car2.toString());
        JOptionPane.showMessageDialog(null, car3.toString());
        //call method on car1 to make the car "honk"
        car1.Honk();

    }

}
