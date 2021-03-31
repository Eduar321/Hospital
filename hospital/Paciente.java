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
public class Paciente {
    private String nombre;
    private String apellido;
    private String sexo;
    private String medicoQueLoAtendio;
    private String motivoConsulta;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String sexo, String medicoQueLoAtendio, String motivoConsulta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.medicoQueLoAtendio = medicoQueLoAtendio;
        this.motivoConsulta = motivoConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMedicoQueLoAtendio() {
        return medicoQueLoAtendio;
    }

    public void setMedicoQueLoAtendio(String medicoQueLoAtendio) {
        this.medicoQueLoAtendio = medicoQueLoAtendio;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }
     public void registroPaci(){
        Scanner nuevo= new Scanner(System.in);
        String a;
        String b;
        String h;
        String d;
        String e;
        System.out.println("Nombre paciente: ");
        a=nuevo.nextLine();
        System.out.println("Apellido paciente: ");
        b=nuevo.nextLine();
        System.out.println("Sexo paciente: ");
        h=nuevo.nextLine();
        System.out.println("Medico que lo atendio: ");
        d=nuevo.nextLine();
        System.out.println("Motivo de consulta: ");
        e=nuevo.nextLine();
       System.out.println("Nombre: "+a+"  Apellido: "+b+"  sexo: "+h+"  Medico que lo atendio:"+d+"  Motivo de consulta: "+e);
        
     
    }
       
    
    
}
