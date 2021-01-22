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
public class LetDoIt {
   
    static String uname;
    
    private void setUname(String farkhan){
        uname = farkhan;
    }
    
    public static void main(String[]args)
    {
        LetDoIt ldi = new LetDoIt();
        ldi.setUname("Let Do It");
        System.out.println(uname);
    }    
    
}


