/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry;

import java.util.Scanner;

/**
 *
 * @author DeJoPe
 */
public class NewClass {
      public static void main(String[] args) {
        boolean cek = true;
        String jawab;
        do {
            int min, max;
            int count = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Nilai awal: ");
            min = input.nextInt(); 
            System.out.print("Nilai akhir: ");
            max = input.nextInt();
            for (int i = min; i <= max; i++) {
                if (i % 3 == 0 || i % 7 == 0) {
                    System.out.println(" " + i);
                    count += i;
                }
                else{
                    
                }
            }
            System.out.println("hasil penjumlahan semua angka yang habis dibagi 3 dan 7 \nyang berada diantara " + min + "-" + max + " adalah " + count);
            System.out.println("==========================================");
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/T]> ");
            jawab = input.next();
            if (jawab.equalsIgnoreCase("Y")) {
                cek = false;
            }
        } while (cek);
    }

}

