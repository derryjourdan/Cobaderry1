/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry.ClassCasting;

/**
 *
 * @author DeJoPe
 */
public class TestMobil {
    Mobil mobil1;
    public TestMobil(){
        mobil1 = new MobilBalap();
        MobilBalap mobil2 = (MobilBalap) mobil1;
    }
    public static void main(String[]args) {
        TestMobil testMobil = new TestMobil();
    }
}
 

