/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

;

/**
 *
 * @author Usuario
 */
public class Main {
  
    public static void main(String[] args) {
       Paciente p=new Paciente();
       Medico m=new Medico();
       Centro c =new Centro();
       System.out.println("Vamos a registar un paciente: ");
       p.registroPaci();
       m.maedico();
       c.mostarCentro();
       
       
       
      
    }
   
   
  
        
}

