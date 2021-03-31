/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Medico extends Paciente {
    private String nombre;
    private String apellido;
    private String cargo;

    public Medico() {
    }

    public Medico(String nombre, String apellido, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void maedico(){
        Scanner n= new Scanner(System.in);
        String z;
        String y;
        String o;
        System.out.println("Nombre del medico: ");
        z=n.nextLine();
        System.out.println("Apellido del medico: ");
        y=n.nextLine();
        System.out.println("Cargo del medico: ");
        o=n.nextLine();
        System.out.println("Nombre: "+z+"  Apellido: "+y+"Cargo medico: "+o);
    }
    
}
