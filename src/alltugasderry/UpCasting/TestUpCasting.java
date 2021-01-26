/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry.UpCasting;

/**
 *
 * @author DeJoPe
 */
public class TestUpCasting {
  
    public TestUpCasting() {
        GalaxyNote galaxyNote = new GalaxyNote();
        Smarthphone smarthphone = (Smarthphone) galaxyNote;
        smarthphone.versi();
    }
    public static void main(String[]args){
        TestUpCasting testUpCasting = new TestUpCasting();
    }
}


