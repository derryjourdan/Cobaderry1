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
public class ContohClassdanObject {
    String warna;
    int roda;
    
    public static void main(String[]args){
        ContohClassdanObject toyota = new ContohClassdanObject();
        toyota.warna = "kuning";
        toyota.roda = 4;
        
        ContohClassdanObject honda = new ContohClassdanObject();
        honda.warna = "hijau";
        honda.roda = 6;
        
        System.out.println("Toyota berwarna : "+toyota.warna
                +" memiliki roda: "+toyota.roda);
        System.out.println("Honda berwarna  : "+honda.warna
                +" memiliki roda: "+honda.roda);
    }
}

