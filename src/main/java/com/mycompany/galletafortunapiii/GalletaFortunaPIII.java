/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.galletafortunapiii;

import java.util.ArrayList;
public class GalletaFortunaPIII {
      public static void main(String[] args) {
        
        //se crea la lista
        ArrayList fortuna = new ArrayList();
        
        //la fortuna que te puede tocar
        fortuna.add("El unico modo de hacer un gran trabajo, es amar lo que haces");
        
        fortuna.add("tu actitud, no tu aptitud determinará tu altitud");
        
        fortuna.add("La felicidad no ocurre por casualidad, sino por eleccion");
        
        fortuna.add("Lo diligencia es la madre del exito");
        

        int f = (int) (Math.random() *4);
        
        //con este codigo imprimiremos los que la fortuna nos dice
        System.out.println("Tu fortuna dice: "+fortuna.get(f));
     }
    
}
