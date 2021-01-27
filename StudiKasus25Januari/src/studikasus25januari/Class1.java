
package studikasus25januari;

import java.util.Scanner;
//class yang berisi method untuk menghitung segitiga
/*Berisi method void untuk
1. Menyapa user
2. Menghitung luas, keliling, tinggi dan alas*/

public class Class1 {
     //membuat scanner dan user memasukkan namanya       
    Scanner in = new Scanner(System.in);
    String menyapa;
    double alas, tinggi, luas, keliling, sisiA, sisiB, sisiC;
    int operasi;
    
    //method untuk menampilkan kode menyapa
    String  menyapa () {       
        System.out.print("Masukkan nama anda : ");
        menyapa = in.nextLine();  
        return menyapa;
    }
    
    
    //membuat method pilihan untuk user memilih
    void pilihanSegitiga () {
         System.out.println("Selamat Datang di Program Menghitung ");
         System.out.println("+===============================+");
         menyapa();
        //perulangan do while
         do {
            //array pilihan
            String[ ] pilihan = {"Pilihan", "1. Menghitung luas", "2. Menghitung keliling", "3. Menghitung tinggi", "4. Menghitung alas", "5. Keluar" ," "};
            //perulangan for untuk menampilkan pilihan
            for (int i=0; i< pilihan.length; i++){
                    System.out.println(pilihan[i]);
                }
         //menerima piliah user
            System.out.print("Pilihlah operasi menghitung yang anda inginkan, ");
            //agar program tidak error saat user memasukkan apapun selain angka 1-5
            do {               
                System.out.println("Pilih angka 1-5");
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                operasi = in.nextInt();
            } while (operasi > 5);
            //percabangan switchcase agar user mendapatkan operasi hitung yang diinginkan
            switch (operasi) {
                        case 1 : { //apabila user memilih no 1
                            luasSegitiga();
                            System.out.println("+===============================+");
                            break;
                        }                          
                        case 2 : { //apabila user memilih no 2
                           kelilingSegitiga();
                           System.out.println("+===============================+");
                            break;
                        }                            
                        case 3 : { //apabila user memilih no 3
                            tinggiSegitiga();
                            System.out.println("+===============================+");
                            break;
                        }                           
                        case 4 : { 
                            alasSegitiga();
                            System.out.println("+===============================+");
                            break;
                        }
                        case 5 : {
                            System.out.println("Silahkan melanjutkan hidup, " +menyapa);
                            break;
                        }
                        default : {
                            System.out.println("Masukkan angka 1-5");
                            break;
                        }
                }
            } while (operasi != 5);
         }
    
    //membuat method untuk mrnghitung luas segitiga
    void luasSegitiga (){
        System.out.print("Masukkan nilai alas segitiga :");
        //agar program tidak error, memasukkan nilai alas
        do {
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                alas = in.nextDouble();
            } while (alas< 0);
        
        System.out.print("Masukkan nilai tinggi segitiga :");
        //agar program tidak error, memasukkan nilai tinggi        
        do {
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                tinggi = in.nextDouble();
            } while (tinggi< 0);
        //menghitung nilai luas segitiga
        luas = 0.5*alas*tinggi;
        //menampilkan luas
        System.out.println("Nilai luas segitiga milik "+menyapa+"  adalah " +luas);
    }
    
    //membuat method untuk menghitung keliling
    void kelilingSegitiga(){
        System.out.print("Masukkan nilai sisi ke-1 segitiga :");
        do {
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                sisiA = in.nextDouble();
            } while ( sisiA< 0);
        System.out.print("Masukkan nilai sisi ke-2 segitiga :");
        do {
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                 sisiB = in.nextDouble();
            } while ( sisiB< 0);
        System.out.print("Masukkan nilai sisi ke-3 segitiga :");
        do {
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                sisiC = in.nextDouble();
            } while ( sisiC< 0);
        //menghitung nilai keliling
        keliling = sisiA+sisiB+sisiC;
        System.out.println("Nilai keliling segitiga milik "+menyapa+"  adalah " +keliling);       
    }
    
    //membuat method untuk menghitung tinggi segitiga
    void tinggiSegitiga(){
      System.out.print("Masukkan nilai alas segitiga :");
      do {
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                alas = in.nextDouble();
            } while ( alas< 0);
      System.out.print("Masukkan nilai luas segitiga :");
      do {
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                luas = in.nextDouble();
            } while ( luas< 0);
      tinggi = 2*luas/alas;
      System.out.println("Nilai tinggi segitiga milik "+menyapa+"  adalah " +tinggi);        
    }

    //membuat method untuk menghitung alas segitiga
    void alasSegitiga(){
        System.out.print("Masukkan nilai luas segitiga :");
        do {
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                luas = in.nextDouble();
            } while ( luas< 0);
        System.out.print("Masukkan nilai tinggi segitiga :");
        do {
                while (!in.hasNextInt()) {
                System.out.println("Tolong masukkan angka");
                in.next(); 
             }
                tinggi = in.nextDouble();
            } while (tinggi< 0);
        alas = 2*luas/tinggi;
        System.out.println("Nilai alas segitiga milik "+menyapa+"  adalah " +alas);        
    }
}