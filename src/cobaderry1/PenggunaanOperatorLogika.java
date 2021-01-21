/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaderry1;

/**
 *
 * @author DeJoPe
 */
public class PenggunaanOperatorLogika {
   
    public static void main(String[]args){
        
        boolean a = true;
        boolean b = false;
        
        boolean isAnd = a&&b;
        boolean isOr = a||b;
        boolean isNotA = !a;
        boolean isNotB = !b;
        
        System.out.println(a+" AND "+b+" = "+isAnd);
        System.out.println(a+" OR "+b+" = "+isOr);
        System.out.println("not a "+b+" = "+isNotA);
        System.out.println("not b "+b+" = "+isNotB);
        
    }
}

