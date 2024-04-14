/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1git;

import java.util.Scanner;

/**
 *
 * @author esther
 */
public class Practica1GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        double num1;
        double num2;
        String operacion;
        boolean comprobar = false;

        do {

            System.out.println("\n Introdueix el primer numero. ");
            num1 = sc.nextDouble();

            System.out.println("\n Introdueix el primer numero. ");
            num2 = sc.nextDouble();

            do {
                System.out.println("\n Operació? (Indica el signe)");
                System.out.println("+ = sumar \n - = restar \n"
                        + " x = multiplicar \n / = dividir \n * = elevar primer num al segon num."
                        + "\n % = residu");
                operacion = sc.nextLine();
                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                        || operacion.equals("X") || operacion.equals("/") || operacion.equals("%")
                        || operacion.equals("*")) {
                    comprobar = true;
                } else {
                    comprobar = false;
                }
            } while (comprobar != true);

            do {
                comprobar = true;
                switch (operacion) {
                    case "+":
                        resultado = num2 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "x":
                    case "X":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.err.println(" Al denominador hi ha un zero \n"
                                    + "per a  evitar errors coloca un altre valor.");
                        } else {
                            resultado = num1 / num2;
                        }
                        break;
                    case "*":
                        resultado = Math.pow(num1, num1);
                        break;
                    case "%":
                        if (num2 == 0) {
                            System.err.println(" Al denominador hi ha un zero \n"
                                    + "per a  evitar errors coloca un altre valor.");
                        } else {
                            resultado = num1 % num2;
                        }
                        break;
                }

            } while (comprobar != true);

            System.out.println("\nResultado: " + num1 + " " + operacion + " " + num2 + " = " + resultado);

            System.out.println("\n¿Quieres continuar operando? (s/n):");

        } while (sc.nextLine()
                .equalsIgnoreCase("s"));
    }
}
