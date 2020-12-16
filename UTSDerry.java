package utsderry;

import java.util.Scanner;

public class UTSDerry {
    public static void main(String[]args){
        int menu;
        String ulang = "Y";
        Scanner key = new Scanner(System.in);
        while(ulang.equals("Y")){
            String ul=" ",lagi;
        System.out.print("Menu Pilihan : \n 1. Deret bilangan habis 3 dan 5 \n 2. Deret bilangan Prima \n 3. Deret bilangan Fibonacci");
        System.out.print("\n \nMasukkan Pilihan : ");
        menu = key.nextInt();
        
        switch(menu){
            case 1:
                    int min,max;
                    int count = 0;
                    System.out.print("Nilai awal: ");
                    min = key.nextInt();
                    System.out.print("Nilai akhir: ");
                    max = key.nextInt();
                    for (int i = min; i <= max; i++){
                        if (i % 3 == 0 || i % 5 == 0){
                            System.out.println(" "+i);
                            count += i;
                        }
                        else{ 
                        }
                    }
                    System.out.println("Hasil Penjumlahan semua angka yang habis dibagi 3 dan 5 \nyang berada antara "+ min + "-" + max + " adalah " + count);
                break;
            case 2:
                System.out.print("Masukkan Nilai Akhir Bilangan Prima : ");
                int angka = key.nextInt();
                for(int b = 2; b <= angka; b++){
                    int mod = 1;
                    for(int c = 2; c < b; c++){
                        if (b % c == 0){
                            mod = 0;
                        }
                    }
                    if (mod == 1){
                        System.out.print(b+" ");
                    }
                }
                break;
            case 3:
                int input;
                System.out.print("Masukkan Jumlah deret Fibonacci : ");
                input = key.nextInt();
                long fib [] = new long [input];
                
                fib[0] = 0;
                fib[1] = 1;
                
                for(int i = 2; i < input; i++){
                    fib[i] = fib [i-1] + fib [i-2];
                }
                for(int i = 0; i < input; i++){
                    System.out.print(fib[i]+" ");
                }
                break;
            default:
                System.out.println("Pilihan Anda salah !!!!");
            }
            System.out.println("Apakah anda ingin mengulang  [Y/T] ??");
                ulang = key.next();
        }
    }
}
