/*  Program berisi 3 class yang masing-masing memiliki tujuan yang berbeda
    Class 1 berfungsi untuk menghitung segitiga
    Class 2 berisi untuk membuat game tictactoe sederahana
    Class 3 berfungi untuk -*/
package studikasus25januari;

public class FiskahSyela9XR2 {


    public static void main(String[] args) {
        /*Menampilkan class 1
          membuat objek*/          
        Class1 segitiga = new Class1 ();
        //memanggil void method pilihan untuk menghitung
        segitiga.pilihanSegitiga();
         /*Menampilkan class 2
          membuat objek*/  
         Class2 pengguna1 = new Class2();
         pengguna1.menu();
         /*Menampilkan class 3
          membuat objek*/    
        Class3 TTT = new Class3 ();
        //memanggil method menyapa untuk menjalankan program
        TTT.menyapa();
      
    }

}
