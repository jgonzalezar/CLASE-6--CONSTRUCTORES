/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numero;
    private int clave;
    private String dueno;
    private double saldo;
    public static int global;
    
    public Cuenta (int numero, int clave, String dueno, double saldo){
        this.numero = numero;
        this.clave = clave;
        this.dueno = dueno;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getClave() {
        return clave;
    }

    public String getDueno() {
        return dueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    public boolean consignar(double consignacion){
        if(consignacion > 0){
        saldo = saldo + consignacion;
        return true;
    }else{
            return false;
        }
   
    }
    public boolean retirar (double retiro){
        if(retiro>0 && retiro<this.saldo){
            saldo-=retiro;
            return true;
        }else{
            return false;
        }
    }
    public double ConsultarSalco(){
        return this.saldo;
    }
    public boolean cambiarClave(int claveNueva){
        if(claveNueva>1000 && claveNueva<9999){
            this.clave=claveNueva;
            return true;
        }
        return false;
    }
}
