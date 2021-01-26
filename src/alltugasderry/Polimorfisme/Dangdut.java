/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry.Polimorfisme;

/**
 *
 * @author DeJoPe
 */
    public class Dangdut extends Penyanyi {
    String nama="Via Vallen";
    @Override
    public String nama(String nama) {
        return this.nama=nama;
    }
    @Override
    protected void gendre(String gendre) {
    System.out.println("Gendre-nya: pop");
    }  
}


