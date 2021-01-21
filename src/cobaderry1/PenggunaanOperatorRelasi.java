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
public class PenggunaanOperatorRelasi {
    public static void main(String[]args){
        
        int a = 15;
        int b = 30;
        
        boolean isLb = a>b;
        boolean isLk = a<b;
        boolean isLbs = a>=b;
        boolean isLks = a<=b;
        boolean isNot = a!=b;
        
        System.out.println(a+" > "+b+" "+isLb);
        System.out.println(a+" < "+b+" "+isLk);
        System.out.println(a+" >= "+b+" "+isLbs);
        System.out.println(a+" <= "+b+" "+isLks);
        System.out.println(a+" != "+b+" "+isNot);
        
    }
    
}

