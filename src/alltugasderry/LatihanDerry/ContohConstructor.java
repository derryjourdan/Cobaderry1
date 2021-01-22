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
public class ContohConstructor {
      public ContohConstructor(){
    }
    
    public ContohConstructor(int sisi) {
        System.out.println("Luas persegi: "+Math.pow(sisi, 2));
    }
    
    public ContohConstructor(int panjang, int lebar) {
        System.out.println("Luas persegi: "+panjang*lebar);
    }
    
    public static void main(String[]args){
        ContohConstructor persegi = new ContohConstructor(5);
        ContohConstructor persegi_panjang = new ContohConstructor(2, 8);
    }
}
