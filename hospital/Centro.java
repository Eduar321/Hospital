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
public class Centro {
    private String nombreCentro;
    private String Direccion;

    public Centro() {
    }

    public Centro(String nombreCentro, String Direccion) {
        this.nombreCentro = nombreCentro;
        this.Direccion = Direccion;
    }
    
    public void mostarCentro(){
        Scanner u =new Scanner(System.in);
        String j;
        String i;
        System.out.println("Nombre del centro: ");
        j=u.nextLine();
        System.out.println("Drireccion: ");
        i=u.nextLine();
        
        System.out.println("NOmbre del centro: "+j+"  Direccion: "+i);
                
    }
}
