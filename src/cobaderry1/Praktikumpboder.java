/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpboder;

import java.util.Scanner;

/**
 *
 * @author farkh
 */
public class Praktikumpboder {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int daftar;
        System.out.println("Menu Pilihan : \n1. Perhitungan Faktorial(for)");
        System.out.println("2. Perhitungan Nilai Genap");
        System.out.println("3. Perhitungan Nilai Ganjil");
        System.out.println("4. Deret Bilangan Prima");
        System.out.println("5. Deret Fibonacci");
        System.out.print("Masukkan Pilihan : ");
        daftar=input.nextInt();
        switch(daftar){
            case 1:
                System.out.print("Masukkan Bilangan : ");
                int fk = input.nextInt();
                int hasil = 1;
                for(int i=1;i<=fk;i++){
                    hasil=hasil*i;
                    if(i==fk){
                        System.out.print(i+" = "+hasil);          
                    }
                    else{
                        System.out.print(i+"X");
                    }
                }
                System.out.println("\nDerry Jourdan (19104410017)");
                break;
            case 2:
                int bil2;
                System.out.print("Masukkan Bilangan : ");
                bil2=input.nextInt();
                if(bil2%2==0){
                    System.out.print(bil2+ " Merupakan bilangan Genap");
                }
                else{
                    System.out.print("Input yang anda masukkan tidak termasuk bilangan Genap");
                }
                System.out.println("\nDerry Jourdan (19104410017)");
                break;
            case 3:
                int bil3;
                System.out.print("Masukkan Bilangan : ");
                bil3=input.nextInt();
                if(bil3%2==1){
                    System.out.print("Bilangan (3"+bil3+") Merupakan Bilangan Ganjil");
                }
                else{
                    System.out.println("Input yang anda masukkan tidak termasuk bilangan Ganjil");
                }
                System.out.println("\nDerry Jourdan (19104410017)");
                break;
            case 4:
                System.out.print("Masukkan Nilai akhir Bilangan Prima: ");
                int angka = input.nextInt();
                for (int a=2;a<=angka;a++){
                    int mod=1;
                    for(int b=2;b<a;b++){
                        if(a%b==0){
                            mod=0;
                        }
                    }
                    if(mod==1){
                        System.out.print(a+ " ");
                    }
                }
                System.out.println("\nDerry Jourdan (19104410017)");
                break;
            case 5:
                System.out.print("Masukkan Banyak Bilangan yang akan ditampilkan : ");
                int batas = input.nextInt();
                long fib[] = new long[batas];
                fib[0]=0;
                fib[1]=1;
                
                for (int i = 2; i < batas; i++){
                    fib[i] = fib[i-1]+fib[i-2];
                }
                for (int i = 0; i< batas;i++){
                    System.out.print(fib[i] + " ");
                }
                System.out.println("\nDerry Jourdan (19104410017)");
                break;
        }
    }
}

