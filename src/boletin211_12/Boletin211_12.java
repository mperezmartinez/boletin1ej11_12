/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin211_12;

import java.util.Scanner;

/**
 *
 * @author mperezmartinez
 */
public class Boletin211_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      float soldo,ventas,comision,soldototal;
      int km, dias,transporte,dietas;
      
      System.out.println("Introduce Soldo Fixo :");
        Scanner dato=new Scanner(System.in);
        soldo=dato.nextFloat();
      
        System.out.println("Introduce Ventas :");
        
        ventas=dato.nextFloat();
        
       comision=(float) (ventas*0.05);
       
       System.out.println("Introduce Km recorridos :");
        
        km=dato.nextInt();
        
        transporte=km*2;
        
       System.out.println("Introduce Dias :");
        
        dias=dato.nextInt(); 
        
        dietas=dias*30;
        
       soldototal=soldo+comision+transporte+dietas; 
       
       System.out.println("SueldoBruto="+soldototal);
        
    }
    
}
