package adivinaelnumero;

import javax.swing.JOptionPane;
import java.util.Random;

public class AdivinaElnumero {

    public static void main(String[] args) {

        Random ran = new Random();
        int aletorio = ran.nextInt(100) + 1;
        int numero1 = 0, i = 0;
        boolean ganaste = false;

        JOptionPane.showMessageDialog(null, "Quieres descurir el numero secreto? \nEl numero secreto esta en el rango de 1 al 100.");

        do {

            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu numero para descubrir el numero secreto: "));

            if (numero1 > 1 && numero1 <= 100) {
                i++;
                if (numero1 < aletorio) {
                    JOptionPane.showMessageDialog(null, "Intento " + i + "\nEl numero secreto es MAYOR al que ingresaste");
                } else if (numero1 > aletorio) {
                    JOptionPane.showMessageDialog(null, "Intento " + i + "\nEl numero secreto es MENOR al que ingresaste");
                } else if (numero1 == aletorio) {
                    ganaste = true;
                }

            } else {
                JOptionPane.showMessageDialog(null, "El numero que ingreso esta fuera del rango vuelve a intentarlo!");
            }

        } while (i < 3 && ganaste == false);

        if (ganaste == true) {
            JOptionPane.showMessageDialog(null, "Felicidades has adivinado el numero secreto: " + aletorio + "\nEn " + i + " intentos");
        } else {
            JOptionPane.showMessageDialog(null, "Perdiste el numero secreto es: " + aletorio);
        }
    }

}
