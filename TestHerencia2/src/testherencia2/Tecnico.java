/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia2;

/**
 *
 * @author PC
 */
public class Tecnico extends Empleado {
    
    public Tecnico (String nombre){
        super(nombre);
    }
    public String toString(){
        return super.toString()+"-> Tecnico";
    }
}
