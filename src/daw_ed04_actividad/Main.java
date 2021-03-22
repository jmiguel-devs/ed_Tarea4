/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        String nombreCuenta;
        
        cuenta1 = new CCuenta("Juan Gutiérrez","1300-2665-85-4433221144",2500,0);
        saldoActual = cuenta1.estado();
        nombreCuenta = cuenta1.getNombre();
                
        System.out.println("El saldo actual " + nombreCuenta + " es "+ saldoActual );

        opera(cuenta1, 250, 1000);
    }

    public static void opera(CCuenta cuenta1, float cantRetirar, float cantIngresar) {
        try {
            cuenta1.retirar(cantRetirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantIngresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
