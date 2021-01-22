/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry.LatihanDerry;

/**
 *
 * @author DeJoPe
 */
public class ContohMethod {
  
    Void namaBarang (String inputNama){
        System.out.println("NamaBarang: "+inputNama);
        return null;
    }
    
    double hargaBarang (double inputHarga){
        System.out.println("Harganya: "+inputHarga+" juta");
        return 0;
    }
    public static void main(String[]args){
        ContohMethod contohMethod = new ContohMethod();
        contohMethod.namaBarang("Samsung Gear");
        contohMethod.hargaBarang(3.8);
    }
}

