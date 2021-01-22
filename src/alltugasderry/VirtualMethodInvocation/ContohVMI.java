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
public class ContohVMI {
 public static void main(String[]args){
     
        PersegiPanjang hitungLuas = new PersegiPanjang();
        System.out.println("Panjang : "+hitungLuas.panjang);
        System.out.println("Lebar : "+hitungLuas.lebar);
        hitungLuas.luas();
    }
}   

