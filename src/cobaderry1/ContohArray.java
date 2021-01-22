/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaderry1;

import javax.swing.JOptionPane;

/**
 *
 * @author DeJoPe
 */
public class ContohArray {
  
    
    @SuppressWarnings("empty-statement")
    public static void main(String []args){
        int counter=0;
        int harga[] = new int[2];
        
        do{
            String input =JOptionPane.showInputDialog("Masukkan harga");
            harga[counter]=Integer.parseInt(input);
            counter++;
        }
        while(counter<harga.length);
        
        for(int i=0;i<harga.length;i++);
        
        for(int i=0;i<harga.length;i++){
            System.out.println("Harga barang ke"+i+" adalah Rp. "+harga[i]);
        }
        
    }
}


