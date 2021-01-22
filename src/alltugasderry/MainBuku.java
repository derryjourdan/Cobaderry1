/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alltugasderry;

/**
 *
 * @author DeJoPe
 */
public class MainBuku {
  
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        String judul;
        String nama_pengarang;
        String penerbit;
        String tahun_cetak ;
        String kategori ;
        
        Buku Buku_Novel = new Buku();
        System.out.println("|===========================|");
        System.out.println("|         Buku Novel        |");
        System.out.println("|===========================|");
        Buku_Novel.judul = " ";
        System.out.print("Masukkan Judul : ");
        judul = input.nextLine();
        Buku_Novel.nama_pengarang = " ";
        System.out.print("Masukkan Nama Pengarang : ");
        nama_pengarang = input.nextLine();
        Buku_Novel.penerbit = " ";
        System.out.print("Masukkan Penerbit : ");
        penerbit = input.nextLine();
        Buku_Novel.tahun_cetak = " ";
        System.out.print("Masukkan Tahun Cetak : ");
        tahun_cetak = input.nextLine();
        Buku_Novel.kategori = " ";
        System.out.print("Masukkan Kategori : ");
        kategori = input.nextLine();
        
        System.out.println("---------------------------");
        System.out.println("Judul          : " + judul);
        System.out.println("Nama Pengarang : " + nama_pengarang);
        System.out.println("Penerbit       : " + penerbit);
        System.out.println("Tahun Cetak    : " + tahun_cetak);
        System.out.println("Kategori       : " + kategori);
        System.out.println("\n");
        
        Buku Buku_Manga = new Buku();
        System.out.println("|===========================|");
        System.out.println("|         Buku manga        |");
        System.out.println("|===========================|");
        Buku_Manga.judul = " ";
        System.out.print("Masukkan Judul : ");
        judul = input.nextLine();
        Buku_Manga.nama_pengarang = " ";
        System.out.print("Masukkan Nama Pengarang : ");
        nama_pengarang = input.nextLine();
        Buku_Manga.penerbit = " ";
        System.out.print("Masukkan Penerbit : ");
        penerbit = input.nextLine();
        Buku_Manga.tahun_cetak = " ";
        System.out.print("Masukkan Tahun Cetak : ");
        tahun_cetak = input.nextLine();
        Buku_Manga.kategori = " ";
        System.out.print("Masukkan Kategori : ");
        kategori = input.nextLine();
        
        System.out.println("---------------------------");
        System.out.println("Judul          : " + judul);
        System.out.println("Nama Pengarang : " + nama_pengarang);
        System.out.println("Penerbit       : " + penerbit);
        System.out.println("Tahun Cetak    : " + tahun_cetak);
        System.out.println("Kategori       : " + kategori);
        System.out.println("\n");
        
        Buku Buku_Fotografi = new Buku();
        System.out.println("|===========================|");
        System.out.println("|        Buku Fotografi       |");
        System.out.println("|===========================|");
        Buku_Fotografi.judul = " ";
        System.out.print("Masukkan Judul : ");
        judul = input.nextLine();
        Buku_Fotografi.nama_pengarang = " ";
        System.out.print("Masukkan Nama Pengarang : ");
        nama_pengarang = input.nextLine();
        Buku_Fotografi.penerbit = " ";
        System.out.print("Masukkan Penerbit : ");
        penerbit = input.nextLine();
        Buku_Fotografi.tahun_cetak = " ";
        System.out.print("Masukkan Tahun Cetak : ");
        tahun_cetak = input.nextLine();
        Buku_Fotografi.kategori = " ";
        System.out.print("Masukkan Kategori : ");
        kategori = input.nextLine();
        
        System.out.println("---------------------------");
        System.out.println("Judul          : " + judul);
        System.out.println("Nama Pengarang : " + nama_pengarang);
        System.out.println("Penerbit       : " + penerbit);
        System.out.println("Tahun Cetak    : " + tahun_cetak);
        System.out.println("Kategori       : " + kategori);
    }
}



