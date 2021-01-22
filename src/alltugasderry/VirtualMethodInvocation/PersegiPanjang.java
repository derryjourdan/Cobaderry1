/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry.VirtualMethodInvocation;

/**
 *
 * @author DeJoPe
 */
public class PersegiPanjang extends HitungLuas {

     int panjang = 20;
    int lebar = 10;
    
    @Override
    public void luas(){
        System.out.println("Luas : "+panjang*lebar);
    }
}

