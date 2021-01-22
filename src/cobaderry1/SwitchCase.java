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
public class SwitchCase {
   
    public static void main(String[]args){
        int a=100, b=25;
        int hasil;
        System.out.println("Menu Pilihan");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        String input = JOptionPane.showInputDialog("Masukkan pilihan");
        int pilihan = Integer.parseInt(input);
        switch(pilihan){
            case 1:
                hasil = a+b;
                System.out.println("Penjumlahan a:"+a+" + b:"+b+" = "+hasil);
                break;
            case 2:
                hasil = a-b;
                System.out.println("Pengurangan a:"+a+" - b:"+b+" = "+hasil);
                break;
            default:
                System.out.println("pilihan anda salah");        
        }
    }
}


