/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry.Polimorfisme;

/**
 *
 * @author DeJoPe
 */
public class Penyanyi {
   
    	String nama="Unkown";
    public Penyanyi() {
  	 System.out.println("Nama Penyanyinya null");
}
    public Penyanyi(String nama) {
   	 System.out.println("Nama Penyanyinya: "+nama);
}
    public String nama(String nama) {
    return this.nama=nama;
}
    protected void gendre(String gendre) {
    	System.out.println("Gendre-nya: umum");
}
}

