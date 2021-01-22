/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry;

import java.util.Scanner;

/**
 *
 * @author DeJoPe
 */
public class DataPerson {
   
    public String nama = " ";
    public String prodi = " ";
    public String alamat = " ";
    public String nim = " ";
    public String no_telp = " ";
    
    public void FillData (String namaMHS, String nimMHS, String prodiMHS){
        this.nama = namaMHS;
        this.nim = nimMHS;
        this.prodi = prodiMHS;
    }
    public void FillData(String namaMHS, 
            String nimMHS,
            String prodiMHS,
            String alamatMHS, 
            String noMHS){
        this.nama = namaMHS;
        this.nim = nimMHS;
        this.prodi = prodiMHS;
        this.alamat = alamatMHS;
        this.no_telp = noMHS;
    }
    
    public void ShowData(){
        System.out.println("\n\n");
        System.out.println("=======================================");
        System.out.println("Nama Mahasiswa    : "+nama);
        System.out.println("NIM Mahasiswa     : "+nim);
        System.out.println("Prodi Mahasiswa   : "+prodi);
        System.out.println("Alamat Mahasiswa  : "+alamat);
        System.out.println("No_telp Mahasiswa : "+no_telp);
    }
    
    public static void main(String[] args){
        String Nama, NIM,Prodi, Alamat, No_Telp;
        Scanner key = new Scanner(System.in);
        DataPerson Data = new DataPerson();
        System.out.print("Masukkan Nama    : ");
        Nama = key.nextLine();
        System.out.print("Masukkan NIM     : ");
        NIM = key.nextLine();
        System.out.print("Masukkan Prodi   : ");
        Prodi = key.nextLine();
        System.out.print("Masukkan Alamat  : ");
        Alamat = key.nextLine();
        System.out.print("Masukkan No_Telp : ");
        No_Telp = key.nextLine();
        Data.FillData(Nama, NIM, Prodi, Alamat, No_Telp);
        Data.ShowData();
    }
}


