/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayanimales;

import java.util.ArrayList;


/**
 *
 * @author BraYan
 */
public class Arrayanimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         ArrayList<clsanimal> animal = new ArrayList<clsanimal>();
         
         clsanimal anim1 = new clsanimal(, "toro", clsanimal.verin.vertebrados);
        
        
        clsanimal anim2 = new clsanimal(2, "mosca", clsanimal.verin.invertebrados);
        clsanimal anim3 = new clsanimal(1, "gato", clsanimal.verin.vertebrados);
        clsanimal anim4 = new clsanimal(2, "araña", clsanimal.verin.invertebrados);
        clsanimal anim5 = new clsanimal(1, "perro", clsanimal.verin.vertebrados);
        
        clsanimal anim6 = new clsanimal(3, "vaca", clsanimal.ovima.mamiferos);
         clsanimal anim7 = new clsanimal(4, "aguila", clsanimal.ovima.oviparos);
          clsanimal anim8 = new clsanimal(3, "ballena", clsanimal.ovima.mamiferos);
           clsanimal anim9 = new clsanimal(4, "pez", clsanimal.ovima.oviparos);
            clsanimal anim10 = new clsanimal(3, "oveja", clsanimal.ovima.mamiferos);
        
        
        animal.add(anim1);
         animal.add(anim2);
          animal.add(anim3);
           animal.add(anim4);
            animal.add(anim5);
             animal.add(anim6);
              animal.add(anim7);
               animal.add(anim8);
                animal.add(anim9);
                 animal.add(anim10);
        
        imprimir(animal);
        
    
    }
    
     public static void imprimir(ArrayList<clsanimal> anim) {
         
         for (clsanimal animal : anim) {
             
             System.out.println("*************************");
             System.out.println("Id: "  + animal.Id());
             System.err.println("Nombre:" + animal.Nombre());
             System.out.println("Valor: " + animal.Valor());
             System.err.println("Apareamiento: " +animal.Apareamiento());
              System.err.println("Peso: " +animal.Peso());
               System.err.println("Verin: " +animal.Verin());
                System.err.println("Ovima: " +animal.Ovima());
             System.out.println("");
             
         }
        
    }
    
    
}
