/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry.MultipleInheritance;

/**
 *
 * @author DeJoPe
 */

    public class Toni extends Kakek implements AyahInterface, IbuInterface{
    
    @Override
    public void cetak(){
        AyahInterface.super.cetak();
        IbuInterface.super.cetak();
        super.cetak();
    }
    
    public static void main(String[]args){
        Toni toni = new Toni();
        toni.cetak();
    }
}


