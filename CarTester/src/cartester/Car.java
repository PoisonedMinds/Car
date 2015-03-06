/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

import javax.swing.JOptionPane;

/**
 *
 * @author Steven Biro
 */
public class Car {
    private String make2,model2,colour2;
    private int price2, year2, yearbought2;
    public Car() {
    make2="unknown";
    model2="unknown";
    colour2="unknown";
    price2=0;
    year2=0;
    yearbought2=0;
}
   public Car(String make, String model, String colour, int price, int year, int yearbought) {
    make2=make;
    model2=model;
    colour2=colour;
    price2=price;
    year2=year;
    yearbought2=yearbought;
   } 
    public Car(String make, String model, String colour, int year) {
    make2=make.toUpperCase();
    model2=model;
    colour2=colour;
    if ((make2.equals("BMW"))||(make2.equals("PORSCHE"))||(make2.equals("JAGUAR"))||(make2.equals("MERCEDES BENZ"))||(make2.equals("BENTLEY"))||(make2.equals("ROLLS ROYCE"))||(make2.equals("BUGATTI"))) {
      price2=130000;  
    } else {
        price2=30000;
    }
    year2=year;
    yearbought2=0;  
    }
    public String toString(){
        String output;
        if (yearbought2!=0){
      output= "A "+colour2+" "+year2+" "+make2+" "+model2+" was worth "+price2+" when it was bought in "+yearbought2+".";
        } else if (year2!=0) {
      output= "A "+colour2+" "+year2+" "+make2+" "+model2+" is worth "+price2+".";
        } else {
            output= "A black HONDA Civic is worth $15750.";
        }
      return output;
    }
    public void Honk() {
        JOptionPane.showMessageDialog(null,"Beep beep!");
    }
}
