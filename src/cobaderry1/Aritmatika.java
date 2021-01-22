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
public class Aritmatika {
     public static void main(String[] args){
        double a= 100;
        double b= 23;
        
        double tambah = a/b;
        
        float a1= 100;
        float b1= 23;
        
        float bagi = a1/b1;
        
        String kata = "ini kata 901!!@#23";
        char karakter = '8';
        
        int x= 100;
        int y= 23;
        
        int integer = x/y;
        
        int p= 100;
        int q= 20;
        int modulusPQ = p%q;
        int modulusXY = x%y;
        
        System.out.println("hasil bagi int = "+integer);
        System.out.println("hasil bagi double = "+tambah);
        System.out.println("hasil bagi modulus p%q = "+modulusPQ);
        System.out.println("hasil bagi modulus x%y = "+modulusXY);
        System.out.println("hasil bagi float = "+bagi);
        System.out.println("hasil bagi string = "+kata);
        System.out.println("hasil bagi char = "+karakter);
    }
}


