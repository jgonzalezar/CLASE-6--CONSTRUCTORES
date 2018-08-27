/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cuenta.global=50;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese su número de cuenta: ");
        int Cuenta= lectura.nextInt();
        System.out.println("Ingrese su Clave ");
        int clave= lectura.nextInt();
        
        System.out.println("Ingrese su Nombre ");
        String dueno=lectura.next();
        System.out.println("Ingrese su saldo ");
        double saldo = lectura.nextDouble();
        Cuenta cuenta = new Cuenta(Cuenta, clave, dueno, saldo);
        
        
        
       
    }
         
}
