/*
 *Fiskah Syela Aisy Aulia 
 * Saya akan membuat program untuk 
 */
package studikasus2;

import java.util.Scanner;

public class StudiKasus2 {

  
    public static void main(String[] args) {
            
        System.out.println("______________________________________");
        System.out.println("=== Selamat Datang di Tabungan Anda ===");        
        //objek input agar user dapat memasukkan pilihan
        Scanner input = new Scanner (System.in);
        //membuat variabel untuk memilih 
        int pilihanUser;
        //membuat objek baru, agar class bisa diakses
        atmTabungan tabungan = new atmTabungan();
            //perulangan do while agar program tetap dijalankan selama user tidak memilih 4
            do {
                //membuat array pilihan yang berisi pilihan yang bisa user lakukan
                String[ ] pilihan = {"Pilihan", "1. Menabung", "2. Mengambil Uang", "3. Jumlah Tabungan", "4. Keluar"};
                //perulangan for untuk menampilkan pilihan
                for (int i=0; i< pilihan.length; i++){
                    System.out.println(pilihan[i]);
                }
                //user memasukkan pilihannya
                System.out.println(" ");
                System.out.println("Masukkan Pilihan Anda :");
                pilihanUser = input.nextInt();
                
                //menjalankan method yang dipilih oleh user dengan percaabangan switch case
                switch (pilihanUser) {
                        case 1 : { //apabila user memilih no 1
                            tabungan.menabung ();
                            System.out.println(" ");
                        }
                            break;
                        case 2 : { //apabila user memilih no 2
                           tabungan.mengambil ();
                            System.out.println(" ");
                        }
                            break; 
                        case 3 : { //apabila user memilih no 3
                            System.out.print("Jumlah Tabungan Anda Kini :");
                            System.out.print(" Rp "+tabungan.TabunganAwal());
                            System.out.println(" ");
                        }
                            break;
                        default : {
                            System.out.println("Masukkan angka 1, 2, 3, atau 4");
                            System.out.println(" ");
                        }
                }
            } while (pilihanUser != 4);
  
    }
    
}

