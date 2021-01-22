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
public class NilaiAkhir {
  
    
    public static void main(String[]args){
        String name = " ",nim=" ",uts=" ",uas=" ";
        
        // input
        name = JOptionPane.showInputDialog("Masukkan Nama : ");
        nim = JOptionPane.showInputDialog("Masukkan NIM : ");
        uts = JOptionPane.showInputDialog("Masukkan Nilai UTS : ");
        uas = JOptionPane.showInputDialog("Masukkan Nilai UAS : ");
        
        double nilaiuts = Integer.parseInt(uts);
        double nilaiuas = Integer.parseInt(uas);
        
        // Proses(Hitung rata-rata)
        double nilai_akhir = nilaiuts*0.3+nilaiuas*0.7;
        
        // Proses (tentukan grade)
        String gr = " ";
        if( (nilai_akhir>=90.1)&&(nilai_akhir<=100)){
            gr="Grade       : A" + " \n" + "Kelulusan   : Lulus"; 
        }
        else if( (nilai_akhir>=80.1)&&(nilai_akhir<=90)){
            gr="Grade       : B" + " \n" + "Kelulusan   : Lulus";
        }
        else if ( (nilai_akhir>=70.1)&&(nilai_akhir<=90)){
            gr="Grade       : C" + " \n" + "Kelulusan   : Lulus";
        }
        else if ((nilai_akhir>=50)&&(nilai_akhir<=70)){
            gr="Grade       : D" + " \n" + "Kelulusan   : Tidak Lulus";
        }
        else {
            gr="Grade       : E" + " \n" + "Kelulusan   : Tidak Lulus";
        }
        //Output
        String akhir = ("Nama        : "+name+ "\nNIM         : "+nim+ "\nNilai UTS   : "+uts+ "\nNilai UAS   : "+uas+"\nNilai Akhir : "+nilai_akhir+"\n"+gr);
        System.out.println(akhir);
    }
}

