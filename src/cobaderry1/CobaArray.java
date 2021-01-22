/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaderry1;

/**
 *
 * @author DeJoPe
 */
public class CobaArray {
  
    public static void main(String[] args) {
        String [][] isian = {
            {"Ani","50","60","70"},
            {"Budi","70","60","50"},
            {"Candra","90","90","70"}
        };
        
        for (String[] ian : isian) {
            System.out.println("Nama: " + ian[0]);
            System.out.println("Tugas: " + ian[1]);
            System.out.println("UTS: " + ian[2]);
            System.out.println("UAS: " + ian[3]);
            int tugas, uts, uas;
            float rata2=0;
            tugas = Integer.parseInt(ian[1]);
            uts = Integer.parseInt(ian[2]);
            uas = Integer.parseInt(ian[3]);
            rata2=(tugas+uts+uas)/3;
            System.out.println("Nilai rata2= "+rata2);
            if (rata2>80 && rata2<=100){
                System.out.println("Nilai huruf = A");
            }
            else if (rata2>70 && rata2<=80){
                System.out.println("Nilai huruf = B");
            }
            else if (rata2>60 && rata2<=70){
                System.out.println("Nilai huruf = C");
            }
            else if (rata2>50 && rata2<=60){
                System.out.println("Nilai huruf = D");
            }
            else if (rata2>0 && rata2<=50){
                System.out.println("Nilai huruf = E");
            }
            else{
                System.out.println("nilai ngaaco!");
            }
        }
    }
} 

