/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry.Extends;

/**
 *
 * @author DeJoPe
 */
public class Kendaraan {
     String mesin;
    
    public String getMesin(){
        return mesin;
    }
    
    public void setMesin (String mesin){
        this.mesin = mesin;
    }
    
    public void jalankan(){
        System.out.println("Dimasukkan kopling");
    }
}


