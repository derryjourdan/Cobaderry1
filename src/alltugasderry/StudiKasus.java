/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry;

import javax.swing.JOptionPane;

/**
 *
 * @author DeJoPe
 */
public class StudiKasus {
    
    
    public static void main(String[]args){
        String hasil;
        String nilai1 = " ";
        nilai1 = JOptionPane.showInputDialog("Nilai1= ");
        double a = Integer.parseInt(nilai1);
        String nilai2 = " ";
        nilai2 = JOptionPane.showInputDialog("Nilai2= ");
        double b = Integer.parseInt(nilai2);
        double nilai = (a+b)/2;
        if(nilai >=78){
            hasil = "Nilai anda Baik";
        }
        else if ((nilai >=50)&&(nilai<=78)){
            hasil = "Nilai anda Cukup";
        }
        else {
            hasil = "Nilai anda Buruk";
        }
        String msg = ("Hasil nilai Anda: "+nilai+"\nGrade : "+hasil);
        System.out.println(msg);
    }
}

