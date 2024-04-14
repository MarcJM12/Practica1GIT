package practica1git;

import java.util.Scanner;

public class Practica1GIT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        do {
            System.out.println("\nIntroduce el primer número:");
            double num1 = obtenerNumero(sc);
           
            System.out.println("\nOperación? (+, -, x, /, *, %):");
            String operacion = obtenerOperacion(sc);
           
            System.out.println("\nIntroduce el segundo número:");
            double num2 = obtenerNumero(sc);
           
            double resultado = calcularResultado(num1, num2, operacion);
           
            System.out.println("\nResultado: " + num1 + " " + operacion + " " + num2 + " = " + resultado);
           
            System.out.println("\n¿Quieres continuar operando? (s/n):");
        } while (sc.nextLine().equalsIgnoreCase("s"));
    }
   
    public static double obtenerNumero(Scanner sc) {
        while (true) {
            String input = sc.nextLine();
            if (input.matches("[+-]?[\\d]*[.]?[\\d]+")) {
                return Double.parseDouble(input);
            } else {
                System.err.println("\nError: Ingresa un número válido.");
            }
        }
    }
   
    public static String obtenerOperacion(Scanner sc) {
        while (true) {
            String operacion = sc.nextLine();
            if (operacion.matches("[+\\-xX/*%]")) {
                return operacion;
            } else {
                System.err.println("\nError: Ingresa una operación válida (+, -, x, /, *, %).");
            }
        }
    }
   
    public static double calcularResultado(double num1, double num2, String operacion) {
        switch (operacion) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
            case "X":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                     System.out.println("Al denominador hi ha un zero per a  evitar errors coloca un altre valor un altre valor.");
                    return Double.NaN;
                }
                return num1 / num2;
            case "*":
                return Math.pow(num1, num2);
            case "%":
                if (num2 == 0) {
                    System.out.println("Al denominador hi ha un zero per a  evitar errors coloca un altre valor un altre valor.");
                   
                    return Double.NaN;
                }
                return num1 % num2;
            default:
                System.err.println("\nError: Operación no válida.");
                return Double.NaN;
        }
    }
}