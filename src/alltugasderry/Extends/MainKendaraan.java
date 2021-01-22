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
    public class MainKendaraan extends Kendaraan {
    
    @Override
    public void jalankan(){}
    
    @Override
    public void setMesin(String mesin){
        System.out.println("Besar mesin : "+mesin);
    }
    
    @Override
    public String getMesin(){
        return super.getMesin();
    }
    
    public static void main(String[]args){
        MainKendaraan mainKendaraan = new MainKendaraan();
        mainKendaraan.setMesin("150 cc");
        System.out.println(mainKendaraan.getMesin());
    }
}


