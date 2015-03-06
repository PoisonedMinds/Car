

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
        String make,model,colour;
        int price,year,yearbought;
        Car car3 = new Car();
        make=JOptionPane.showInputDialog("input the make of the first car");
        model=JOptionPane.showInputDialog("input the model of the first car");
        colour=JOptionPane.showInputDialog("input the colour of the first car");
        price=Integer.parseInt(JOptionPane.showInputDialog("input the price of the first car"));
        year=Integer.parseInt(JOptionPane.showInputDialog("input the year of the first car"));
        yearbought=Integer.parseInt(JOptionPane.showInputDialog("input the year when the first car was bought"));
        Car car1 = new Car(make,model,colour,price,year,yearbought);
        make=JOptionPane.showInputDialog("input the make of the second car");
        model=JOptionPane.showInputDialog("input the model of the second car");
        colour=JOptionPane.showInputDialog("input the colour of the second car");
        year=Integer.parseInt(JOptionPane.showInputDialog("input the year of the second car"));
        Car car2 = new Car(make,model,colour,year);
        JOptionPane.showMessageDialog(null,car1.toString());
        JOptionPane.showMessageDialog(null,car2.toString());
        JOptionPane.showMessageDialog(null,car3.toString());
        car1.Honk();

    }

}
