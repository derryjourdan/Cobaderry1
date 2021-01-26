/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry.DynamicBinding;

/**
 *
 * @author DeJoPe
 */
   public class MainMamalia {
    public static void main (String[]args){
        show(new Mamalia());
        show(new Sapi());
        show(new Limosin());
        show(new Brahman());
    }
    private static void show(Object obj){
        System.out.println(obj);
    }
}
 

