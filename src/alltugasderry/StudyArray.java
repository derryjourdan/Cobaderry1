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
public class StudyArray {
   
    
    private static int i;
    public static void main(String[]args){
        
        //mendeklarasikan perintah (array)
        String nama[] = {"Ani", "Tono", "Budi"};
        int tugas[] = {50,70,89};
        int uts[] = {60,75,90};
        int uas[] = {70,87,90};
        float rata2;
        char grade;
        
        //Membuat tampilan output
        System.out.println("==================Nilai Rata-Rata Mahasiswa==================");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Nama\t" + "Tugas\t" + "UTS\t" + "UAS\t" + "Rata-Rata\t" + "Grade\t");
        System.out.println("------------------------------------------------------------------");
        
        //perulangan for (rumus data array)
        for(i = 0;i<nama.length; i++){
            rata2 = ((tugas[i] + uts[i] + uas[i])/3);
            
            //confitional if-else
            if (rata2 >= 80 && rata2 <= 100){
                grade = 'A';
            }
            else if (rata2 > 70 && rata2 < 80){
                grade = 'B';
            }
            else if (rata2 > 60 && rata2 < 70){
                grade = 'C';
            }
            else if (rata2 > 50 && rata2 < 60){
                grade = 'D';
            }
            else {
                grade = 'E';
            }
            //Menampilkan Hasil Akhir
            System.out.print(nama[i]+"\t ");
            System.out.print(tugas[i]+"     ");
            System.out.print(uts[i]+"       ");
            System.out.print(uas[i]+"       ");
            System.out.print(rata2+"            ");
            System.out.println(grade+"");
        }
        System.out.println("--------------------------------------------------------------");
    }
}

