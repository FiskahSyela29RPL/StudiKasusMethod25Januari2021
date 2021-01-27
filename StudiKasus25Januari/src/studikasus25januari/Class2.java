/*  class yang berisi program banking sederhana
    */
package studikasus25januari;

import java.util.Scanner;

public class Class2 {
    Scanner in = new Scanner(System.in);
    //fields class 2
    int tabungan;
    int penarikanSebelumnya;
    String namaUser;
    String passUser;
    //membuat constructor
    //method yang pertama kali dipanggil saat objek dibuat
    
    //void menyapa agar user dapat memilih apakah mau menabung atau tidak
    void menyapa (){
        System.out.println("+===============================+");
        System.out.println("Mau menabung ? Y/N");
         String pilihan = in.nextLine();
         switch (pilihan){
             case "Y": 
             case "y":               
                    
                 break;
             case "N":
             case "n":
                 System.out.println("Sepertinya anda miskin");
                 System.out.println("Selamat melanjutkan kehidupan");
                 break;
             default:
                 break;
         }
    }
    //membuat method untuk menabung
    void menabung (int total) {
        if (total != 0) {
            tabungan =+  total;
            penarikanSebelumnya = total;
        }
    }
    
    //method untuk mengambil uang
    void penarikan (int total1){
        if (total1 != 0) {
            tabungan =- total1;
            penarikanSebelumnya = -total1;
        }
    }
    //method untuk menampilkan transaksi sebelumnya
   void transaksiSebelumnya() {
        //apabila transaksi positif, berrti menabung begitu sebalikya
        if ( penarikanSebelumnya> 0) {
            System.out.println("Anda menabung sebanyak: " + penarikanSebelumnya);
        } else if (penarikanSebelumnya < 0) {
            //math.abs adalah method untuk mengembalikan nilai absolute artinya tidak ada -
            System.out.println("Anda mengambil sebanyak: " + Math.abs(penarikanSebelumnya));
        } else {
            System.out.println("Anda tidak menabung");
        }
    }
    //method untuk menghitung bunga 
    void bunga(int tahun) {
        //bunga bank
        double bunga = 9.95;
        //[ertambahan bunga setelah beberapa tahun
        double bungaTabungan = (tabungan * bunga * tahun) + tabungan;
        System.out.println("Bunga bank anda " + (100 * bunga) + "%");
        System.out.println("Setelah" + tahun + " tahun, tabungan anda mencapai: " + bungaTabungan);
	}
    //method untuk menampilkan pilihhan 
    void menu() {
        System.out.println("Masukkan nama Anda : ");
        namaUser = in.nextLine();
        System.out.println("Masukkan Sandi  : ");
        passUser = in.nextLine();
        System.out.println("Halo, " + namaUser + "!");
        System.out.println("Password Anda: " + passUser);
        menyapa();
        int pilihan;
        do {
        String[ ] pilihanUser = {"Apa yang mau anda lakukan ", "1. Tabungan", "2. Menabung", "3. Menarik tabungan", "4. Transaksi Sebelumnya", "5. Bunga" ,"6. Keluar "};
            //perulangan for untuk menampilkan pilihan
            for (int i=0; i< pilihanUser.length; i++){
                    System.out.println(pilihanUser[i]);
            }
                System.out.print("Masukkan pilihan Anda: ");
                do {               
                System.out.println("Pilih angka 1-6");
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                pilihan = in.nextInt();
            } while ( pilihan> 6);
                switch(pilihan) {
                    case '1':                     
                        System.out.println("Tabungan anda adalah : Rp" + tabungan);
                        System.out.println(" ");
                        break;
                    case  '2' :
                        System.out.println("Masukkan  jumlah uang yang ingin ditabung ");
                        int total = in.nextInt();
                        menabung(total);
                        System.out.println(" ");
                        break;
                    case 3 :
                        System.out.println("Masukkan  jumlah uang yang ingin ditarik ");                        
                        int total1 = in.nextInt();
                        penarikan(total1);
                        System.out.println(" ");
                        break;
                    case 4 :
                        transaksiSebelumnya();
                        System.out.println(" ");
                        break;
                    case 5:
                        System.out.println("Berapa lama Anda menabung di bank ?");
                        int tahun = in.nextInt();
                        bunga(tahun);
                        break;
                    case 6 :
                        System.out.println("Silahkan melanjutkan hidup! " +namaUser);
                        System.out.println(" ");
                        break;
                    case 7:
                        System.out.println("Masukkan angka 1 - 6");
                }
            }while(pilihan != '6');
    } 
}



